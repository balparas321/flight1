package Reservation_System;

public class Contact {
        Passenger passenger;
        private String name;
        private long phonenumber;
        private String emailid;

        public Contact(Passenger passenger, String name, long phonenumber, String emailid) {
                this.passenger = passenger;
                this.name = name;
                this.phonenumber = phonenumber;
                this.emailid = emailid;
        }

        public Passenger getPassenger(int phonenumber) {

                return passenger;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public long getPhonenumber() {
                return phonenumber;
        }

        public void setPhonenumber(long phonenumber) {
                this.phonenumber = phonenumber;
        }

        public String getEmailid() {
                return emailid;
        }

        public void setEmailid(String emailid) {
                this.emailid = emailid;
        }
}