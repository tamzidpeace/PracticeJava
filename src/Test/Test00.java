package Test;


import java.util.Scanner;

public class Test00 {

    public static void main(String[] args) {

        String phone;
        Scanner scanner = new Scanner(System.in);
        phone = scanner.nextLine();
        char[] number = {'+', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int check = 0;

        for (int i = 0; i < phone.length(); i++) {
            for (int j = 0; j < number.length; j++) {
                if(phone.charAt(i) == number[j])
                    check++;
            }
        }

        System.out.println(phone.length());
        System.out.println(check);


    }


}
