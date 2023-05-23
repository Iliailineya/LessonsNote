package me.wrap;

public class AutoBox {
    public static void main(String[] args) {
        String s1 = new String();
        String s2 = new String();
        Integer i1 = 128;
        Integer i2 = 121181;

//        s1 = "";
//        s2 = "";
        Object o1 = new Object();
        Object o2 = new Object();

        System.out.println(s1);
        System.out.println(s2);

        //
        if (s1 == s2) {
            System.out.println("== s");
        }
        if (s1.equals(s2)) {
            System.out.println("equal s");
        }

        //
        if (i1 == i2) {
            System.out.println("== i");
        }
        if (i1.equals(i2)) {
            System.out.println("equal i");
        }

        //
        if (o1.equals(o2)) {
            System.out.println(111);

        }

    }
}
