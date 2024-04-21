package com.codewiththanh.datastructure.queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {
//    public static void main(String[] args) {
//        Queue<Integer> queue = new ArrayDeque<>();
//        queue.add(10);
//        queue.add(20);
//        queue.add(30);
//        reverse(queue);
//        System.out.println(queue);
//    }

//    public static void main(String[] args) {
//        ArrayQueue queue = new ArrayQueue(5);
//        queue.enqueue(10);
//        queue.enqueue(20);
//        queue.enqueue(30);
//        queue.dequeue();
//        var front = queue.dequeue();
//        queue.enqueue(40);
//        queue.enqueue(50);
//        queue.enqueue(60);
//        queue.enqueue(70);
//        queue.dequeue();
//        queue.enqueue(80);
//        System.out.println(front);
//        System.out.println(queue);
//    }

//    public static void main(String[] args) {
//        QueueWithTwoStacks queue = new QueueWithTwoStacks();
//        queue.enqueue(10);
//        queue.enqueue(20);
//        queue.enqueue(30);
//        queue.enqueue(40);
//        queue.enqueue(50);
//        queue.dequeue();
//        queue.dequeue();
//        queue.dequeue();
//        System.out.println(queue);
//    }

    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue();
        queue.add(5);
        queue.add(3);
        queue.add(6);
        queue.add(1);
        queue.add(4);
        System.out.println(queue);
        while(!queue.isEmpty())
            System.out.println(queue.remove());
    }

    public static void reverse(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack();
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }
}

