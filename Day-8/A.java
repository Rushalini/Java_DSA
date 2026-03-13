public class A {
    void method(int i){
        System.out.println("Class A int method");
    }
    void method(double d){
        System.out.println("Class A double method");
    }
}
class B extends A{
    @Override
    void method(int i){
        System.out.println("Class B int method");
    }
}
class OverloadingOverriding{
    public static void main(String[] args) {
        B ob = new B();
        ob.method(10);
    }
}
