package Reservation_System;

public abstract class Ticket  {
      String Ticket_name;
     long  Ticketnumber;
     String source;
     String destination;
     long bookingnumber;
     int numberseatsbooked;
     String time_Departure;
     String time_Arrival;
     int priceofticket;
     boolean ticketConfirmed;





  public  Ticket( String Ticket_name ,long Ticketnumber, String source, String destination, long bookingnumber, int numberseatsbooked, String time_Departure, String time_Arrival, int priceofticket, boolean ticketConfirmed) {
       this.Ticket_name=Ticket_name;
        this.Ticketnumber = Ticketnumber;
        this.source = source;
        this.destination = destination;
        this.bookingnumber = bookingnumber;
        this.numberseatsbooked = numberseatsbooked;
        this.time_Departure = time_Departure;
        this.time_Arrival = time_Arrival;
        this.priceofticket = priceofticket;
        this.ticketConfirmed = ticketConfirmed;



    }

    public abstract void printPNR();





}
