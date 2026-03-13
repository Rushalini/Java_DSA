public class StaticMethodCannotUseThis {
    int instanceVar=10;
    static void myMethod(){
        System.out.println(this.instanceVar);//The Compiler error message
    }
}
class StaticMethodCannotUseThis1{
    public static void main(String[] args) {
        StaticMethodCannotUseThis1 ob = new StaticMethodCannotUseThis1();
    }
}