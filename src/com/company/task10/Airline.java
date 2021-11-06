package com.company.task10;

public class Airline {

    private String destination;
    private int flightNumber;
    private String aircraftType;
    private double departureTime;
    private String daysOfWeek;

    public Airline() {

        this.destination = "";
        this.flightNumber = 0;
        this.aircraftType = "";
        this.departureTime = 0.0;
        this.daysOfWeek = "";

    }

    public Airline(String destination, int flightNumber, String aircraftType,
                   double departureTime, String daysOfWeek) {

        this.destination = destination;
        this.flightNumber = flightNumber;
        this.aircraftType = aircraftType;
        this.departureTime = departureTime;
        this.daysOfWeek = daysOfWeek;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public double getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(double departureTime) {
        this.departureTime = departureTime;
    }

    public String getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(String daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", flightNumber=" + flightNumber +
                ", aircraftType='" + aircraftType + '\'' +
                ", departureTime=" + departureTime +
                ", daysOfWeek='" + daysOfWeek + '\'' +
                '}';
    }
}
