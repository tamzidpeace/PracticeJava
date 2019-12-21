package BJET;

import java.util.Scanner;

public class decimalPointCount {

    public static void main(String[] args) {

        float a = 2.33f;
        int n=0;

        while(a - Math.floor(a)!=0) {
            a*=10;
            n++;
        }
        System.out.println(n);


    }
}
