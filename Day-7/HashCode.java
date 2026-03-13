public class HashCode {
    public static void main(String[] args) {
        String s="Hello World";
        System.out.println(System.identityHashCode(s));
        String str=new String("Hello World");
        String new_String=new String();
        new_String=str;
        System.out.println(s==str);
        System.out.println(new_String==str);
        System.out.println(new_String==s);
    }   
}
