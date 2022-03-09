public class Passenger {
    private static int idCounter;


    Passenger(){
        Address address=new Address();
        Contact contact=new Contact();
        idCounter++;
    }

    private static class Address {
        private String street;
        private  String city;
        private  String state;

        public String getAddressDetails(){
            return "Street: "+street+"\n City: "+city+"\n State: "+state;

        }
        public void updateContactDetails(String street,String city,String state){
            this.street=street;
            this.city=city;
            this.state=state;
        }


        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
    }
    private static class Contact {
        private String name;
        private String phoneNumber;
        private String emailId;

        public String getContactDetails(){
            return "Name: "+name+"\n phoneNumber: "+phoneNumber+"\n Email Id: "+emailId;

        }
        public void updateContactDetails(String name,String phoneNumber,String emailId){
            this.name=name;
            this.phoneNumber=phoneNumber;
            this.emailId=emailId;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getEmailId() {
            return emailId;
        }

        public void setEmailId(String emailId) {
            this.emailId = emailId;
        }
    }

}
