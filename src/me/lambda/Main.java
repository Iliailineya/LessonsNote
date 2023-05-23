package me.lambda;

import java.lang.FunctionalInterface;

// функциональный интерфейс
@FunctionalInterface
interface MyInterface{

    // абстрактный метод
    double getPiValue();
}
public class Main {

    public static void main( String[] args ) {

        // объявление ссылки на MyInterface
        MyInterface ref;

        // лямбда-выражение
        ref = () -> 3.1415;

        System.out.println("Value of Pi = " + ref.getPiValue());
    }
}
