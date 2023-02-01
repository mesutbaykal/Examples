package practices;

public class MaxPossibleValue {

    public static void main(String[] args) {

        int n = 999;
        boolean isPos = n>0;
        String digits = String.valueOf(Math.abs(n));

        int max = 0;

        for (int i = 0; i < digits.length(); i++) {

            char eachDigit = digits.charAt(i);

            if ((isPos&&eachDigit < '5')||(!isPos&&eachDigit > '5')){
                max=Integer.parseInt(digits.substring(0,i)+5+digits.substring(i));
                break;
            }

        }

        if (max==0){
            max=Integer.parseInt(digits+5);
        }

        System.out.println(isPos ? max : max*-1);
    }
}
