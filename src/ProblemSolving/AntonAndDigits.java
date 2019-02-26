package ProblemSolving;

import java.util.Scanner;

public class AntonAndDigits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num2, num3, num5, num6;

        int maxSum = 0, remaining2;

        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        num5 = scanner.nextInt();
        num6 = scanner.nextInt();

        remaining2 = num2;

        if (remaining2 > 0 && num5 > 0 && num6 > 0) {
            if (num2 <= num5 && num2 > 0) {
                if (num2 <= num6) {
                    // num2
                    maxSum = 256 * num2;
                    remaining2 = 0;
                } else if (num6 > 0) {
                    //num6
                    maxSum = 256 * num6;
                    remaining2 = num2 - num6;
                }
            } else if (num6 > 0) {
                if (num5 <= num6) {
                    //num5
                    maxSum = num5 * 256;
                    remaining2 = num2 - num5;
                } else {
                    //num6
                    maxSum = num6 * 256;
                    remaining2 = num2 - num6;
                }
            }
        }

        if (remaining2 > 0 && num3 > 0) {

            if (remaining2 <= num3 && remaining2 > 0) {
                maxSum += 32 * remaining2;
            } else if (remaining2 > 0) {
                maxSum += 32 * num3;
            }
        }
        System.out.println(maxSum);
    }
}
