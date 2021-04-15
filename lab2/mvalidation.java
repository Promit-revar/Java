import java.lang.*;
import java.util.Scanner;
class mvalidation{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String mob,mob2;
        System.out.println("Enter Mobile number in format \" xx-xxx-xxxx \"");
        mob=sc.nextLine();
        mob2="";
        mob2=mob2.concat(mob.substring(0,1)).concat("-").concat(mob.substring(1,2)).concat(mob.substring(3,6)).concat(mob.substring(7));
        System.out.println("reformated string:\n"+mob2);
        


    }
}