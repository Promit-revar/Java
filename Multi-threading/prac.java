import java.util.*;
import java.io.*;
import java.lang.*;
class T1 extends Thread{
    int n;
    T1(int n){
        this.n=n;

    }
    public void run(){
        synchronized(this){
        try{
        for(int i=1;i<=n;i++){
            System.out.println("Question "+i);
            notify();
            wait(3000);
            

        }
    }
    catch(Exception e){
        System.out.println(e);
    }
    
}
    }
}
class T2 extends Thread{
    int n;
    T2(int n){
        this.n=n;
    }
    public void run(){
        synchronized(this){
        try{
        for(int i=1;i<=n;i++){
             System.out.println("Answer"+i);
             notify();
         wait(3000);
        }
        
         
    }
    catch(Exception e){
        System.out.println(e);
    }
}
    }
}
public class prac{
    public static void main(String args[]){
    T1 thread = new T1(5);
    T2 thread2=new T2(5);
    thread.start();
    thread2.start();

    }
}