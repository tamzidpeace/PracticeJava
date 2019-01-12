package Algorithms;

import java.util.Scanner;

public class Compute_Fibonacci {

    public static void main(String[] args) {

        int number;

        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        int result =compute(number);

        System.out.println("Sum of fibonacci numbers is: " + result);
    }

    private static int compute(int number) {

        if(number <= 0) {
            return 0;
        } else if(number == 1) return 1;

        return compute(number-1) + compute(number-2);

    }
}
