class Animal1{
    String dogname;
    Animal1(String name){
        dogname=name;
        System.out.println("Animal Created");

    }
}
class Dog1 extends Animal1{
    Dog1(String name){
        super(name);
        System.out.println("Dog Created");
    }
}
public class SuperEx {
    public static void main(String [] args){
        Dog1 d=new Dog1("Charlie");
    }
}

