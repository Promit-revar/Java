import java.util.*;
import java.io.*;
public class Fourth{
    public static void main(String args[]){
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try{
        int a=Integer.parseInt(in.readLine());
        int b=Integer.parseInt(in.readLine());
        }
        catch(IOException e){
            System.out.println("IO exception encountered"+e.getMessage());
        }
        catch(NumberFormatException e){
            System.out.println("Write Valid Input type...\n"+e.getMessage());
        }
    }
}
