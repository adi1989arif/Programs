/**
 * Created by Adiba on 3/21/2015.
 */
import java.util.Scanner;

public class Fib_recursive {
    static int a;
    //static int b;
    static long c;
    public static long fibonacci(int b) {
        if ((b == 1) || (b == 2)){
            return 1;
        }
        else{
            c=fibonacci(b - 1) + fibonacci(b - 2);
            return c;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        System.out.println("You entered: "+a);
        for(int i=1;i<=a;i++){
            c= fibonacci(i);
            System.out.println(c);
        }
    }
}