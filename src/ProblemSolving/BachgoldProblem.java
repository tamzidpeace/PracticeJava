package ProblemSolving;

import java.util.Scanner;

public class BachgoldProblem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int count = number / 2;

        if (number % 2 == 1) {

            System.out.println(count);


            for (int i = 0; i <count-1 ; i++) {

                System.out.print("2 ");
            }
            System.out.println(3);

        } else {

            int num = number / 2;
            System.out.println(num);

            for (int i = 0; i < num ; i++) {

                System.out.print(2 + " ");


            }
        }

    }
}
