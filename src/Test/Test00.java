package Test;

import java.util.Scanner;

public class Test00 {

    public static void main(String[] args) {

        int number;
        Test00 test00 = new Test00();

        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        int result = test00.compute(number);

        System.out.println("Sum of fibonacci numbers is: " + result);
    }



    public int compute(int number) {

        if(number <= 0) {
            return 0;
        } else if(number == 1) return 1;

        return compute(number-1) + compute(number-2);

    }

}
