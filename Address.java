package Reservation_System;

public class Address {


        private String Street;
        private String City;
        private String State;
        private int zipcode;

        public Address(String street, String city, String state, int zipcode) {
                Street = street;
                City = city;
                State = state;
                this.zipcode = zipcode;
        }

        public String getStreet() {
                return Street;
        }

        public String getCity() {
                return City;
        }

        public String getState() {
                return State;
        }

        public int getZipcode() {
                return zipcode;
        }


        public void setStreet(String street) {
                Street = street;
        }

        public void setCity(String city) {
                City = city;
        }

        public void setState(String state) {
                State = state;
        }

        public void setZipcode(int zipcode) {
                this.zipcode = zipcode;
        }
}
