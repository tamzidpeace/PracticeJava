import java.util.Scanner;

public class JavaOutputFormatting {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // taking input

        String s1 = scanner.next();
        int x1 = scanner.nextInt();

        String s2 = scanner.next();
        int x2 = scanner.nextInt();

        String s3 = scanner.next();
        int x3 = scanner.nextInt();

        System.out.println("================================");

        System.out.print(s1 + "           ");

        if(x1>99) {
            System.out.println(x1);
        } else if (x1 > 9 && x1 < 100) {
            System.out.println("0" + x1);

        } else if (x1 < 10) {
            System.out.println("00" + x1);
        }

        System.out.print(s2 + "           ");

        if(x2>99) {
            System.out.println(x2);
        } else if (x2 > 9 && x2 < 100) {
            System.out.println("0" + x2);

        } else if (x2 < 10) {
            System.out.println("00" + x2);
        }

        System.out.print(s3 + "           ");

        if(x3>99) {
            System.out.println(x3);
        } else if (x3 > 9 && x3 < 100) {
            System.out.println("0" + x3);

        } else if (x3 < 10) {
            System.out.println("00" + x3);
        }

        System.out.println("================================");
    }
}
