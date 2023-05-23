package me.myValues;

public class Main {
    public static void main(String[] args) {
//        float amount = 1.0000005F;
//        float aValue = 0.0000004F;
//        float result = amount - aValue;
//        System.out.println(result);
//
//        double positive_infinity = 12.0 / 0;
//        System.out.println(positive_infinity);
//
//        double negative_infinity = -15.0 / 0;
//        System.out.println(negative_infinity);
//        System.out.println(positive_infinity + negative_infinity);
//
//        char symbol = '\u0066'; // Unicode
//        symbol = 102; // ASCII
//        System.out.println(symbol);



        // Разобрать код ниже, когда смогу)))))))
        // смог
        // ты унарной операцией делаешь неявное преобразование, а потом он канеш думает что это ascii таблица, остальное чтобы запутать
        String costForPrint = "5$";
        System.out.println("Цена только для вас " + + costForPrint.charAt(0) + getCurrencyName(costForPrint.charAt(1)));
    }

    public static String getCurrencyName(char symbol) {
        if (symbol == '$') {
            return " долларов";
        } else {
            throw new UnsupportedOperationException("Not implemented yet");
        }
    }
}

