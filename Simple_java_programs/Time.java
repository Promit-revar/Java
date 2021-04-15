import java.util.Scanner;
class Timer{
    int min,hrs,secs;
    Timer(){
        min=0;
        hrs=0;
        secs=0;
    }
    Timer(int min,int hrs,int secs){
        this.hrs=hrs;
        this.min=min;
        this.secs=secs;
    }
    void display(){
        System.out.println(hrs+":"+min+":"+secs);
    }
    Timer display(Timer obj1,Timer obj2){
        Timer obj3=new Timer();
        obj3.hrs=obj1.hrs+obj2.hrs;
        obj3.hrs=obj3.hrs%24;
        obj3.min=obj1.min+obj2.min;
        if(obj3.min>=60){
        obj3.min%=60;
        obj3.hrs+=1;
        obj3.hrs=obj3.hrs%24;
        }
        obj3.secs=obj1.secs+obj2.secs;
        if(obj3.secs>=60){
            obj3.secs%=60;
            obj3.min+=1;
            if(obj3.min>=60){
                obj3.min%=60;
                obj3.hrs+=1;
                }
            }
        return obj3;

    }
}
class Time{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int hrs,min,secs;
    System.out.println("Enter Hours for Timer 1: ");
    hrs=sc.nextInt();
    System.out.println("Enter minutes for Timer 1: ");
    min=sc.nextInt();
    System.out.println("Enter seconds for Timer 1: ");
    secs=sc.nextInt();
    final Timer obj1=new Timer(hrs,min,secs);
    System.out.println("Enter Hours for Timer 2: ");
    hrs=sc.nextInt();
    System.out.println("Enter minutes for Timer 2: ");
    min=sc.nextInt();
    System.out.println("Enter seconds for Timer 2: ");
    secs=sc.nextInt();
    final Timer obj2=new Timer(hrs,min,secs);
    Timer obj3=obj2.display(obj1,obj2);
    obj3.display();
    }
}