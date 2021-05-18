import java.util.*;
public class HM{
    public static void main(String args[]){
        Map<String,Integer> map=new HashMap<>();
        map.put("Promit",1);
        map.put("Radhika",2);
        map.put("Sid",3);
        for(Map.Entry<String,Integer> en:map.entrySet()){
            System.out.println("name: "+en.getKey()+" Value: "+en.getValue());
        }
    }
}