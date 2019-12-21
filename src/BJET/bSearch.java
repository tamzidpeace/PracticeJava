package BJET;

import java.util.Scanner;

public class bSearch {

    public static void main(String[] args) {

        int sort_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Scanner sc = new Scanner(System.in);

        int search_value = sc.nextInt();

        int len = sort_array.length;

        int L = 0;
        int H = len - 1;
        int check = 1;


        while (L <= H) {
            int M = L + (H-1)/2;

            if (sort_array[M] == search_value) {
                System.out.println("Found");
                check = 0;
                break;
            } else if (search_value < sort_array[M]) {
                H = M - 1;
            } else if (search_value > sort_array[M]) {
                L = M + 1;
            }
        }

        if (check == 1) {
            System.out.println("Not found");
        }

    }
}
