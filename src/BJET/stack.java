package BJET;

import java.util.*;

public class stack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();



        stack.push(4);
        stack.push(5);
        stack2.push(6);
        stack2.push(7);
        stack2.push(8);
        stack2.push(9);

        stack2.push(4);
        stack2.push(5);

        Iterator value = stack2.iterator();

        while(value.hasNext()) {
            System.out.println(value.next());
        }
    }
}
