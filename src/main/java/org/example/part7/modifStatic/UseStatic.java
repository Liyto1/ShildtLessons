package org.example.part7.modifStatic;

public class UseStatic {
    static int a = 3;
    static int b ;

    public void meth(int x){
        System.out.println("x = "+ x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    static {
        System.out.println("static block initialized");
        b = a*4;
    }
}
