package ProblemSolving;

import java.util.Scanner;

public class InSearchofanEasyProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int validation = 0, hardorEasy;
        for (int i = 0; i <n ; i++) {
            hardorEasy = scanner.nextInt();
            if(hardorEasy == 1) {
                validation = 1;
            }
        }

        if(validation == 0)
            System.out.println("EASY");
        else
            System.out.println("HARD");
    }
}
