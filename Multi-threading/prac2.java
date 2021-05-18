import java.util.*;
import java.io.*;
class Prime extends Thread{
    int n;
    Prime(int n){
        this.n=n;
        System.out.println();
    }
    boolean isPrime(int p){
        
        for(int i=2;i<p;i++){
            if(p%i==0){
                return false;
            }
        }
        return true;
    }
    public void run(){
        int p=2;
        int i=0;
        synchronized(this){
        try{
            sleep(3000);

        while(i<n){
            if(isPrime(p)){
                System.out.print(p+" ");
                i++;
            }
            p++;
        }
        notify();
    }catch(Exception e){
        System.out.println(e);
    }
}
    }
}
class Fib extends Thread{
    int n;
    Fib(int n){
        this.n=n;
    }
    
    public void run(){
        if(n==0){
            System.out.print(0+" ");
        }
        else if(n==1){
            System.out.print(0+" "+n+" ");
        }
        else{
            Double k=0.0,k1=1.0;
            System.out.print(k+" "+k1+" ");
            for(int i=2;i<=n;i++){
                
                System.out.print((k+k1)+" ");
                
                if(i==5){
                    synchronized(this){
                    try{
                        notify();
                        sleep(3000);
                    }
                    catch(Exception e){
                        System.out.println(e);
                    }
                }

                }
                k1=k+k1;
                k=k1;
            }
        }
    }
}
public class prac2{
    public static void main(String args[]){
        Prime t1=new Prime(25);
        Fib t2=new Fib(10);
        t2.setPriority(8);
        t1.setPriority(5);
        t2.start();
        t1.start();
       

    }
}