class Account{
    int bal;
    public synchronized void withdraw(int amt){
      if(this.bal<=amt){
          System.out.println("Not enough funds...Wait for deposit");
          try{
              wait();
          }catch(Exception e){

          }
      }
      System.out.println("Funds granted...");
    }
    public synchronized void deposit(int amt){
        this.bal+=amt;
        System.out.println("Deposited...");
        try{
            notify();
        }
        catch(Exception e){

        }
    }
}
class T1 extends Thread{
    int amt;
    Account obj;
      T1(int amt,Account obj){
         this.amt=amt;
         this.obj=obj;
      }
    public void run(){
        
        obj.withdraw(amt);
    }
}
class T2 extends Thread{
    int amt;
    Account obj;
    T2(int amt,Account obj){
        this.amt=amt;
        this.obj=obj;
    }
    public void run(){
        
        obj.deposit(amt);
    }
}
public class objclass{
    public static void main(String args[]){
        Account obj=new Account();
        T1 thread_1=new T1(12000,obj);
        T2 thread_2=new T2(15000,obj);
        thread_1.start();
        thread_2.start();



    }
}