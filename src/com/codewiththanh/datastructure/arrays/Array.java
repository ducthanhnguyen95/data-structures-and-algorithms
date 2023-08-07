package com.codewiththanh.datastructure.arrays;

public class Array {

    private int[] items;

    private int count;

    public Array(int length) {
        items = new int[length];
    }

    //Implementing insert() method, item:int is the int item we want to insert.
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

    //removeAt() method removes the element at the index:int index.
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

    //indexOf() returns the index of the given value if it exists, OW returns -1.
    public int indexOf(int item) {
        //O(n)
        for (int i = 0; i < count; i++)
            if (items[i] == item)
                return i;
        return -1;
    }

    /**
     * Exercise 1:
     *     Extend the Array class and add a new method to return the largest number.
     *     What is the runtime complexity of this method?
     */
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

    /**
     * Exercise 2:
     *     Extend the Array class and add a method to return the common items in this array
     *     and another array.
     */
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

    /**
     * Exercise 3:
     *     Extend the Array class and add a method to reverse the array.
     *     For example, if the array includes [1, 2, 3, 4], after reversing and printing it,
     *     we should see [4, 3, 2, 1].
     */
    public void reverse(){
        int[] revArr = new int[count];
        for(int i = count-1; i >= 0; i--){
            revArr[count-1-i] = items[i];
        }
        items = revArr;
    }

    public void print() {
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
    }

    public void insertAt(int item, int index) {
        if(index >= count) {
            return;
        }
        int[] revArr;
        if (items.length == count) revArr = new int[count * 2];
        else revArr = new int[count + 1];
        for(int i = 0; i < count; i++) {
            if(index == i) {
                int k = count - index;
                revArr[i] = item;
                for(int j = 0; j < k; j++ ) {
                    int temp = items[i];
                    i++;
                    revArr[i] = temp;
                }
            } else revArr[i] = items[i];
        }
        count = count * 2;
        items = revArr;
    }
}
