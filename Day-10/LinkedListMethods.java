import java.util.List;
import java.util.LinkedList;

class LinkedListMethods {
    public static void main(String[] args){
        // List<Integer> al=new LinkedList<Integer>();
        LinkedList<Integer> a2=new LinkedList<Integer>();
        //LinkedList<Integer> a3=new LinkedList<>();
        a2.add(12);
        a2.add(53);
        a2.add(77);
        a2.add(96);
        a2.addFirst(3);
        a2.addLast(99);
        a2.removeFirst();
        a2.removeLast();
        System.out.println(a2);//[12, 53, 77, 96]
    }
}
