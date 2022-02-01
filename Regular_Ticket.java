package Reservation_System;

import java.io.PrintStream;


public class Regular_Ticket extends Ticket {

     long PNR;
    String food;
    boolean water;
    String snacks;


    public Regular_Ticket(String food, String snacks, boolean water,long PNR) {
        super("Regular ticket", 547923, "CHANDIGARH", "CANADA", 7988412, 4, "4:00 AM", "10:00 PM", 35000, true);
        this.PNR=PNR;
        this.food=food;
        this.snacks = snacks;
        this.water = water;

    }
    public void printPNR() {
        System.out.println("Printing PNR from regular ticket:" + " " + PNR);

    }

}