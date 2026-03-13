public class hybrid {
    int amount=50_000;
    String name="lenovo";
    hybrid(){
        System.out.println("Laptop");
    }
    void display(){
        System.out.println(name);
        System.out.println(amount);
    }
}
class Dell extends hybrid{
    Dell(){
        System.out.println("Dell");
    }
}
class Processor extends ausesr{
    Processor(){
        System.out.println("Processor");
    }
}
class ausesr extends hybrid{
    ausesr(){
        System.out.println("asus");
    }
}
class Hybrid1{
    public static void main(String[] args) {
        Processor ob = new Processor();
        ausesr ob1 = new ausesr();
        Dell ob2 = new Dell();
    }
}

