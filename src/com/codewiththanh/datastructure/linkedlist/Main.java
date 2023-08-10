package com.codewiththanh.datastructure.linkedlist;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

       var list = new LinkedList();
//       list.addLast(10);
//       list.addLast(20);
//       list.addLast(30);
//

       list.addFirst(3);
       list.addFirst(2);
       list.addFirst(1);

       int[] array = list.toArray();
        System.out.println(Arrays.toString(array));
        System.out.println(list.hasCycle());

    }
}
