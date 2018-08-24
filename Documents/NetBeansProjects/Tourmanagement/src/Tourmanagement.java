import java.util.*;
import java.lang.*;

public class Tourmanagement {
    
    public static void main(String[] args) {
        
      List<Town> towns=new ArrayList<Town>();
      Manager manager =new Manager();
      List list = new ArrayList();
      for (int i=1; i<11; i+=1) {
        list.add(i); 
      }
      list.forEach(System.out::println);
      Iterator it = list.iterator();
      if (it.hasNext()){
        Passenger passenger = new Passenger("Sri Lankan");
        int booking=passenger.registerTour((int)(Math.random()*10));
        if (list.contains(booking)){
            manager.reserveTour(new Tour(booking));
            manager.createBill(new Bill (passenger.getName()+booking));
            if (passenger.payment(passenger.getName()+booking)){
                towns.addAll(Arrays.asList(new Town("Colombo"),new Town("Kandy")));
                manager.assignRoute(new Route(towns));
                manager.assignDriver(new Driver());
            }
            else{
                System.out.println("Please complete the tour payment");
            }
        }
        else{
            System.out.println("Invalid tour selection");
        }
       
    }
      else{
          System.out.println("All tours are reserved for "+new Date()+" today");
      }
}}
