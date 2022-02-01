package Reservation_System;

public class Address {

        Passenger passenger;
        private String Street;
        private String City;
        private String State;
        private int zipcode;

        public Address(Passenger passenger, String street, String city, String state, int zipcode) {
                this.passenger = passenger;
                Street = street;
                City = city;
                State = state;
                this.zipcode = zipcode;
        }

        public Passenger getPassenger(String address) {

                return passenger;
        }


        public String getStreet() {
                return Street;
        }

        public void setStreet(String street) {
                Street = street;
        }

        public String getCity() {
                return City;
        }

        public void setCity(String city) {
                City = city;
        }

        public String getState() {
                return State;
        }

        public void setState(String state) {
                State = state;
        }

        public int getZipcode() {
                return zipcode;
        }

        public void setZipcode(int zipcode) {
                this.zipcode = zipcode;
        }
}