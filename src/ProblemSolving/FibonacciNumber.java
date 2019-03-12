package ProblemSolving;

import java.util.Scanner;

public class FibonacciNumber {

    public static void main(String[] args) {

        int f0 = 0, f1 = 1, fn;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int f = fibo(n);
        System.out.println(f);
        //System.out.print(f0 + ", " + f1 + ", ");

        /*for (int i = 0; i <=10 ; i++) {
            fn = f0 + f1;
            f0 = f1;
            f1 = fn;
            System.out.print(fn + ",");
        }*/
    }

    private static int fibo(int n) {
        if(n<=1)
            return n;
        else
            return fibo(n-1) + fibo(n-2);
    }
}
