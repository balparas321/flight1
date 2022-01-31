package Reservation_System;

import java.io.PrintStream;

public class Regular_Ticket extends Ticket{


    String food;
    boolean water;
    String snacks;


    public Regular_Ticket(String food, String snacks,boolean water) {
        super(46245,"Chd","MP",6622,5,"9:am","11:00am",5000,true,new Flight("AIR INDIA",6262,"Confirmed",80),new Address("Gupta colony","Kalka","Haryana",133302),new Contact("Paras",97292254,"parasramola972@gmail.com"));
        this.food=food;
        this.snacks=snacks;
        this.water= water;

    }
       public void printticketdetails(){
           System.out.println( "ticket number: " + Ticketnumber + " Source: " + source + " destination: " + destination +  " booking number: " + bookingnumber + " Numberseatsbooked: " + numberseatsbooked + " Time_Departure: " + time_Departure + " time_Arrival: " + time_Arrival +  " Priceofticket: " + priceofticket + " TicketConfirmed: " + ticketConfirmed );

       }




    public void printPNR() {

    }

    public void getFlight() {
        System.out.println();

    }



    public String  getFood() {
        System.out.println(food);
        return food;
    }


    public boolean isWater() {
        System.out.println(isWater());
        return water;
    }

    public String getSnacks() {
        System.out.println(snacks);
        return snacks;
    }


    public void setFood(String food) {
        this.food = food;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public void setSnacks(String snacks) {
        this.snacks = snacks;
    }
}
