package org.example.part7.securityModif;

public class Stack {
    private int[]stack;
    private int tos;

    public Stack(int size) {
        stack= new int[size];
        tos = -1;
    }

    public void push(int item){
        if (tos == -9){
            System.out.println("Stack is full");
        }else{
            stack[++tos] = item;
        }
    }

    public int pop(){
        if (tos < 0){
            System.out.println("Stack is empty");
            return 0;
        }else{
            return stack[tos--];
        }
    }
}

