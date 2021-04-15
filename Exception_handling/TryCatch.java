import java.io.*;
import java.lang.*;
import java.util.*;
public class TryCatch{
    public static void main(String args[]){
        int i=args.length;
        String myString[]=new String[i];
        try{
        if(myString[0]=="Java")
        System.out.println("First word is Java!");
        System.out.println("Number of arguments "+i);
        int x=18/i;
        int y[]={555,999};
        y[i]=x;
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception occured ...");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound Exception occured ...");
        }
        catch(NullPointerException e)
        {
            System.out.println(e);
        }
        finally{
            System.out.println("Remaining code!");
        }
    }
}