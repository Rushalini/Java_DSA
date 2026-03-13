import java.util.Stack;

public class StackMethods {
    public static void main(String[] args) {
        Stack<Integer> al=new Stack<Integer>();
        //Last in First Out
        al.push(10);
        al.push(20);
        al.push(30);
        System.out.println(al);//[10,20,30]
        System.out.println(al.pop());//30
        System.out.println(al.peek());//20
        System.out.println(al.isEmpty());//false
    }
}
