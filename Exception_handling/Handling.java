import java.io.*;
import java.util.*;
public class Handling{
    public static void main(String [] args){
        
        int[] arr = new int[]{ 1,2,3,4,5}; 
        for(int i:arr){
            System.out.println(i);
        }
        try{
            for(int i=0;i<20;i=(i*i)+1){
                System.out.println("Valid index having value"+arr[i]);
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("filIn: "+e.fillInStackTrace());
            System.out.println("cause: "+e.getCause());
            System.out.println("local: "+e.getLocalizedMessage());
            System.out.println("messa: "+e.getMessage());
            System.out.println("Trace: "+e.getStackTrace());
            System.out.println("trace: ");
            e.printStackTrace();
            System.out.println("String: ");
            e.toString();
            throw (ArrayIndexOutOfBoundsException)new Exception().initCause(e);

        }
    }
}