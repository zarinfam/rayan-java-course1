package com.rayan.course.stack;

import java.util.List;

/**
 * Created by saeed on 2/23/16.
 */
public class MainStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();

        stack.push(12);
        stack.push(2);
        stack.push(20);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

    public static Double sum(List<? extends Number> input) {

        Double total = 0d; // initialize total

        // calculate sum
        for (Number element : input)
            total += element.doubleValue();

        return total;


    }

    public static <T> void printArray(T[] inputArray) {
        // display array elements
        for (T element : inputArray)
            System.out.printf("%s ", element);


        System.out.println();
    }

}
