package Reservation_System;

public abstract class Ticket  {

     long  Ticketnumber;
     String source;
     String destination;
     long bookingnumber;
     int numberseatsbooked;
     int PNR;
     String time_Departure;
     String time_Arrival;
     int priceofticket;
     boolean ticketConfirmed;
     Flight flight;
     Address address;
     Contact contact;



    public
    Ticket(long Ticketnumber, String source, String destination, long bookingnumber, int numberseatsbooked,  String time_Departure, String time_Arrival, int priceofticket, boolean ticketConfirmed, Flight flight,Address address,Contact contact) {
       this.Ticketnumber = Ticketnumber;
        this.source = source;
        this.destination = destination;
        this.bookingnumber = bookingnumber;
        this.numberseatsbooked = numberseatsbooked;
        this.PNR = PNR;
        this.time_Departure = time_Departure;
        this.time_Arrival = time_Arrival;
        this.priceofticket = priceofticket;
        this.ticketConfirmed = ticketConfirmed;
        this.address=address;
        this.contact=contact;



    }

    public abstract void printPNR();





}
