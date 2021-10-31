package com.company;

public class Task5 {

    public static void main(String[] args) {
        DecimalCounter counter = new DecimalCounter();
        Util.print("Значение счетчика №1 : " + counter.getCounter());
        for (int i = 0; i <= 10; i++) {
            counter.increase();
        }
        Util.print("Текущее значение счетчика №1 - " + counter.getCounter());

        DecimalCounter secondCounter = new DecimalCounter(9, 17);
        Util.print("counter = " + secondCounter.getCounter());
        int previousCounter = secondCounter.getCounter();
        secondCounter.increase();
        if (previousCounter + 1 == secondCounter.getCounter()) {
            Util.print("increase работает верно, " + secondCounter.getCounter());
        }

        secondCounter.increase();
        Util.print("counter = " + secondCounter.getCounter());
        int previousCounter2 = secondCounter.getCounter();
        secondCounter.decrease();
        if (previousCounter2 - 1 == secondCounter.getCounter()) {
            Util.print("decrease работает верно, " + secondCounter.getCounter());
        }
    }
}
