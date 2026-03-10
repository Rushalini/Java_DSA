class Parent{
    void who(){
        System.out.println("Parinting");
    }
}
class Child extends Parent{
    @Override
    void who(){
        System.out.println("Childing");

    }
    void test(){
        this.who();
        super.who();
    }
}
public class SuperAndMethod {
    public static void main(String args[]){
        Child c=new Child();
        c.test();
    }
}
