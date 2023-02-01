package practices;

public class FreqOfCharacter {

    public static void main(String[] args) {

        String str = "aaaabcccdd";
        String result="";

        while (!str.isEmpty()){

            int origLenght =str.length();
            String currentChar = str.substring(0,1);
            str = str.replace(currentChar,"");
            result+=currentChar+(origLenght - str.length());

        }

        System.out.println(result);
    }
}
