import java.lang.*;
import java.util.*;
import java.io.*;
public class Wrapper{
    
    static void convo(){
        try{
        int a=Integer.parseInt("1_000_000");
        System.out.println("Integer of: "+"1_000_000"+" is: "+a);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }
        double d=Double.parseDouble("1E6");
        System.out.println("Double of: "+"1E6"+" is: "+d);
        boolean b1=Boolean.parseBoolean("true");
        System.out.println("Boolean object of 'true': "+" is: "+b1);
        Character ch = new Character('A');
        System.out.println("Character object of 'A': "+" is: "+ch);
        
       


    }
    public static void main(String args[]){
        convo();
    }
}