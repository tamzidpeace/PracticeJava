package ProblemSolving;

import java.util.Scanner;

public class BearAndBigBrother {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int time = 0;
        while (a<=b) {
            a = a*3;
            b = b*2;
            time++;
        }

        System.out.println(time);
    }
}
