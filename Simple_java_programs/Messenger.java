import java.lang.*;
import java.util.Scanner;
class Message{
    private String str;
    Message(String str ){
        this.str=str;
    }
    void print(){
        System.out.println(str);
    }
    void print(String str){
        System.out.println(this.str+" "+str);
    }
}
class Messenger{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String s=sc.nextLine();
    Message obj=new Message(s);
    obj.print();
    s=sc.nextLine();
    obj.print(s);
    }
}