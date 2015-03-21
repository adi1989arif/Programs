import java.util.Scanner;

/**
 * Created by Adiba on 3/21/2015.
 */
public class FizzBuzz {
    public static void main(String args[]) {
            multiple();
        System.out.println("--------");
        int a=10;
        int b=20;
        multiple(a, b);
        }

    static void multiple() {
        for (int i = 1; i <= 15; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FIZZ BUZZ");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else
                System.out.println(i);
        }
    }

    static void multiple(int a, int b){
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FIZZ BUZZ");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else
                System.out.println(i);
        }


    }
}