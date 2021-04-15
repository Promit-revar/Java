import java.io.*;
public class ValidInvalid{
    public static void main(String args[]){
        for(int i=0;i<8;i++){
            Boolean f = Character.isDigit(args[i].charAt(0));
            try{
            if(!f){
                throw new ArithmeticException();
            }
            System.out.println("Valid number at "+i+" "+args[i]);
            
        }
    catch(ArithmeticException e){
        System.out.println("Invalid number at "+i+" "+args[i]);
    }
    }
}
}