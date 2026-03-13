public class Student {
    String name;
    int id;
    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    void display() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name + ", ID: " + id);
    }
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 12345);
        student1.display();
    }
}
