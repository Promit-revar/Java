import java.util.*;
import java.io.*;
public class Arrayexp{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Number of elements in the array: ");
       int size=sc.nextInt();
       int a[]=new int[size];
       System.out.println("Enter elements in the array: ");
       try{
       for(int i=0;i<size;i++){
           a[i]=sc.nextInt();
       }
       System.out.println("Enter index of array element you want to access: ");
       int i=sc.nextInt();
       System.out.println("element at index "+i+"="+a[i]+"\nThe array element successfully accessed");
       
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println(e.getClass().getCanonicalName());
    }
    catch(InputMismatchException e){
        System.out.println(e.getClass().getCanonicalName());
    }
    }
}