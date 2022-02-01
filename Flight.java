package Reservation_System;

public class Flight {

    String flightName;
    int flightnumber;
    String flightstatus;
     int flight_capacity;


    public Flight(String flightName,
                  int flightnumber,
                  String flightstatus,
                  int flight_capacity) {

        this.flightName = flightName;
        this.flightnumber = flightnumber;
        this.flightstatus = flightstatus;
        this.flight_capacity = flight_capacity;

    }

    public int getflightCapacity(){
        return flight_capacity;
    }

    public String getFlightName() {
        return flightName;
    }
}

