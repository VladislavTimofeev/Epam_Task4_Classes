package com.company;

public class Task6 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        Util.print("Установленное время: " + timer.toString());

        try {
            Timer timer1 = new Timer(12, 13, 45);
            timer1.updateTime(1, 5, 25);
            Util.print(timer1.toString());
            if (timer1.getHour() == 13 && timer1.getMinutes() == 19 && timer1.getSeconds() == 10) {
                Util.print("Все работает верно!");
            } else {
                Util.print("Работает не верно");
            }
        } catch (BadTimerDataException ex) {
            Util.print(ex.getMessage());
        }


    }
}
