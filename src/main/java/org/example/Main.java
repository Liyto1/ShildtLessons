package org.example;

public class Main {
    public static void main(String[] args) {

        Test ob = new Test();

        int a = 15, b = 20;

        System.out.println("a і b до виклику: "+ a + " "+ b);

        ob.meth(a,b);

        System.out.println("a i b після виклику: "+ a + " "+ b);
    }
}