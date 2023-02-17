import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
    
        Scanner scnr = new Scanner(System.in);

        System.out.print("Input number of Fibonacci numbers to compute: ");
        int num = scnr.nextInt(); 

        int[] fib = new int[num]; 
 
        fib[0] = 0;
        fib[1] = 1;
 
        for (int i = 2; i < num; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
 
        for (int i = 0; i < num; i++) {
            System.out.print(fib[i] + " ");
        }
    }
} 