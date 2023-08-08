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
        if (isEmpty()) throw new NoSuchElementException();
        if (first == last) first = last = null;
        else first = first.next;
    }

    public void deleteLast() {
        if (isEmpty()) throw new NoSuchElementException();
        if (first == last) {
            first = last = null;
            return;
        }
        var previous = getPrevious(last);
        last = previous;
        last.next = null;

    }

    private Boolean isEmpty() {
        return first == null;
    }

    private Node getPrevious(Node node) {
        var current = first;
        while (current != null) {
            if (current.next == node) return current;
            current = current.next;
        }
        return null;
    }

    private class Node {

        private final int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

    }

}
