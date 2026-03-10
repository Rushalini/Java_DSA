import java.util.ArrayList;
import java.util.List; 
import java.lang.*;
public class ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> a =new ArrayList<Integer>();
        a.add(12);
        a.add(33);
        a.add(77);
        a.add("abc");
        a.add("xyz");
        System.out.println(a.get(0));
        System.out.println(a.get(1));
        System.out.println(a.get(2));
        System.out.println(a.indexOf(33));
        System.err.println(a.set(1,78));
        System.err.println(a.get(1));
        System.err.println();

        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));    
        }
        for(Integer i:a){
            System.out.println(i);
        }
    }
    
}
