/**
 * Created by Adiba on 3/21/2015.
 */
import java.util.Scanner;

public class Fibonacci_iterative {
    static int[] fibarray;
    public static void fib(){
        fibarray[0]=1;
        fibarray[1] =1;
        System.out.print(fibarray[0]+" "+fibarray[1]);
        for (int i=2; i<fibarray.length;i++){
            fibarray[i]=fibarray[i-1]+fibarray[i-2];
            System.out.print(" "+fibarray[i]);
        }
    }

    public static void fib1(int b){
        fibarray[0]=1;
        fibarray[1] =1;
        System.out.print(fibarray[0]+" "+fibarray[1]);
        for (int i=2; i<fibarray.length;i++){
            fibarray[i]=fibarray[i-1]+fibarray[i-2];
            if (fibarray[i]<b){
                System.out.print(" "+fibarray[i]);
            }
            else
                break;
        }
    }

    public static void main(String args[]){
        int a;
        int b;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the lenght of the array:");
        a = in.nextInt();

        fibarray = new int[a];

        fib();
        System.out.println();
        System.out.println("Enter the size:");
        b = in.nextInt();
        fibarray = new int[b];
        fib1(b);
    }
}