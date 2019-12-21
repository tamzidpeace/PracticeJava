package BJET;

import java.util.Scanner;

public class extraSpaceRemove {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = "   Hello              world   ";

        System.out.println(text.replaceAll("( +)"," ").trim());

    }
}
