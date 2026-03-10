
class A{
    void speak(int i){
        System.out.println("Animal");
    }
    void speak(double d){
        System.out.println("Overloading");

    }
}
class B extends A{
    @Override
    void speak(int i){
        System.out.println("Overriding");

    }
}

public class MethodOverloadAndOverride {
    public static void main(String args[]){
        A a=new B();//upcasting
        B b=(B)a;//DownCasting
        a.speak(10);
        a.speak(0.2);

    }
}

