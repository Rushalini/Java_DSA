import java.util.*;
import java.util.Stack;
class StackEx {
    public static void main(String args[]){
        Stack<Integer> al =new Stack<Integer>();
        al.push(10);
        al.push(20);
        al.push(30);
        System.out.println(al.pop());
        System.out.println(al.peek());
        System.out.println(al.isEmpty());
    }
}
