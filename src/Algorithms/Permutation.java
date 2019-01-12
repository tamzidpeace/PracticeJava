package Algorithms;

import java.util.Scanner;

public class Permutation {

    public static void main(String[] args) {

        String str;
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
        scanner.close();
        int n = str.length();

        permute(str, 0, n-1);
    }

    private static void permute(String str, int l, int r) {

        if(l==r)
            System.out.println(str);
        else {
            for (int i = l; i <=r ; i++) {
                
                str = swap(str, l, i);
                permute(str, l+1, r);
                str = swap(str, l, i);
            }
        }
    }

    private static String swap(String a, int i, int j) {

        char temp;
        char[] charArray = a.toCharArray();// converting the string to an string type array
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;

        return String.valueOf(charArray);
    }
}
