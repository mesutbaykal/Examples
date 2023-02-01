package Practices;

public class Methods {

    public static void main(String[] args) {
        System.out.println(cube(2));
        System.out.println(vowels("Mesut Baykal"));
        System.out.println(nextHour("11:19"));
        System.out.println(capitalize("java is cool. i LOVE to program. I want TO KEep Learning"));
    }

    public static int cube(int n){
        return n*n*n;
    }

    public static int vowels(String s){
        int count = 0;
        s=s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='o'||s.charAt(i)=='i'||s.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }

    public static int nextHour(String time){
        time  = time.replace(":","");
        int minutes=Integer.parseInt(time);
        minutes=60-(minutes%=100);

        return minutes;
    }

    public static String capitalize(String str){
        String [] sentence = str.split("\\. ");
        String fixed="";
        for (String each : sentence) {
            fixed+=each.substring(0,1).toUpperCase()+each.substring(1).toLowerCase()+". ";
        }
        return fixed.trim();
    }



}
