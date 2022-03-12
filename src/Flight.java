public class Flight {

    private int flightNumber;
    private String airline;
    private int capacity;
    private int seatsBooked;

    public String getFlightDetails(){
        return "Flight Number: "+flightNumber+"\n Airline: "+airline+"\n Capacity: "+capacity+"\n Seats Booked: "+seatsBooked;
    }
    public int availableSeats(){
        return capacity-seatsBooked;
    }
    public void bookSeat(){
        seatsBooked+=1;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getSeatsBooked() {
        return seatsBooked;
    }

}
