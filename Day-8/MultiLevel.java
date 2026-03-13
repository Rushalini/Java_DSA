public class MultiLevel {
    int amount=50_000;
    String name="lenovo";
    MultiLevel(){
        System.out.println("Laptop");
    }
    void display(){
        System.out.println(name);
        System.out.println(amount);
    }
}
class Dell extends MultiLevel{
    Dell(){
        System.out.println("Dell");
    }
}
class Processor extends Dell{
}
class Multi{
    public static void main(String[] args) {
        Processor ob = new Processor();
    }
}

