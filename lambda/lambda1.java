import java.util.*;
interface lambda{
    public int sum(int a,int b);
    
}
public class lambda1{
    public static void main(String args[]){
        lambda s=(a,b)->{return a+b; };
        System.out.println(s.sum(25,35));

    }
}