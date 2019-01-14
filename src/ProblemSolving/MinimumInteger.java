package ProblemSolving;

import java.util.Scanner;

public class MinimumInteger {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();

        for (int i = 0; i <q ; i++) {

            int l = scanner.nextInt();
            int r = scanner.nextInt();
            int d = scanner.nextInt();

            findNum(l, r, d);

        }
    }

    private static void findNum(int l, int r, int d) {

        if(d == l || d == r) {

            if(d*2 == l || d*2 == r) {

                System.out.println(d*3);
            }

        } else if(d>l && d<r) {

            int num;

            for (int i = 1;  ; i++) {

                num = d * i;

                if(num < l || num>r) {

                    System.out.println(num);
                    break;

                }


            }
        }
        else System.out.println(d);
    }
}
