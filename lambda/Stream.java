import java.util.*;
import java.util.stream.Collectors; 
public class Stream{
    public static void main(String args[]){
        List<Integer> nums=new ArrayList<Integer>();
        for(int i=1;i<10;i++){
            nums.add(i);
        }
        nums.forEach(
            (nos)->System.out.print(nos+" ")
        );
        System.out.print("\n");
        List<Integer> res=nums.stream().map(x->x*x).collect(Collectors.toList());
        res.stream().sorted().filter(x->x%2==0).forEach(
            (mapped)->System.out.print(mapped+" ")
        );

    }
}