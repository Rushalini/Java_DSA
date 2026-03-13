public class Super {
    
}
/**super Keyword in Constructors: In the Dog constructor,
 make an explicit call to the Animal class's constructor using super().
  The Animal constructor should take a name and print "Animal created".**/
class Animal {
    Animal(String name){
        System.out.println("Animal created: " + name);
    }
}
class Dog extends Animal{
    Dog(String name){
        super(name); // Call the constructor of the superclass (Animal)
        System.out.println("Dog created: " + name);
    }
}
class TestSuper {
    public static void main(String[] args) {
        Dog d = new Dog("Buddy");
    }
}