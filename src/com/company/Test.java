package com.company;

public class Test {

    //Создать метод который будет складывать 2 числа, если значения >5 то умновать его значения
    // на параметр переданный пользователю, если меньше 5 то делить на параметр переданный пользователем
    //Если финальное значение != 20 возвести число во 2 степень и вернуть отрицательное представление
    //. этого числа

    public static void main(String[] args) {

        Test test = new Test();

        Double print = test.actionAB(1,2,10);
        System.out.println(print);
    }

    public double actionAB(double a, double b, double userParam) {

        double sumAB = a + b;

        if (sumAB > 5) {
            sumAB *= userParam;
        } else if (sumAB < 5) {
            sumAB /= userParam;
        }

        if (sumAB != 20){
            sumAB*=sumAB;
        }

        return -sumAB;
    }
}
