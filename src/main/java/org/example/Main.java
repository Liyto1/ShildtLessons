package org.example;

import org.example.part7.modifStatic.StaticDemo;

public class Main {
    public static void main(String[] args) {
        StaticDemo.callme();
        System.out.println("b = " + StaticDemo.b);
    }
}