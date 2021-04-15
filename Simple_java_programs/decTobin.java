import java.util.Scanner;

class decTobin{
    public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int n;
    
    System.out.println("Enter Number:");
    n=s.nextInt();
    while(n>0){
        System.out.print(n%2);
        n/=2;
    }
    }
}