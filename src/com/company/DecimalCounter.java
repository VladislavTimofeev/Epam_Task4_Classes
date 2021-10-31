package com.company;

public class DecimalCounter {

    private int counter;
    private final int minValue;
    private final int maxValue;


    public DecimalCounter() {
        this.counter = 0;
        this.minValue = 0;
        this.maxValue = 100;
    }

    public DecimalCounter(int minValue, int maxValue) {
        this.counter = minValue;
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    int getCounter() {
        return this.counter;
    }

    public void increase() {
        counter++;
        if (counter == maxValue) {
            Util.print("Вы достигли максимального значения");
        } else if (counter > maxValue) {
            Util.print("Вы вышли за пределы диапазона");
            counter--;
        }
    }

    public void decrease() {
        counter--;
        if (counter == minValue) {
            Util.print("Вы достигли минимального значения");
        } else if (counter < minValue) {
            Util.print("Вы вышли за пределы диапазона");
            counter++;
        }
    }

}
