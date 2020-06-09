package org.collections;

import java.util.*;

public class Test {
    public static void testCollection(Collection collection) {
        // Enhanced for loop
        for(Object o: collection) {
            System.out.print(o + " ");
        }

        System.out.println();

        // Using iterator
        Iterator it = collection.iterator();

        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
    public static void main(String[] args) {
//        Collection<Integer> c = new LinkedList();
//        Collection<Integer> c = new ArrayList();
        Collection<Integer> c = new HashSet<>();
//        Collection<Integer> c = new PriorityQueue<>();

        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.add(5);



        Test.testCollection(c);
    }
}
