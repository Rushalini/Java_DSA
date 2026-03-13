class SingleTon {

    static SingleTon ob;
    private SingleTon() {
        // private constructor
    }
    static SingleTon getObject() {
        if (ob == null) {
            ob = new SingleTon();
        }
        return ob;
    }
    String name1;
    String name2;
    String name3;
    public static void main(String[] args) {
        ob=SingleTon.getObject();
        System.out.println(ob);
        SingleTon obj = SingleTon.getObject();
        System.out.println(obj);
        ob.name1 = "Dell";
        ob.name2 = "Lenovo";
        ob.name3 = "HP";
        System.out.println(ob.name1);
        System.out.println(ob.name2);
        System.out.println(ob.name3);
        obj.name1 = "Asus";
        obj.name2 = "Jio";
        obj.name3 = "Sony";
        System.out.println(obj.name1);
        System.out.println(obj.name2);
        System.out.println(obj.name3);  
    }
}
