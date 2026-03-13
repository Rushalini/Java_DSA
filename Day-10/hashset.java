
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> h=new HashSet<Integer>();
        LinkedList<Integer> l=new LinkedList<Integer>();
        TreeSet<Integer> t=new TreeSet<Integer>();
        h.add(10);
        h.add(20);
        h.add(30);
        System.out.println(h);//[20, 10, 30]
        System.out.println(h.contains(10));//true
        System.out.println(h.remove(10));//true
        System.out.println(h);//[20,30]
        System.out.println(h.isEmpty());//false
        System.out.println(h.size());//2

        Iterator<Integer> i=h.iterator();
        while(i.hasNext()){
            System.out.println(i.next());//20\n30
        }
    }
}
