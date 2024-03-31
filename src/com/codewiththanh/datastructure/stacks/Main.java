package com.codewiththanh.datastructure.stacks;

public class Main {
    //Balance expresstion
//    public static void main(String[] args) {
//        String str = "abcd";
//        StringReverser reverser = new StringReverser();
//        var result = reverser.reverse(str);
//        System.out.println(result);
//    }
//    public static void main(String[] args) {
//        // Edge cases
//        // (
//        //(()
//        //(]
//        //)(
//        String str = "(1+2}";
//        Expresstion exp = new Expresstion();
//        var result = exp.isBalanced(str);
//        System.out.println(result);
//    }

    public static void main(String[] args) {
        com.codewiththanh.datastructure.stacks.Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.pop();
        stack.pop();
        stack.push(50);
        stack.push(70);
        stack.push(80);
        System.out.println(stack);

    }


}
