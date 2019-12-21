package BJET;

import java.io.File;
import java.util.Scanner;

public class dateCheck {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int check = 0;
        String maxDate = "12";
        for (int i = 0; i < 2; i++) {
            String date = input.nextLine();

            int day = Integer.parseInt(date.substring(0, 2));
            int month = Integer.parseInt(date.substring(3, 5));
            int year = Integer.parseInt(date.substring(6, 8));

            int dayCount = day + (month * 30) + (365 * year);

            if (dayCount > check) {
                maxDate = date;
                check = dayCount;
            }

            //System.out.println(day + " " + month + " " + year);

        }

        //11 11 11

        System.out.println(maxDate);
    }
}

