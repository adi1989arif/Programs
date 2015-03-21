/**
 * Created by Adiba on 3/21/2015.
 */
import java.util.Scanner;

public class Factorial {

    static int fac;
    static int n;
    static int CalculateFac(int c){
        fac=0;
        n=1;
        for (int i=1;i<=c;i++){
            fac = c*i;
            n = n*fac;
            c--;
        }
        return n;
    }
    public static void main (String args[]){
        System.out.println("Enter the number:");
        int a;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        System.out.println("You entered: "+a);
        CalculateFac(a);
        System.out.println(n);
    }

}