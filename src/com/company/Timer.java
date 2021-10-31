package com.company;


public class Timer {

    private int hour;
    private int minutes;
    private int seconds;

    public Timer() {
        this.hour = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    public Timer(int hour, int minutes, int seconds) throws BadTimerDataException {

        if (hour <= 0 || hour > 23) {
            throw new BadTimerDataException("Incorrect Hour " + hour);
        } else if (minutes < 0 || minutes >= 59) {
            throw new BadTimerDataException("Incorrect Minutes " + minutes);
        } else if (seconds < 0 || seconds >= 59) {
            throw new BadTimerDataException("Incorrect Seconds " + seconds);
        }

        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void setHour(int hour) throws BadTimerDataException {

        if (hour <= 0 || hour > 23) {
            throw new BadTimerDataException("Incorrect Hour " + hour);
        }

        this.hour = hour;
    }

    public void setMinutes(int minutes) throws BadTimerDataException {

        if (minutes < 0 || minutes >= 59) {
            throw new BadTimerDataException("Incorrect Minutes " + minutes);
        }

        this.minutes = minutes;
    }

    public void setSeconds(int seconds) throws BadTimerDataException {

        if (seconds < 0 || seconds >= 59) {
            throw new BadTimerDataException("Incorrect Minutes " + seconds);
        }

        this.seconds = seconds;
    }

    public int getHour() {
        return hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    @Override
    public String toString() {
        return hour + ":" + minutes + ":" + seconds;
    }

    public void updateTime(int hour, int minutes, int seconds) throws BadTimerDataException {
        if (hour <= 0 || hour > 23) {
            throw new BadTimerDataException("Incorrect Hour " + hour);
        } else if (minutes < 0 || minutes >= 59) {
            throw new BadTimerDataException("Incorrect Minutes " + minutes);
        } else if (seconds < 0 || seconds >= 59) {
            throw new BadTimerDataException("Incorrect Seconds " + seconds);
        }

        this.seconds += seconds;
        if (this.seconds >= 60) {
            this.minutes += 1;
            this.seconds -= 60;
        }

        this.minutes += minutes;
        if (this.minutes >= 60) {
            this.hour += 1;
            this.minutes -= 60;
        }

        this.hour += hour;
        this.hour = this.hour >= 24 ? 0 : this.hour;

    }
}
