package Number;

import java.util.Scanner;

public class PrimeNumber {
    static void main() {
        Scanner sc = new Scanner("enter a num:");
        int num = sc.nextInt();
        int count = 0;

        for (int i = 0; i <=num; i++) {
            if(num %2==0){
                count ++;
            }
        }
        if(count==2){
            System.out.println("is a prime");
        }else{
            System.out.println("not a prime");
        }
    }
}
