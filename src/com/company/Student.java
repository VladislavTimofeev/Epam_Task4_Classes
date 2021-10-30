package com.company;

//Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
//из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
//номеров групп студентов, имеющих оценки, равные только 9 или 10.

public class Student {
    private String surname;
    private int groupNumber;
    private int[] progress = new int[5];

    public Student() {

    }

    public void addProgress(int position, int progress) {
        if (position > 0 || position < 5) {
            this.progress[position] = progress;
        }
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int[] getProgress() {
        return progress;
    }

    public void setProgress(int[] progress) {
        this.progress = progress;
    }

    @Override
    public String toString() {
        return "surname = " + surname + ", groupNumber = " + groupNumber;
    }
}

