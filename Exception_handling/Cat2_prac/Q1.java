import java.util.*;
import java.io.*;
import java.lang.*;
class Check extends Exception{
     
    Check(String mob){
        
            super("Not Valid!");
       
        
    }
         
}
public class Q1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String reg,mob;
        System.out.println("Enter Reg no.");
        reg=sc.next();
        System.out.println("Enter  mob no.");
        mob=sc.next();
    try{
        if(mob.length() !=10 || reg.length() != 9){
            throw new Check(mob);
        }
        for(int i=0;i<mob.length();i++){
            if(!Character.isDigit(mob.charAt(i))){
                throw new Check(mob);
            }
        }
        for(int i=0;i<reg.length();i++){
            if(!(Character.isDigit(reg.charAt(i)) || Character.isAlphabetic(reg.charAt(i)))){
                throw new Check(mob);
            }
        }
        System.out.println("Valid!!");
        
    }catch(Exception e){
        System.out.println(e);
    }

    }
}