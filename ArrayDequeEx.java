import java.util.*;
public class ArrayDequeEx {
    public static void main(String[] args) {
        ArrayList<Integer> al =new ArrayList<Integer>();
        ArrayDeque<Integer> a =new ArrayDeque<Integer>();
        HashSet<Integer> a1 =new HashSet<Integer>();
        TreeSet<Integer> a2=new TreeSet<Integer>();
        LinkedHashSet<Integer>a3=new LinkedHashSet<Integer>();
        a.add(20);
         a.add(700);
         a.add(56);
        // a.addLast(10);
        System.out.println(a1);
     
        System.out.println(a1.contains(10));
        // a.removeFirst();
        System.out.println(a1.remove(10));
        System.out.println(a1);
        // a.addFirst(5);
        // a.removeLast();
        System.out.println(a1.isEmpty());
        System.out.println(a1.size());

    }
}
