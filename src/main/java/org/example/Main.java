package org.example;


import org.example.part7.innerClass.Outer;

public class Main {
    public static void main(String[] args) {
        String strOb1 = "First string";
        String strOb2 = "Second string";
        String strOb3 = strOb1;

        System.out.println("length of strOb1: "+ strOb1.length());
        System.out.println("character of strOb1 with index 3 : "+ strOb1.charAt(3));

        if(strOb1.equals(strOb2)){
            System.out.println("strOb1 equals strOb2");
        }else{
            System.out.println("strOb1 not equals strOb2");
        }

        if(strOb1.equals(strOb3)){
            System.out.println("strOb1 equals strOb3");
        }else{
            System.out.println("strOb1 not equals strOb3");
        }
    }
}