import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        int count = 1;

        //System.out.println(s);

        for (int i = 0; i < s.length() ; i++) {

            if(s.charAt(i) == 'A' || s.charAt(i) == 'B' || s.charAt(i) == 'C' || s.charAt(i) == 'D' || s.charAt(i) == 'E' || s.charAt(i) == 'F' ||
                    s.charAt(i) == 'G' || s.charAt(i) == 'H' || s.charAt(i) == 'I' || s.charAt(i) == 'J' || s.charAt(i) == 'K' || s.charAt(i) == 'L' ||
                    s.charAt(i) == 'M' || s.charAt(i) == 'N' || s.charAt(i) == 'O' || s.charAt(i) == 'P' || s.charAt(i) == 'Q' ||
                    s.charAt(i) == 'R' || s.charAt(i) == 'S' || s.charAt(i) == 'T' || s.charAt(i) == 'U' || s.charAt(i) == 'V' || s.charAt(i) == 'W' ||
                    s.charAt(i) == 'X' || s.charAt(i) == 'Y' || s.charAt(i) == 'Z' )

                count++;

        }

        System.out.println(count);


    }
}
