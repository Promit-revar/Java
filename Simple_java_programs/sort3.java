import java.util.Scanner;
class sort3{
    public static void main(String args[]){
        int a,b,c,t;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a,b,c:");
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        if (a > b) { t = a; a = b; b = t; }
        if (a > c) { t = a; a = c; c = t; }
        if (b > c) { t = b; b = c; c = t; }
       System.out.println("a,b,c: "+a+" , "+b+" , "+c);

    }
}