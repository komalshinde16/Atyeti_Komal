package Number;

public class SumOfDigits {
    static void main() {
        int n = 1234;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }

        System.out.println(sum);
    }
}
