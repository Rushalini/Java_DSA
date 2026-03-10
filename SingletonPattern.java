public class SingletonPattern {
    private static SingletonPattern instance;
    public static SingletonPattern getInstance(){
        if(instance==null)
            instance=new SingletonPattern();
        return instance;
    }
    private SingletonPattern(){

    }
    public static void main(String [] args){
        SingletonPattern s=new SingletonPattern();
        System.out.println(s);
        SingletonPattern s1=new SingletonPattern();
        System.out.println(s1);
        System.out.println(s==s1);
    }
}
