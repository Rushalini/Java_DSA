import java.util.*;
public class HashMapping {
    public static void main(String[] args) {
        HashMap<Integer,String> a1 =new HashMap<Integer,String>();
        a1.put(1,"Reena");
        a1.put(2,"Glory");
        a1.put(3,"Joy");
        a1.put(5,"shalini");

        
         System.out.println(a1.get(1));
        System.out.println(a1.get(2));
        System.out.println(a1.get(5));
        a1.remove(2);
        System.out.println(a1.containsKey(2));

    }
}
