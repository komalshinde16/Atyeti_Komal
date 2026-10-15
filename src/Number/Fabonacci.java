package Number;

public class Fabonacci {
    static void main() {
        int a=0;
        int b=1;
        int sum;

        for (int i = 0; i <=10; i++) {
            System.out.println(a + " ");

            sum = a+b;
            a=b;
            b=sum;

        }
    }
}
