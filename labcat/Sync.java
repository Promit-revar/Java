import java.lang.*;
import java.io.*;
class Resource{
    public synchronized void printer(int n,String name){
        for(int i=0;i<=n;i++){
            System.out.println(name+" "+i);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println("Terminated "+name);
            }
        }
    }
}
class T1 extends Thread{
    String name;
    T1(String name){
        this.name=name;
    }
    public void run(){
        Resource r=new Resource();
        r.printer(5,name);
    }
}
class T2 extends Thread{
    String name;
    T2(String name){
        this.name=name;
    }
    public void run(){
        Resource r=new Resource();
        r.printer(10,name);
    }
}
public class Sync{
    public static void main(String args[]){
        T1 obj=new T1("Thread_1");
        T2 o=new T2("Thread_2");
        obj.start();
        o.start();
    }
}