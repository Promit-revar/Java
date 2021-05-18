import java.util.*;
public class Arrlist{
    public static void main(String args[]){
        Collection<Integer> arrlist=new ArrayList<>();
        for(int i=0;i<10;i++){
            arrlist.add(i);
        }
        for(int i: arrlist){
            System.out.println(i);
        }
        if(arrlist.contains(2)){
            System.out.println("Yes 2 is present");
        }
        String arr=arrlist.toString();
        System.out.println(arr);
        Iterator<Integer> it=arrlist.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

}