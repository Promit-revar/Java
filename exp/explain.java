import java.util.Scanner;
class Rect{
    int len,breath;
    int area;
    Scanner sc=new Scanner(System.in);
    Rect(){
        len=sc.nextInt();
        breath=sc.nextInt();
        area=len*breath;
    }
}
class explain{
    public static void main(String args[])
    {
        

        Rect[] obj;
        obj=new Rect[3];
       
        //System.out.println(obj[0].breath);
        for(int i=0;i<3;i++){
            obj[i]=new Rect();
           
        }
        for(Rect i:obj){
            System.out.println("length: "+i.len+"\n"+"Breath: "+i.breath+"Area: "+i.area);
        }
    }
}