public class Parent {
    void who(){
        System.out.println("Parent");
    }
}
class Child extends Parent{
    @Override
    void who(){
        System.out.println("Child");
    }
    void test(){
        this.who();
        super.who();
    }
}
class TestParent{
    public static void main(String[] args) {
        Child c = new Child();
        c.test();
    }
}