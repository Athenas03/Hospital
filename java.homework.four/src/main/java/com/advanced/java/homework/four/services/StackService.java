package com.advanced.java.homework.four.services;

import org.springframework.stereotype.Service;

import java.util.Stack;

@Service
public class StackService {

    private Stack<Double> stack;


    public StackService(){
        stack = new Stack<>();

    }
    public void createStack(){
        stack= new Stack<>();

    }

    public void addToStack(double value){
        stack.push(value);
    }

    public double removeFromStack(){
        if (!stack.isEmpty()) {
            return stack.pop();
        }
        else {
            throw new IllegalStateException("Stack is Empty");
        }
    }

    public Stack <Double> getStack(){
        return  stack;
    }
    public void clearStack(){
        stack.clear();
    }

}
