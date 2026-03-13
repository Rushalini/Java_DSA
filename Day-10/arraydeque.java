
import java.util.ArrayDeque;
import java.util.LinkedList;

public class arraydeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> a=new ArrayDeque<Integer>();
        a.addLast(10);
        System.out.println(a);//[10]
        a.add(20);
        System.out.println(a);//[10,20]
        a.removeFirst();
        System.out.println(a);//[20]
        a.addFirst(5);
        System.out.println(a);//[5,20]
        a.removeLast();
        System.out.println(a);//[5]
        a.add(12);
        a.add(53);
        a.add(77);
        ArrayDeque<Integer> a1=new ArrayDeque<Integer>();
        a1.addAll(a);
        System.out.println(a);//[5, 12, 53, 77]
        System.out.println(a1);//[5, 12, 53, 77]
        LinkedList<Integer> l=new LinkedList<Integer>();
        l.addAll(a);
        System.out.println(l);//[5, 12, 53, 77]
    }
}
