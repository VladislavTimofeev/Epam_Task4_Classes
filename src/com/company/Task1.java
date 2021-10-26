package com.company;

//Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
//переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
//наибольшее значение из этих двух переменных.

public class Task1 {
    static int a = 10;
    static int b = 30;

    public static void main(String[] args) {
        print();
    }

    public static int sumAB() {
        return a + b;
    }

    public static int maxValue() {
        return Math.max(a, b);
    }

    public static void print() {
        System.out.println(sumAB());
        System.out.println(maxValue());
    }
}
