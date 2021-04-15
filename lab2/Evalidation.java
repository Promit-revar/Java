import java.lang.*;
import java.util.Scanner;
class Evalidation{
    public static void main(String args[]){
        String email,domain,rest;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Email id :");
        email=sc.nextLine();
        domain=new String();
        rest=new String();
        domain=email.substring(0,email.indexOf("@"));
        rest=email.substring(email.indexOf("@")+1);
        System.out.println("Domain: "+domain+"\n"+"Rest info: "+rest);
        
    }
}