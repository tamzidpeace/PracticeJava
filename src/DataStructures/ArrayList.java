package DataStructures;

import java.util.Iterator;

public class ArrayList {


    public static void main(String[] args) {

        java.util.ArrayList <String> name = new java.util.ArrayList<>();
        java.util.ArrayList <Integer> number = new java.util.ArrayList<>();

        name.add("glass");
        name.add("pen");
        name.add("laptop");

        number.add(10);
        number.add(20);
        number.add(30);

        System.out.println(name);

        Iterator iterator = name.iterator();
        Iterator iterator2 = number.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

        for (String elements:name) {
            System.out.println(elements);
        }

    }



}
