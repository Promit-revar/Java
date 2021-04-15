class AccountNumber{
    int accn;
    static int bal;
    void setter(int accn,int bal){
       this.accn=accn;
       AccountNumber.bal=bal;
    }
    void withdarw(int amt,int min){
        if(amt>bal-min){
            System.out.println("Insufficeint funds...");
        }
        else{
            AccountNumber.bal-=amt;
        }
    }
    void deposit(int amt){
        AccountNumber.bal+=amt;
    }
    void checkbal(){
        System.out.println("Balance present: "+AccountNumber.bal);
    }

}
class Savings extends AccountNumber{
    int minbal;
    void setter(int minbal){
       this.minbal=minbal;
    }
    int getter(){
        return minbal;
    }
    void withdarw(int amt){
       super.withdarw(amt,minbal);
    }
    
    

}
class Current extends AccountNumber{
    int minbal;
    void setter(int minbal){
       this.minbal=minbal;
    }
    int getter(){
        return minbal;
    }
}
class Account{
    public static void main(String args[]){
        AccountNumber ob=new AccountNumber();
        ob.setter(1234,21000);
        Savings op=new Savings();
        op.setter(2000);
        ob.checkbal();
        op.withdarw(20000);
        ob.deposit(3000);
        ob.checkbal();
    }
}