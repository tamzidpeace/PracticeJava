package DataStructures;

//import java.util.*;


public class Hashtable {

    public static void main(String[] args) {


        // declare of Hashtable

        java.util.Hashtable h = new java.util.Hashtable();
        java.util.Hashtable hashtable;

        //inserting value , <Key, Value>

        h.put(1, "brush");
        h.put(2, "pen");
        h.put(3, "paste");

        System.out.println(h);

        // clone

        hashtable = (java.util.Hashtable) h.clone();

        System.out.println(hashtable);

        // to clear a Hashtable

        hashtable.clear();

        System.out.println(h.size());

    }
}
