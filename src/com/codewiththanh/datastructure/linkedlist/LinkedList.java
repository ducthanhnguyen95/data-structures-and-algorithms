package com.codewiththanh.datastructure.linkedlist;

import java.util.NoSuchElementException;

public class LinkedList {

    private Node first;
    private Node last;

    public void addLast(int item) {
        var node = new Node(item);
        if (isEmpty()) first = last = node;
        else {
            last.next = node;
            last = node;
        }
    }

    public void addFirst(int item) {
        var node = new Node(item);
        if (isEmpty()) first = last = node;
        else {
            node.next = first;
            first = node;
        }
    }

    public void deleteFirst() {
        if(isEmpty()) throw new NoSuchElementException();
        if(first == last) first = last = null;
        else first = first.next;
    }

    public void deleteLast() {
        Node node = null;
        if (first == last) node = first;
        else node = first.next;
        while (true) {
            if (first == last) {
                first.next = null;
                last = first;
                break;
            }
            if (node == last) {
                node.next = null;
                last = node;
                break;
            }
            if (node.next == last) {
                node.next = null;
                last = node;
                break;
            }
            node = node.next;

        }
    }

    public boolean contain(int value) {

        while (true) {

        }
    }

    private Boolean isEmpty() {
        return first == null;
    }

    private class Node {

        private final int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

    }

}
