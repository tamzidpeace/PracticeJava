package Test;

import java.util.LinkedList;
import java.util.Scanner;

public class Test02 {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        isEmpty(list);

    }

    public static int isEmpty(LinkedList<String> list) {
        if(list.size() == 0)
            return 1;
        else
            return 0;
    }
}
