import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueMethod {
    public static void main(String[] args) {
        PriorityQueue<Integer> p=new PriorityQueue<Integer>(Collections.reverseOrder());
        p.offer(10);
        p.offer(1);
        p.offer(4);
        p.offer(-1);
        System.out.println(p);//[10,1,4,-1]
        System.out.println(p.poll());//10
        System.out.println(p.poll());//4
        System.out.println(p.poll());//1
        System.out.println(p.peek());//-1
        System.out.println(p.isEmpty());//false
    }
}
