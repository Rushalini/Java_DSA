class Arithmetic{
    int add(int a,int b){
        return a+b;
    }
}
class Adder extends Arithmetic{
    
}
public class Solution{
    public static void main(String []args){
        Adder a = new Adder();
        Arithmetic b=new Arithmetic();
        System.out.println(a.getClass());
        System.out.println(a.getClass().getName());
        System.out.println(b.getClass());
        System.out.println(a.getClass().getSuperclass().getName());
    }
}