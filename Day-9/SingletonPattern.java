public class SingletonPattern {
    private static SingletonPattern  instance;
    public static SingletonPattern getInstance(){
        if(instance==null)
            instance=new SingletonPattern();
        return instance;
    }
    private SingletonPattern(){

    }
    public static void main(String[] args) {
        SingletonPattern s1=SingletonPattern.getInstance();
        System.out.println(s1);
        SingletonPattern s2=SingletonPattern.getInstance();
        System.out.println(s2);
        System.out.println(s1==s2);
    }
}
