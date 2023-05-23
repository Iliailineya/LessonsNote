package me.exercise;

import me.exercise.basic.ArrayFill;
import me.exercise.basic.MyCalculationOut;
import me.exercise.basic.MySort;
import me.exercise.basicOOP.MyLinkedList;
import me.exercise.basicOOP.MyVector;
import me.exercise.basicOOP.RandomFromArray;
import me.exercise.inheritance.*;
import me.exercise.recursion.BinarySearchTree;
import me.exercise.recursion.RootOfEquation;
import me.exercise.recursion.Search;
import me.exercise.recursion.TreeNode;
import me.exercise.workWithString.MyClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Exercise {

    void one() {

        System.out.println("""
                1. Максимальное, минимальное и среднее значение
                Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
                Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1000].""");
        System.out.println();

        int[] array = new int[100];
        array = Arrays.copyOf(ArrayFill.arrayFill(array), ArrayFill.arrayFill(array).length);
        MyCalculationOut.calAllOut(array);
    }

    void two() {
        System.out.println("""
                2. Реализуйте алгоритм сортировки пузырьком для сортировки массива
                Вывести полученый отсортированный массив в виде матрицы 10*10""");
        System.out.println();

        int[] array = new int[100];
        array = Arrays.copyOf(ArrayFill.arrayFill(array), ArrayFill.arrayFill(array).length);
        int[] bubbleSortArray;
        bubbleSortArray = Arrays.copyOf(MySort.bubble(array), MySort.bubble(array).length);
        MyCalculationOut.calMatrixOut(bubbleSortArray);
    }

    void three() {
        System.out.println("""
                3. Поиск простых чисел
                Напишите программу, которая выводит на консоль простые числа в промежутке от [2, n].
                Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы.""");
        System.out.println();

        int n = 100;
        MyCalculationOut.primeNumOut(n);
    }

    void four() {
        System.out.println("""
                4. Удаление из массива
                Дан массив целых чисел и ещё одно целое число. Удалите все вхождения этого числа из массива (пропусков быть не должно).""");
        System.out.println();

        int[] test_array = {0, 1, 2, 2, 3, 0, 4, 2};
        int removeElements = 3;
        MyCalculationOut.removeElementArrayOut(test_array, removeElements);
    }

    void fife() {
        System.out.println("""
                5. Создайте класс, который описывает вектор (в трёхмерном пространстве).
                У него должны быть:
                конструктор с параметрами в виде списка координат x, y, z
                метод, вычисляющий длину вектора.
                метод, вычисляющий скалярное произведение.
                метод, вычисляющий векторное произведение с другим вектором.
                метод, вычисляющий угол между векторами (или косинус угла).
                методы для суммы и разности.
                статический метод, который принимает целое число N, и возвращает массив случайных векторов размером N.
                Если метод возвращает вектор, то он должен возвращать новый объект, а не менять базовый. То есть, нужно реализовать шаблон "Неизменяемый объект""");
        System.out.println();

        MyVector[] myVectors = MyVector.generate(3);
        System.out.println(myVectors[0]);
        System.out.println(myVectors[1]);
        System.out.println(myVectors[0].length());
        System.out.println(myVectors[0].scalarProduct(myVectors[1]));
        System.out.println(myVectors[0].crossProduct(myVectors[1]));
        System.out.println(myVectors[0].cos(myVectors[1]));
        System.out.println(myVectors[0].add(myVectors[1]));
        System.out.println(myVectors[0].subtract(myVectors[1]));
    }

    void six() {
        System.out.println("""
                6. Генерация случайного элемента с весом
                Напишите класс, конструктор которого принимает два массива: массив значений и массив весов значений.
                Класс должен содержать метод, который будет возвращать элемент из первого массива случайным образом, с учётом его веса.
                Пример:
                Дан массив [1, 2, 3], и массив весов [1, 2, 10].
                В среднем, значение «1» должно возвращаться в 2 раза реже, чем значение «2» и в десять раз реже, чем значение «3».""");
        System.out.println();

        int[] values = {1, 2, 3};
        int[] weightValues = {1, 2, 10};
        RandomFromArray randomFromArray = new RandomFromArray(values, weightValues);
        System.out.println("Рандомное число из массива с учетом веса: " + randomFromArray.returnValue());
    }

    void seven() {
        System.out.println("7. Реализация связного списка. Методы add, get, remove.");
        System.out.println();

        var list = new MyLinkedList<String>();
        list.add("aaa");
        list.add("aab");
        list.add("aac");
        list.remove(1);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    void eight() {
        System.out.println("""
                8. Двоичный поиск

                Напишите метод, который проверяет, входит ли в массив заданный элемент или нет.
                Используйте перебор и двоичный поиск для решения этой задачи.
                Сравните время выполнения обоих решений для больших массивов (например, 100000000 элементов).""");
        System.out.println();
        double[] array = new double[100000000];
        Arrays.sort(ArrayFill.arrayFill(array)); // нужно сначала отсортировать

        System.out.println("First method");

        long time = System.currentTimeMillis(); // текущее время, unix-time
        System.out.println(Search.bruteForce(array, 0.5));
        System.out.println(System.currentTimeMillis() - time);

        System.out.println("Second method");

        time = System.currentTimeMillis();
        System.out.println(Search.binarySearchRecursively(array, 0.5));
        System.out.println(System.currentTimeMillis() - time);

    }

    void nine() {
        System.out.println("""
                9. Найдите корень уравнения
                                
                cos(x^5) + x^4 - 345.3 * x - 23 = 0

                на отрезке [0; 10] с точностью по x не хуже, чем 0.001. Известно, что на этом промежутке корень единственный.
                Используйте для этого метод деления отрезка пополам (и рекурсию).""");

        System.out.println(RootOfEquation.solve(0, 10));
    }

    void ten() {
        System.out.println("10. Реализовать бинарное дерево поиска");
        BinarySearchTree tree = new BinarySearchTree();
        // вставляем узлы в дерево:
        tree.insertNode(6);
        tree.insertNode(8);
        tree.insertNode(5);
        tree.insertNode(8);
        tree.insertNode(2);
        tree.insertNode(9);
        tree.insertNode(7);
        tree.insertNode(4);
        tree.insertNode(10);
        tree.insertNode(3);
        tree.insertNode(1);
        // отображение дерева:
        tree.printTree();

        // удаляем один узел и выводим оставшееся дерево в консоли
        tree.deleteNode(5);
        tree.printTree();

        // находим узел по значению и выводим его в консоли
        TreeNode foundNode = tree.findNodeByValue(7);
        foundNode.printNode();
    }

    void eleven() {
        Ball ball = new Ball(4.5);
        Cylinder cylinder = new Cylinder(2, 2);
        Pyramid pyramid = new Pyramid(10, 50);

        Box box = new Box(1000);

        System.out.println(box.add(ball)); // ok
        System.out.println(box.add(cylinder)); // ok
        System.out.println(box.getAvailable());
        System.out.println(box.getVolume());
        System.out.println(pyramid.getVolume());
        System.out.println(box.add(pyramid)); // failed

        // Sorting:
        ArrayList<Shape> shapes = box.getShapes();
        Collections.sort(shapes); // sorted by Volume!
        for (Shape s : shapes) {
            System.out.println(s.toString());
        }
    }

    void twelve() throws Exception {

        String[] strings = {"asldfchvianol", "fakihfao", "askdvubgaoi"};

        MyClass myClass = new MyClass();

        myClass.buildDictionaryWithMap(MyClass.fileToString("A.txt"));

        System.out.println(myClass.censor(MyClass.fileToString("A.txt"), "а"));
        System.out.println(myClass.numOfString(MyClass.fileToString("A.txt"), "а"));
        System.out.println(myClass.isAPolyndrom(MyClass.fileToString("A.txt")));
        System.out.println(myClass.longestString(strings));
    }
}


