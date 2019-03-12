package Test;

import java.util.Random;
import java.util.Scanner;

public class Test01 {


    public static void main(String[] args) {
        int[][] array = new int[3][3];

        /*Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = scanner.nextInt();
                //System.out.print(array[i][j]);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("\n");
        }*/

        int x1, x2, y1, y2;
        Random random = new Random();
        x1 = random.nextInt(5);
        x2 = random.nextInt(5);
        y1 = random.nextInt(5);
        y2 = random.nextInt(5);
        System.out.println("(" + x1 + "," + y1 + "), (" + x2 + "," + y2 + ")");

        while (x1 != x2) {
            if (x1 > x2) {
                x1--;
                System.out.println(x1 + " " + y1);
            } else {
                x1++;
                System.out.println(x1 + " " + y1);
            }
        }

        while (y1 != y2) {
            if (y1 > y2) {
                y1--;
                System.out.println(x1 + " " + y1);
            } else {
                y1++;
                System.out.println(x1 + " " + y1);
            }
        }
    }
}
