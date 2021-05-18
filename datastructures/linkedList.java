import java.util.*;
import java.lang.*;
public class linkedList{
    private static final String colors[] = { "black", "yellow","green", "blue", "violet", "silver" };
    private static final String colors2[] = { "gold", "white","brown", "blue", "gray", "silver" };
    public static void display(List<String> l1){
        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i)+" ");
        }
            System.out.print("\n");
    }
    public static void main(String args[]){
        List<String> l1 = new LinkedList<String>(); 
        List<String> l2 = new LinkedList<String>();       
        for(int i=0;i<colors.length;i++){
            l1.add(colors[i]);  
        }
        for(int i=0;i<colors2.length;i++){
        l2.add(colors2[i]);
        }
        l1.addAll(l2);          
        l2 = null;
        display(l1);                                            
        ListIterator<String> it=l1.listIterator();
            while(it.hasNext()){
                Object obj = it.next();  
                if(obj instanceof String) 
                    it.set(((String)obj).toUpperCase());
            }
        display(l1);
        l1.subList(4,6).clear();
        display(l1);
        ListIterator<String> itr=l1.listIterator(l1.size());
        while(itr.hasPrevious()){
            System.out.print(itr.previous()+" ");
        }
        }
}