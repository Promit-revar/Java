import java.io.*;
import java.util.*;
class InvalidSumException extends Exception{  
    InvalidSumException(String s){  
     super(s);  
    }  
   }
public class Seventh{
    public static void main(String args[])throws InvalidSumException{
       try{
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter Numbers:");
           int a=sc.nextInt();
           int b=sc.nextInt();
           int c=a+b;
           if(c>100){
               throw new InvalidSumException("Sum exceeds 100!");
           }
           else{
               System.out.println("Sum is "+c);
           }
       }
       catch(Exception e){
           System.out.println("Error occured: "+e);
       }
       finally{
           
           System.out.println("Rest of the statements");
       } 
    }
}