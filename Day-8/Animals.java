/**Polymorphism in Action: Create an array of Animals type.
 Store a Dog object, a Cat object (also inherits from Animal),
  and an Animal object in it. Loop through the array and 
  call the speak() method on each element.**/
class Animals {
    void speak(){
        System.out.println("Animal makes a sound");
    }   
}
class Dog extends Animals{
    @Override
    void speak(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animals{
    @Override
    void speak(){
        System.out.println("Cat meows");
    }
}
class PolimorphismTest{
    public static void main(String[] args) {
        Animals animals[] = new Animals[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Animals();
        for(Animals a : animals){
            a.speak();
        }
    }
}