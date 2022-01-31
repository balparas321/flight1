package Reservation_System;

public class Flight {

   private String flightName;
    private int flightnumber;
    private String flightstatus;
    private int flight_capacity;

    public Flight(String flightName,
                  int flightnumber,
                  String flightstatus,
                  int flight_capacity) {
        this.flightName = flightName;
        this.flightnumber = flightnumber;
        this.flightstatus = flightstatus;
        this.flight_capacity = flight_capacity;

    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public int getFlightnumber() {
        return flightnumber;
    }

    public void setFlightnumber(int flightnumber) {
        this.flightnumber = flightnumber;
    }

    public String getFlightstatus() {
        return flightstatus;
    }

    public void setFlightstatus(String flightstatus) {
        this.flightstatus = flightstatus;
    }

    public int getFlight_capacity() {
        return flight_capacity;
    }

    public void setFlight_capacity(int flight_capacity) {
        this.flight_capacity = flight_capacity;
    }




    }


