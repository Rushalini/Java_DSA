public class Processor {
    int amount=50_000;
    String name="lenovo";
    Processor(){
        System.out.println("Processor");
    }
    void display(){
       
    }
}
class Laptop extends Asus{
    Laptop(){
        super();
        System.out.println(super.name);
        //super();//error should be first statement
        System.out.println("Laptop");
    }
}
class Asus extends Processor{
    Asus(){
        System.out.println(super.name);
        super.display();
        System.out.println("Asus");
    }
}
class Test3{
    public static void main(String[] args) {
        Laptop ob = new Laptop();
        Asus ob1 = new Asus();
    }
}
