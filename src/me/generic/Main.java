package me.generic;

class Gen <T>{

}
public class Main <T>{
    public static void main(String[] args) {
        Main main = new Main();
        main.method("");

    }

    T method (T type){
        System.out.println(type);
        return type;
    }

}
