package Practices;

public class Palindrome {

    public static void main(String[] args) {

        int n = 1234321;
        int org = n;
        int reverse = 0;

        while (n>0){
            int lastDigit = n%10;
            reverse=reverse*10+lastDigit;
            n/=10;
        }

        if (org==reverse){
            System.out.println(org+" is palindrome");
        }else{
            System.out.println(org+" is not palindrome");
        }
    }
}
