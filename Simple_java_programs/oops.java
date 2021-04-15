import java.util.*;
class demo{
    static int count=0;
    String name;
    int age;
    demo(String name,int age){
        this.name=name;
        this.age=age;
        demo.count++;
    }
    void display(){
        System.out.println("Name "+name);
        System.out.println("Age "+age);
        System.out.println("No. of entries "+demo.count);
    }
}
class oops{
    public static void main(String args[]){
        String name;
        int age;
        Scanner s=new Scanner(System.in);
        name=s.nextLine();
        age=s.nextInt(); 
        demo obj=new demo(name,age);
        
        obj.display();
        name=s.next();
        age=s.nextInt(); 
        demo obj2=new demo(name,age);
        obj2.display();
    }
}