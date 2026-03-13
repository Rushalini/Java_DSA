
import java.util.Scanner;

public class stringbuilder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=new String();
        StringBuilder sb=new StringBuilder();
        System.out.println(s.length());
        System.out.println(sb.length());
        s="Laptop";
        s=s+s;
        sb.append("Laptop13242334");
        System.out.println(s.length());
        System.out.println(sb.length());
        System.out.println(s);
        System.out.println(sb);
        System.out.println(sb.capacity());
        sc.close();
    } 
}
