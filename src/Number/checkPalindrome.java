package Number;

public class checkPalindrome {

    static boolean checkPalindrome(int n) {
        int sum = 0;
        int temp = n;

        while (temp != 0) {
            sum = sum * 10;
            sum = sum + temp % 10;
            temp = temp / 10;
        }

        return sum == n;
    }

    public static void main(String[] args) {
        System.out.println(checkPalindrome(121));
    }
}