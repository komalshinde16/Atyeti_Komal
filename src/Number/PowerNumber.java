package Number;

public class PowerNumber {
    static void main() {
        int base = 2;
        int power = 3;
        int result = 1;

        for (int i=1; i<=power; i++){
            result = result * base ;
        }
        System.out.println(result);
    }
}
