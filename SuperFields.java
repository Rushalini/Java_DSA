class P{
    String name="Parent";
}
class N extends P{
    String name="child";
    void child() {
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
public class SuperFields {
    public static void main(String [] args){
        N n=new N();
        n.child();
    }
}

