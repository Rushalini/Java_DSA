 class Person{
     private int age;
     public void setAge(int a){
         if(a>=0){
             age=a;
         }
     }
     public int getAge(){
         return age;
     }
 }


public class Getter {
    public static void main(String args[]){
        Person p=new Person();
        p.setAge(25);
        p.setAge(-5);
        System.out.println(p.getAge());
    }
}
