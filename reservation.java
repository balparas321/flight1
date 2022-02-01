package Reservation_System;

public class reservation {

    public static void main(String[] args) {

///////////Common for both the passenger we can make different by passing individually via passenger Constructor
        Flight flight = new Flight("AIR INDIA",46656,"REached",100);
        System.out.println("flightcapacity"+" :"+ flight.getflightCapacity());

        // passenger1 details
        Passenger passenger_1=new Passenger(125487,"male",new Regular_Ticket("DAl SABZI","COLD DRINK",true,+58469592),new Tourist_Ticket("HOTEL SUNSHINE ","MUMBAI , PUNE AND TAMIL NADU",79562656),flight);

        passenger_1.printRegularticketdetails();
        passenger_1.printTouristicketdetails();
        passenger_1.flightDetails();

        Contact contact1 = new Contact(passenger_1,"paras",978565221,"abc");
        System.out.println(contact1.getPassenger(978565221));

        Address address1 = new Address(passenger_1,"Gupta colony","AYODHYA","PUNJAB",148761);
        System.out.println(address1.getPassenger("AYODHYA"));
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");


        // passenger2 details
        Passenger passenger2=new Passenger(8752244,"FEMALE",new Regular_Ticket("KADHAI PANEER","SANDWICH",false,97956231),new Tourist_Ticket("HOTEL TAJ","1.INDORE 2.SHIRDI SAI MUMBAI",4846644),flight);

        passenger2.printRegularticketdetails();

        passenger2.printTouristicketdetails();

        passenger2.flightDetails();


       Contact contact2=new Contact(passenger2,"PAYAL",788565552,"abc@gmail.com");
        System.out.println(contact2.getPassenger(788565552));
        Address address2 = new Address(passenger2,"BHATIA colony","RAMPUR","MP",175654);
        System.out.println(address2.getPassenger("RAMPUR"));

         Passenger.getIdCounter();

         // DYNAMIC OR RUN TIME POLYMORPHISM
          Ticket ticket = new Regular_Ticket("SAMOSA","RUSK",true,795421454);
          printticketdetails(ticket);
          Ticket ticket1=new Tourist_Ticket("HOTEL MUMBAI","1:SHIMLA 2:MANALI 3:LADHAK",8959499);
           printticketdetails(ticket1);
         // AS PAYAL name passed in contact CONSTRUCTOR for contact2 before setting value
        System.out.println("BEFORE setting value  of the name for contact 2 :" +"  "+contact2.getName());

        //AS PAYAL name passed in contact CONSTRUCTOR for contact2 after setting value .
       contact2.setName("Rahul");
        System.out.println("AFTER setting value like updation of the name for contact 2 :" +"  "+ contact2.getName());
    }
    public static void printticketdetails(Ticket ticket){

        ticket.printPNR();
    }



}
