package CTC_ProblemSolution;

import java.util.Scanner;

public class IsUnique {

    //private static int key = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.next();

        int key = 0;


        for(int i = 0; i< text.length() - 1; i++) {

            for(int j = i+1; j<text.length(); j++) {

                if(text.charAt(i) == text.charAt(j)) {
                    key = 1;
                    break ;
                }
            }
        }



        if(key == 0) System.out.println("False");
        else System.out.println("True");
    }
}
