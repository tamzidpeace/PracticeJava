package DataStructures;

//import java.util.*;


import java.util.Map;

public class Hashtable {

    public static void main(String[] args) {


        // points or remember


        /*
        source : javatpoint
        A Hashtable is an array of a list. Each list is known as a bucket.

        The position of the bucket is identified by calling the hashcode() method.

        A Hashtable contains values based on the key.

        Java Hashtable class contains unique elements.

        Java Hashtable class doesn't allow null key or value.

        Java Hashtable class is synchronized.

        The initial default capacity of Hashtable class is 11 whereas loadFactor is 0.75.*/


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

        // iterate through the Hashtable


        java.util.Hashtable<Integer, String> room_mates = new java.util.Hashtable<>();

        room_mates.put(1, "tanvir");
        room_mates.put(2, "sweet");
        room_mates.put(3, "rana");
        room_mates.put(4, "");

        for(Map.Entry m: room_mates.entrySet()) {
            System.out.println(m.getValue());
        }

        for(Map.Entry m: room_mates.entrySet()) {
            System.out.println(m.getKey());
        }

        System.out.println(room_mates);

    }
}
