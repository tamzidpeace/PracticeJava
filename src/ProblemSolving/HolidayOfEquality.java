package ProblemSolving;

import java.util.Scanner;

public class HolidayOfEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, burl, maxNumber = 0, totalBurlNeed = 0;
        int[] a = new int[100];
        n = scanner.nextInt();
        for (int i = 0; i <n ; i++) {
            burl = scanner.nextInt();
            a[i] = burl;
            if(maxNumber <= burl)
                maxNumber = burl;
        }
        for (int i = 0; i <n ; i++) {
            totalBurlNeed += (maxNumber - a[i]);
        }
        System.out.println(totalBurlNeed);
    }
}
