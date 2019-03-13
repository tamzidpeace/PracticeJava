package Test;


import java.util.Scanner;

public class Test00 implements Interface{

    int x, y;

    @Override
    public int add(int a, int b) {

        return a+b;
    }

    public static void main(String[] args) {

        Test00 test = new Test00();
        int result = test.add(1, 3);
        System.out.println(result);


    }




}
