package Test;

import java.util.LinkedList;
import java.util.Scanner;

public class Test02 {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        isEmpty(list);

        list.push("a");
        list.push("b");
        list.push("c");
        list.add("d");// last
        list.push("e"); // first


        System.out.println(list.getFirst());
        System.out.println(list.getLast());

    }

    public static int isEmpty(LinkedList<String> list) {
        if(list.size() == 0)
            return 1;
        else
            return 0;
    }
}
