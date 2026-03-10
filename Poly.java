class Animal{
    void speak(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    void speak(){
        System.out.println("Dog Barks");
    }
}
class Cat extends Animal{
    void speak(){
        System.out.println("Cat meow");
    }
}

public class Poly {
    public static void main(String[] args){
        Animal ob []=new Animal[3];
                     ob[0]=new Dog();
                     ob[1]=new Cat();
                     ob[2]=new Animal();
        for(Animal obj :ob){
            obj.speak();
        }

    }
}
