public class StaticFactory {
    static String Username;
    static String Userrole;
    private StaticFactory(String name){
        Username=name;
        Userrole="ADMIN";
    }
    public static StaticFactory createAdmin(String name){
        return new StaticFactory(name);
    }
    static void display(){
        System.out.println("User: "+Username+"\nRole: "+Userrole);
    }
    public static void main(String[] args) {
        StaticFactory.createAdmin("Alice");
        StaticFactory.display();
    }
}
