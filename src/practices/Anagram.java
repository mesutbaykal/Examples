package practices;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        System.out.println(anagram("Listen","Silent"));

        System.out.println(anagram2("listen", "silent"));

    }

    public static boolean anagram(String str1, String str2){

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        if (str1.length()!=str2.length()){
            return false;
        }
        char[] ch1= str1.toCharArray();
        char[] ch2=str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);

    }

    public static boolean anagram2(String str1, String str2){

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        if (str1.length()!=str2.length()){
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            str2=str2.replaceFirst(str1.substring(i,i+1),"");
        }
        return str2.isEmpty();
    }
}
