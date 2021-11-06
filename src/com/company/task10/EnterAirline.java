package com.company.task10;

import com.company.Util;

public class EnterAirline {

    public static void main(String[] args) {
        Airlines airlines = new Airlines(8);

        Airline airline1 = airlines.createAirline("Warsaw", 73290, "passenger", 09.35, "Monday");
        Airline airline2 = airlines.createAirline("Mosсow", 37020, "passenger", 15.55, "Wednesday");
        Airline airline3 = airlines.createAirline("Kiev", 19450, "freight", 13.15, "Friday");
        Airline airline4 = airlines.createAirline("Cyprus", 55490, "passenger", 20.45, "Saturday");
        Airline airline5 = airlines.createAirline("Minsk", 32100, "freight", 13.30, "Everyday");
        Airline airline6 = airlines.createAirline("Kiev", 53380, "passenger", 22.55, "Everyday");
        Airline airline7 = airlines.createAirline("Roma", 10030, "passenger", 05.25, "Tuesday");

        airlines.addNewAirline(1, airline1);
        airlines.addNewAirline(2, airline2);
        airlines.addNewAirline(3, airline3);
        airlines.addNewAirline(4, airline4);
        airlines.addNewAirline(5, airline5);
        airlines.addNewAirline(6, airline6);
        airlines.addNewAirline(7, airline7);

        Airline[] airlineByDestination = airlines.getAirlinesByDestination("Minsk");

        for (Airline airline : airlineByDestination) {
            Util.print(airline.toString());
        }

        Util.print("--------------------");

        Airline[] dayOfWeek = airlines.getAirlinesByDay("everyday");

        for (Airline airline : dayOfWeek) {
            Util.print(airline.toString());
        }

        Util.print("--------------------");

        Airline[] dayOfWeekTime = airlines.getAirlinesByDayAndTime("everyday",18.30);

        for (Airline airline : dayOfWeekTime) {
            Util.print(airline.toString());
        }
    }
}
