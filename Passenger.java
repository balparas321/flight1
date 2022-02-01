package Reservation_System;

public class Passenger {
    Contact contact;
    Address address;
    long passengerid;
    String gender;
    Regular_Ticket regular_ticket;
    Tourist_Ticket tourist_ticket;
    private static int idCounter=0;
    Flight flight;

    public Passenger(long passengerid, String gender, Regular_Ticket regular_ticket, Tourist_Ticket tourist_ticket, Flight flight) {
        this.passengerid = idCounter;
        idCounter++;
        this.contact=new Contact(this,"name",972972254,"parasramola222@gmail.com");
        this.address=new Address(this,"BITNA seuri","KALKA","HARYANA",133302);
        this.gender = gender;
        this.regular_ticket = regular_ticket;
        this.tourist_ticket = tourist_ticket;
        this.flight = flight;
    }

    public void flightDetails(){
        System.out.println(flight.flightName+" "+ flight.flightnumber+" "+ flight.flightstatus+" "+flight.flight_capacity);
    }

    public void printRegularticketdetails(){
        System.out.println(regular_ticket.Ticket_name+" "+regular_ticket.snacks+" "+regular_ticket.PNR+ " " +regular_ticket.food+ " "+ regular_ticket.water+" "+regular_ticket.priceofticket+" "+regular_ticket.source+" "+regular_ticket.destination+" "+ regular_ticket.time_Arrival+" "+ regular_ticket.time_Departure+" "+ regular_ticket.numberseatsbooked+" "+regular_ticket.bookingnumber+" "+regular_ticket.ticketConfirmed);
    }
    public void printTouristicketdetails(){
        System.out.println(tourist_ticket.Ticket_name+" "+tourist_ticket.Touristlocation+" "+ tourist_ticket.Hoteladdress+" "+ tourist_ticket.priceofticket+" "+tourist_ticket.source+" "+tourist_ticket.destination+" "+ tourist_ticket.PNR+" "+tourist_ticket.time_Arrival+" "+ tourist_ticket.time_Departure+" "+ tourist_ticket.numberseatsbooked+" "+tourist_ticket.bookingnumber+" "+tourist_ticket.ticketConfirmed);
    }


    public static int getIdCounter() {
        System.out.println("Number of PASSENGER REGISTERED :"+" "+idCounter);
        return idCounter;
    }
}

