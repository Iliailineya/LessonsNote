package me.exercise.recursion;


public class RootOfEquation {
    // вспомогательный метод
    public static double func(double x) {
        return Math.cos(Math.pow(x, 5)) + Math.pow(x, 4) - 345.3 * x - 23; //  cos(x^5) + x^4 - 345.3 * x - 23 = 0
    }

    // решить уравнение
    public static double solve(double start, double end) {

        double x = start + (end - start) / 2;

//        Точность по Х
//        if (end - start <= 0.001) {
//            return start;
//        }

//        Точность по У
//        if(Math.abs(func(start)- func(end)) <= 0.001){
//            return start;
//        }

//        Максимальная точность для Double
        if(x == end || x == start){
            return x;
        }

        if (func(start) * func(x) > 0) {
            return solve(x, end);
        } else {
            return solve(start, x);
        }


    }
}
