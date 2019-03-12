package ProblemSolving;

import java.util.Scanner;

public class GenderDetect {

    public static void main(String[] args) {

        int status = 0;
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String[] substr0 = {"aa", "ba", "ca", "da", "ea", "fa", "ga", "ha", "ia", "ja", "ka", "la",
        "ma", "na", "oa", "pa", "qa", "ra", "sa", "ta", "ua", "va", "wa", "xa", "ya", "za"};
        int length = name.length();
        int n1, n2;
        n1 = length - 2;
        n2 = length;
        String substr = name.substring(n1, n2);


        for (int i = 0; i <26 ; i++) {
            if(substr0[i].equals(substr)) {
                status = 1;
                break;
            }
        }

        if(status == 0)
            System.out.println("Male");
        else
            System.out.println("Female");
    }
}
