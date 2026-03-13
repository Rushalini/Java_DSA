//this as a method argument: create service with process(Task t). 
//in Task , have a method start() that calls service.process(this)

public class Service {
    static void process(Task t){
        System.out.println(t);
    }
}
class Task{
    static Task o=new Task();
    static void start(){
        Service.process(o);
    }
}
class ServiceTask{
    public static void main(String[] args){
        Task.start();
    }
}