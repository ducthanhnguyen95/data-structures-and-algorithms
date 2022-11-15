package com.codewiththanh.datastructure.arrays;

public class Array {

    private int[] items;

    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        // If array is full, resize it
        if (items.length == count) {
            // Create a new array (twice the size)
            int[] newItems = new int[count * 2];
            // Copy all the existing items
            for (int i = 0; i < count; i++)
                newItems[i] = items[i];
            // Set "items" to this new array
            items = newItems;
        }
        items[count++] = item;
    }

    public void removeAt(int index) {
        // Validate the index
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();

        // Shift the items to the left to fill the hole
        // [10,20,30,40]
        // index: 1
        // 1 <- 2
        // 2 <- 3
        for (int i = index; i < count; i++)
            items[i] = items[i + 1];

        count--;
    }

    public int indexOf(int item) {
        //O(n)
        for (int i = 0; i < count; i++)
            if (items[i] == item)
                return i;
        return -1;
    }

    public int max() {
        int max = items[0];
        for (int i = 0; i < count; i++) {
            int comp = Math.max(items[i], max);
            if (comp > max) {
                max = comp;
            }
        }
        return max;
    }

    public Array intersect(Array arr) {
        if (arr.count == 0 || count == 0)
            throw new IllegalArgumentException();
        Array retArr = new Array(count + arr.count);
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < arr.count; j++) {
                if (items[i] == arr.items[j]) {
                    retArr.insert(items[i]);
                }
            }
        }
        return retArr;
    }

    public void print() {
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
    }
}
