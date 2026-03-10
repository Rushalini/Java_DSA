class Instance{
    int instanceVar =10;
    static void myMethod(){
        System.out.println(this.instanceVar);
    }
}

public class StaticMethods {
    public static void main(String args[]){
        StaticMethods i =new StaticMethods();
        i.myMethod();
    }
}