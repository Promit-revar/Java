class T1 implements Runnable{
    int acc_no;
    int bal;
    T1(int acc_no,int bal){
        this.acc_no=acc_no;
        this.bal=bal;
    }
    public void run(){
        System.out.println("Thread 1 is running...");
    }
}
public class prac{
    public static void main(String args[]){
        T1 obj=new T1(123,2000);
        Thread t1=new Thread(obj);
        t1.start();
    }
}