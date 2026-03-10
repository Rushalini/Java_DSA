class R{

}
class S extends R{
    S(){
       this(10);
    }
    S(int i){
        super();
        System.out.println("S");
    }
}
public class SuperAndThis {
    public static void main(String args[]){
        S s=new S();

    }
}
