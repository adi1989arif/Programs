/**
 * Created by Adiba on 3/21/2015.
 */

import java.util.Scanner;

public class Factorial_recursive {
    static int fact=0;

    public static void main(String args[]){
        int a;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        a = in.nextInt();
        fact(a);
        System.out.println(fact);
    }

    private static int fact(int a) {
        // TODO Auto-generated method stub
        if(a==1){
            return a;
        }

        else {
            fact = (a)*(fact(a-1));
            return fact;
        }
    }
}
