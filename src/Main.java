import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalTime toa1 = LocalTime.of(10,43,12);
        LocalTime tod1 = LocalTime.of(2,9,15);
        LocalTime toa2 = LocalTime.of(8,23,01);
        LocalTime tod2 = LocalTime.of(14,55,30);
        LocalDate doa1 = LocalDate.of(2017, 1, 13);
        LocalDate dod1 = LocalDate.of(2017, 1, 14);
        LocalDate dod2 = LocalDate.of(2021, 7, 18);
        LocalDate doa2 = LocalDate.of(2021, 7, 17);
        Ticket rt=new RegularTicket(1001, "chennai","washington","Qatar Airways", dod1,tod1, doa1, toa1, 15, 45664,"Hilton Garden Inn Reagan National Airport,Washington, District of Columbia, United States of America",true,true,true);
        Ticket tt=new TouristTicket(2005, "mumbai", "washington", "Dolphin Airways", dod2,tod2,doa2, toa2,27, 52254,"ARC HOTEL Washington DC, Georgetown");
        printTicketDetails(rt);
        printTicketDetails(tt);


    }
    public static void printTicketDetails(Ticket ticket){
        System.out.println(ticket.getPnrNumber());
    }

}
