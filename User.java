class User{
    static String Userrole;
    static String Username;
    private User(String name){
        Userrole="ADMIN";
        Username =name;
    }
    public static User createAdmin(String name) {
        return new User(name);
    }
    static void display(){
        System.out.println("User:"+Username+"  Role:"+Userrole);
    }
    public static void main(String[] args){
        User.createAdmin("Alice");
        User.display();
    }
}

