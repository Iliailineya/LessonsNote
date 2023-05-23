package me.overloadingexsempl;

public class Main {
    public static void main(String[] args) {

        int a = 6;
        int b = 6;

        //method(a,b);
        for (String i: args) {
            System.out.println(args);
        }






    }
        static void method(int a,int b) {
            System.out.println(a/b);
        }

        void method(long i){
            System.out.println("long");
        }

}
