package Reservation_System;

public class Tourist_Ticket extends Ticket {

    long PNR;
    String Hoteladdress;
    String  Touristlocation;



    public Tourist_Ticket( String hoteladdress,String Touristlocation,long PNR) {
        super("Tourist Ticket",479221,"MUMBAI","DELHI",795654,2,"8:00 AM","11:00",3000,false);

        this.PNR=PNR;
        this.Hoteladdress = Hoteladdress;
        this.Touristlocation=Touristlocation;
    }


    @Override
    public void printPNR() {
        System.out.println("Printing PNR from Tourist ticket:"+" "+PNR);

    }
}
