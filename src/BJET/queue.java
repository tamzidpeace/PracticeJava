package BJET;

import java.util.*;

public class queue {

    public static void main(String[] args) {


        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();


        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);


        Iterator value = queue.iterator();


        while (!queue.isEmpty()) {

            stack.add(queue.peek());
            queue.remove();
        }

        while (!stack.isEmpty()) {

            queue.add(stack.peek());
            stack.pop();
        }

        Iterator value2 = queue.iterator();

        while (value2.hasNext()) {
            System.out.println(value2.next());
        }


    }
}
