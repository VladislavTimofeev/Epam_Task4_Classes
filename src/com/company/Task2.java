package com.company;

//Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте
//конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра
//класса

public class Task2 {
    int s;
    int d;

    public static void main(String[] args) {

    }

    public Task2(int s, int d) {
        this.s = s;
        this.d = d;
    }

    public int getD() {
        return d;
    }

    public int getS() {
        return s;
    }

    public void setD(int d) {
        this.d = d;
    }

    public void setS(int s) {
        this.s = s;
    }
}

