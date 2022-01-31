package Reservation_System;

public class Contact {

        private String name;
        private long phonenumber;
        private String emailid;

        public Contact(String name, long phonenumber, String emailid) {
                this.name = name;
                this.phonenumber = phonenumber;
                this.emailid = emailid;
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
