package ProblemSolving;

import java.util.Scanner;

public class IntegerSequenceDividing {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();

        long sum = n * (n+1);
        long finalSum = sum/2;

        if(finalSum%2 == 0) System.out.println(0);
        else System.out.println(1);

    }


}
