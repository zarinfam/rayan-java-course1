package com.rayan.course.stack;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saeed on 2/23/16.
 */
public class Stack<T extends Number> {

    private List<T> stack = new ArrayList<>();

    public void push(T element){
        stack.add(element);
    }

    public T pop(){
        if (stack.size() > 0){
            return stack.remove(stack.size()-1);
        }

        throw new IndexOutOfBoundsException();
    }

    public int size(){
        return stack.size();
    }
}
