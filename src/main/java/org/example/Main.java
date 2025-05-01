package org.example;


import org.example.part7.innerClass.Outer;

public class Main {

    static void vaTest(int ... v ){
        System.out.print("number of args: " + v.length + " contain: ");

        for(int x: v){
            System.out.print(x+ " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        vaTest(10);
        vaTest(1,2,3);
        vaTest();
    }
}