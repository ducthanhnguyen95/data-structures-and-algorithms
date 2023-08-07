package com.codewiththanh.datastructure.arrays;

public class Main {

    public static void main(String[] args)  {
        Array numbers = new Array(3);
        Array arrayIntersect = new Array(3);
        arrayIntersect.insert(1);
        arrayIntersect.insert(30);
        arrayIntersect.insert(20);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(50);
//        System.out.println(numbers.indexOf(30));
//        numbers.removeAt(1);
//        numbers.print();
//        System.out.println(numbers.max());
//        numbers.intersect(arrayIntersect).print();
        Array numbers1 = new Array(5);
        numbers1.insert(10);
        numbers1.insert(20);
        numbers1.insert(30);
        numbers1.insert(40);
        numbers1.insert(50);
        numbers1.insertAt(10, 5);
        numbers1.print();
//        numbers.reverse();
//        System.out.println("\r\n");
//        numbers.print();

    }
}
