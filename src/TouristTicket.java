import java.util.ArrayList;

public class TouristTicket {
    private String hotelAddress;
    private ArrayList<String> locations ;
    private int locationCount=0;
    TouristTicket(){
        locations= new ArrayList<String>();
    }
    public void addTouristLocation(String location){
        if(locationCount<=4){
                locations.add(location);
        }
    }
    public void removeTouristLocation(String location){
        for (int i = 0; i < locations.size(); i++) {
            if(locations.get(i)==location){
                locations.remove(i);
            }
        }
    }
    // this method is for testing purpose

    public String printLocations(){
        String l="";
        for(String i:locations){
            l=l+i+"\n";
        }
        return l;
    }

    public static void main(String[] args) {
        System.out.println("Locations Added");
        TouristTicket tt= new TouristTicket();
        tt.addTouristLocation("italy");
        tt.addTouristLocation("sweden");
        tt.addTouristLocation("japan");
        tt.addTouristLocation("korea");
        System.out.println(tt.printLocations());
        tt.removeTouristLocation("italy");
        tt.removeTouristLocation("japan");
        System.out.println("Locations after removig Italy and japan");
        System.out.println(tt.printLocations());

    }
}
