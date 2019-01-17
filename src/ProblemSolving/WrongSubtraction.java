package ProblemSolving;

import java.util.Scanner;

public class WrongSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n, k;
        n = scanner.nextInt();
        k = scanner.nextInt();
        for (int i = 0; i <k ; i++) {
            if(n%10 == 0) {
                n = n/10;
            } else {
                n = n-1;
            }
        }
        System.out.println(n);
    }
}
