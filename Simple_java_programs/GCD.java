import java.util.Scanner;
class GCD{
    public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int x,y;
    System.out.println("Enter numbers : ");
    x=s.nextInt();
    y=s.nextInt();
    while(x>0 && y>0){
        if(x>y){
            x=x%y;
        }
        else{
            y=y%x;
        }

    }
    if(x==0){
        System.out.println("GCD is: "+y);
    }
    else{
        System.out.println("GCD is: "+x);
    }
    }
}