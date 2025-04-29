package org.example.part7.innerClass;

public class Outer {
    int outer_x = 100;

    public void test(){
        Inner inner = new Inner();
        inner.display();
    }

    class Inner{
        void display(){
            System.out.println("outer_x: " + outer_x);
        }
    }
}
