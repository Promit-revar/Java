import java.io.*;
import java.lang.*;
class PrintText_Thread extends Thread{
    int n;
    String text;
    PrintText_Thread(String text,int n){
        this.text=text;
        this.n=n;
    }
    public void run(){
       synchronized(this){
           
       this.print(text,n);
      
      
       }
    }
    void print(String text,int n){
        for(int i=0;i<n;i++){
            System.out.println(text);
        }
        
    }
}


public class ob{
    public static void main(String args[]){
        
      PrintText_Thread thread_1=new PrintText_Thread("I am in FY",10);
       PrintText_Thread thread_2=new PrintText_Thread("I am in SY",20);
       PrintText_Thread thread_3=new PrintText_Thread("I am in TY",30);
       
        thread_1.start();
        thread_2.start();
        
        thread_3.start();
        
        
    }
}