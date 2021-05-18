import java.util.*;
import java.io.*;
import java.lang.*;
class RailwayException extends Exception{
    String tn,dt;
    RailwayException(String s){
        super(s);
    }
}
class SeatsNotAvailableException extends RailwayException{
    SeatsNotAvailableException(String tn,String dt){
        super("There are no seats available for the train "+tn+" on "+dt);
    }
}
class ServiceCancelledException extends RailwayException{
    ServiceCancelledException(String tn){
        super("Service is Cancelled for "+tn);
    }
}
class CounterClosedException extends RailwayException{
    CounterClosedException(){
        super("Counter is closed for booking");
    }
}
public class Q2{
    public static void main(String args[]){
           Scanner sc=new Scanner(System.in);
           String travelDate,Trainno,adults,children;
           System.out.println("Enter train number,adults,children and Travel date in order:");
           Trainno=sc.next();
           adults=sc.next();
           children=sc.next();
           travelDate=sc.next();
           try{
               if(travelDate.equalsIgnoreCase("29/09/2019") && Trainno.equalsIgnoreCase("12842")){
                   throw new SeatsNotAvailableException(Trainno,travelDate);
               }
           }
           catch(Exception e){
               System.out.println(e);
           }

    }
}