package org.example;

public class Main {
    public static void main(String[] args) {
       Stack myStack1 = new Stack(10);
       Stack myStack2 = new Stack(20);

       for (int i = 0; i < 10; i++) myStack1.push(i);
       for (int i = 0; i < 20; i++) myStack2.push(i);

        System.out.println("Stack 1: " );
        for (int i = 0; i < 10; i++) System.out.println(myStack1.pop());

        System.out.println("Stack 2: " );
        for (int i = 0; i < 20; i++) System.out.println(myStack2.pop());

    }
}