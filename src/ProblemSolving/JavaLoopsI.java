package ProblemSolving;

import java.util.Scanner;

public class JavaLoopsI {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        for (int i = 1; i <11 ; i++) {

            int multiple = x * i;
            System.out.println(x + " x " + i + " = " + multiple);
        }
    }
}
