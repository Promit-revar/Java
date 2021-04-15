import java.util.*;
import java.io.*;
class BalanceInsufficientException extends Exception{
    BalanceInsufficientException(){
        super("Balance is insufficient for making Withdrawl transaction...");
    }
}
class Account{
    int acc_no;
    int bal;
    Account(int n,int bal){
        acc_no=n;
        this.bal=bal;
    }
    
    public void withdrawal_deposit(int amt){
        DepoThread t1=new DepoThread(amt,this.bal);
        
        WithdrawThread t2=new WithdrawThread(amt,this.bal);
        t1.start();
        t2.start();
        
        
    }
}
class DepoThread extends Thread{
    int amt,bal;
    DepoThread(int amt,int bal){
        this.amt=amt;
        this.bal=bal;
    }
    public void run(){
        this.bal+=amt;
        System.out.println("Your balance is: "+this.bal);

    }
}
class WithdrawThread extends Thread{
    int amt,bal;
    WithdrawThread(int amt,int bal){
        this.amt=amt;
        this.bal=bal;
    }
    public void run(){
       try{
            if(amt>=this.bal){
                throw new BalanceInsufficientException();
            }
        else{
            this.bal-=amt;

        
    }
}
catch(BalanceInsufficientException e){
    System.out.println(e.getMessage());
}
finally{
    System.out.println("Your balance is: "+this.bal);
}
   
    
    }
    
}
public class BankAccount{
    public static void main(String args[]){
        int bal,acc_no;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Your account number: ");
        acc_no=s.nextInt();
        System.out.println("Enter Balance for "+acc_no+": ");
        bal=s.nextInt();

        Account obj=new Account(acc_no,bal);
        System.out.println("Enter Amount to deposit and withdraw: ");
        int amt=s.nextInt();
        
        
        obj.withdrawal_deposit(amt);
       
       
        
    }
}