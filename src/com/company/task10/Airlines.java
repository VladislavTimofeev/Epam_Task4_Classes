package com.company.task10;

public class Airlines {

    private final Airline[] airlines;

    public Airlines(int size) {
        airlines = new Airline[size];
    }

    public void addNewAirline(int index, Airline airline) {
        if (index >= 0 && index < airlines.length) {
            this.airlines[index] = airline;
        }
    }

    public Airline getAirlineByIndex(int index) {
        if (index >= 0 && index < airlines.length) {
            return airlines[index];
        } else {
            return null;
        }
    }

    public Airline createAirline(String destination, int flightNumber, String aircraftType,
                                 double departureTime, String daysOfWeek) {

        Airline airline = new Airline();

        airline.setDestination(destination);
        airline.setFlightNumber(flightNumber);
        airline.setAircraftType(aircraftType);
        airline.setDepartureTime(departureTime);
        airline.setDaysOfWeek(daysOfWeek);

        return airline;
    }

    public Airline[] getAirlinesByDestination(String destination) {

        Airline[] filteredAirlinesByDestination = new Airline[this.airlines.length];
        int index = 0;

        for (Airline airline : this.airlines) {
            if (airline != null && airline.getDestination().equalsIgnoreCase(destination)) {
                filteredAirlinesByDestination[index++] = airline;
            }
        }

        Airline[] array = createArrayWithoutNullElements(index,filteredAirlinesByDestination);

        return array;
    }

    public Airline[] getAirlinesByDay(String daysOfWeek) {

        Airline[] filteredAirlinesByDay = new Airline[this.airlines.length];
        int index = 0;

        for (Airline airline : this.airlines) {
            if (airline != null && airline.getDaysOfWeek().equalsIgnoreCase(daysOfWeek)) {
                filteredAirlinesByDay[index++] = airline;
            }
        }

        Airline[] array = createArrayWithoutNullElements(index,filteredAirlinesByDay);

        return array;
    }

    public Airline[] getAirlinesByDayAndTime(String daysOfWeek, double departureTime) {

        Airline[] filteredAirlinesByDayTime = new Airline[this.airlines.length];
        int index = 0;

        for (Airline airline : this.airlines) {
            if (airline != null && airline.getDaysOfWeek().equalsIgnoreCase(daysOfWeek) && airline.getDepartureTime() > departureTime) {
                filteredAirlinesByDayTime[index++] = airline;
            }
        }

        Airline[] arrayWithoutNull = createArrayWithoutNullElements(index,filteredAirlinesByDayTime);
        return arrayWithoutNull;
    }

    private Airline[] createArrayWithoutNullElements(int index,Airline[] array) {

        Airline[] finalAirlines = new Airline[index];
        for (int i = 0; i < index; i++) {
            if (array[i] != null) {
                finalAirlines[i] = array[i];
            }
        }
        return finalAirlines;
    }
}
