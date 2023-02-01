package practices;

public class ArmstrongNumber {

    public static void main(String[] args) {

        System.out.println(isArmstrong(153));
        System.out.println(isArmstrong(371));
        System.out.println(isArmstrong(9475));
        System.out.println(isArmstrong2(153));

    }

    public static boolean isArmstrong(int number){

        String num=String.valueOf(number);
        int power=num.length();
        int sum=0;

        for(int i=0;i<num.length();i++){
            int digit=Integer.parseInt(""+num.charAt(i));
            sum+=Math.pow(digit,power);
        }
        return number==sum;
    }

    public static boolean isArmstrong2(int number){
        int numOfDigits=0;
        int temp=number;
        int sum=0;
        while (temp>0){
            numOfDigits++;
            temp/=10;
        }
        temp=number;

        while (temp>0){
            int eachDigit=temp%10;
            temp/=10;

            sum+=Math.pow(eachDigit,numOfDigits);
        }
        return number==sum;
    }
}
