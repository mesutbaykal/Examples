package Practices;// Find common chars between two String

public class FindCommonChars {

    public static void main(String[] args) {

        String str1="eo";
        String str2="hello";

        getCommon(str1,str2);

    }

    static void getCommon(String str1, String str2){
        String result="";

        if(str1.length()==0||str2.length()==0) {
            System.out.println("Invalid variable");
            return;
        }
        String shorter=str1.length() > str2.length() ? str2 : str1;

        String longer=shorter.equals(str1) ? str2 : str1;

        for (int i=0;i<shorter.length();i++){
            String c=Character.toString(shorter.charAt(i));
            if (longer.contains(c)&&Character.isLetter(c.charAt(0))){
                result+=c;
            }
        }
        System.out.println(result);
    }
}
