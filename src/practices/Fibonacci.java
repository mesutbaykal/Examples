package practices;

public class Fibonacci {

    public static void main(String[] args) {

        int number = 0;
        int first = 0;
        int second = 1;

        for (int i = 2; i <= number; i++) {
            int next = first+second;
            first=second;
            second=next;
        }

        System.out.println(number==0 ? first : second);

    }

}
