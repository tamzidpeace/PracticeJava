package Algorithms;

import java.util.Scanner;

public class GenerateFibonacciSeries {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        allFib(n);
    }

    private static void allFib(int n) {

        for (int i = 0; i <n ; i++) {

            System.out.println(fib(i) + " ");
        }
    }

    private static int fib(int n) {

        if(n <= 0) return 0;
        else if(n == 1) return 1;
        else return fib(n-1) + fib(n-2);
    }
}

// this one is a terrible algorithm for solving this problem
