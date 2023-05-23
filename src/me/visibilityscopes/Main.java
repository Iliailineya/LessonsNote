package me.visibilityscopes;

class Parent {

    static {
        System.out.println("static Parent init block");
    }
     Parent() {
         System.out.println("parent constructor");
    }
}


public class Main extends Parent {
    static {
        System.out.println("static init block");
    }
    {
        System.out.println("init block");
    }

    public Main() {
        super();
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        new Main();
    }
}