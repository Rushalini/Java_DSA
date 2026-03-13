public class LaptopSingleInheritance {
    int amount=50_000;
    String name="lenovo";
    LaptopSingleInheritance(){
        System.out.println("Laptop");
    }
    void display(){
        System.out.println(name);
        System.out.println(amount);
    }
}
class Dell extends LaptopSingleInheritance{
    Dell(){
        System.out.println("Dell");
    }
}
class Test1{
    public static void main(String[] args) {
        Dell ob = new Dell();
        System.out.println(ob.name);
        System.out.println(ob.amount);
        ob.display();
    }
}
