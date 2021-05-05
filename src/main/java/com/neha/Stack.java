package com.neha;

public class Stack {

    private int[] array;
    private int capacity;
    private int top;

    public Stack(int capacity) {
        this.array = new int[capacity];
        this.capacity = capacity;
        this.top = -1;
    }
    public void push(int item){
        if(isFull())
            throw new RuntimeException("Stack is full, Exception occurs");
        array[++top] = item;
    }
    public int pop(){
        if(isEmpty())
            throw new RuntimeException("Stack is empty, Exception occurs");
        return array[top--];
    }
    public int peek(){
        return array[top];
    }
    public boolean isFull(){
        return top == capacity -1;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public static void main(String args[]){
        Stack stack  = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());


    }
}
