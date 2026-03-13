public class instance {
    
}
class A{

}
class B extends A{

}
class Testinstance{
    public static void main(String[] args) {
        A ob = new B();
        B obj = (B)ob;
        System.out.println(ob instanceof A);
        System.out.println(ob instanceof B);
    }
}
