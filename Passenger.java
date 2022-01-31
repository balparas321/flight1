package Reservation_System;

public class Passenger
{
    private long passengerid;
   private String gender;
    private  Contact contact;
    private  Address address;
    private  Ticket ticket;
    private static int idCounter;


    public Passenger(long passengerid, Contact contact, Address address,String gender, Ticket ticket, int idCounter )
    {   this.passengerid=idCounter;
        this.gender = gender;
        this.contact = contact;
        this.address = address;
        this.ticket = ticket;

    }




    public String getGender() {

        return gender;
    }

    public Contact getContact() {

        return contact;
    }

    public Address getAddress() {

        return address;
    }

    public Ticket getTicket() {

        return ticket;
    }

    public static int getPassengerCount()
    {
       idCounter++;
        return idCounter;
    }
}
