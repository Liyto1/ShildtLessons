package org.example;

public class Main {
    public static void main(String[] args) {
        Factorial f = new Factorial();

        System.out.println("Факторіал 3 дорівнює: "+ f.fact(3));
        System.out.println("Факторіал 4 дорівнює: "+ f.fact(4));
        System.out.println("Факторіал 5 дорівнює: "+ f.fact(5));
    }
}