package com.company;

//Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
//переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
//наибольшее значение из этих двух переменных.

public class Task1 {

    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        doLogic(a,b);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int maxValue(int a, int b) {
        return Math.max(a, b);
    }

    public static void doLogic(int a, int b) {
        int sumAB = sum(a, b);
        int maxAB = maxValue(a, b);
        Util.print("sumAB = " + sumAB + " , maxAB= " + maxAB);
    }
}
