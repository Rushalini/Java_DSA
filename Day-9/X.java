public class X {
    X(){
        System.out.println("X's constructor");
    }
}
class Y extends X{
    Y(){
        this(10);
    }
    Y(int i){
        super();
        System.out.println("Y's constructor " + i);
    }
}
class TestXY{
    public static void main(String[] args) {
        Y y = new Y();
    }
}