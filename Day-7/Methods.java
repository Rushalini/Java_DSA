import java.util.*;
public class Methods {
    static int p=10;
    static int gst=2;
    static void display(){
        System.out.println("Displaying Total");
        System.out.println(p+gst);
        return;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Methods ob =new Methods();
        ob.display();
        sc.close();
    }
}