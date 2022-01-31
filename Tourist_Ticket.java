package Reservation_System;

public class Tourist_Ticket {

    Ticket ticket;
    String Hoteladdress;
    String  Touristlocation;
    Flight flight;


    public Tourist_Ticket(Ticket ticket, String hoteladdress) {

        this.ticket = ticket;
        Hoteladdress = hoteladdress;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public String getHoteladdress() {
        return Hoteladdress;
    }

    public String getTouristlocation() {
        return Touristlocation;
    }


    public void setTouristlocation(String touristlocation) {

        Touristlocation = touristlocation;
    }
}
