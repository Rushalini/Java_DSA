// import java.util.Scanner;
class Laptop{
    private String name="Dell";
    private int amount=70_000;
    public void Set(String name,int amount){
        this.name=name;
        this.amount=amount;
    }
    public void get(){
        System.out.println(name);
        System.out.println(amount);
    }
    public String getName(){
        return name;
    }
}
class Basic extends Laptop{
    public static void main(String[] args) {
        Laptop ob = new Laptop();
        //System.out.println(ob.name);
        //System.out.println(ob.amount);
        Basic obj =new Basic();
        // System.err.println(obj.name);
        // System.err.println(obj.amount);
        obj.get();
        obj.Set("lenovo", 80_000);
        obj.get();
    }
}