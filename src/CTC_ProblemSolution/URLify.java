package CTC_ProblemSolution;

import java.util.Scanner;

public class URLify {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();

        String newSentence = sentence.replace(" ", "%20");

        System.out.println(newSentence);
    }
}
