class Student {
    String name;
    int age;

    // Normal constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }
}

public class CopyConstructor
{
    public static void main(String[] args) {
        Student s1 = new Student("Shalini", 20);
        Student s2 = new Student(s1);  // Copying s1

        System.out.println(s2.name);  // Shalini
        System.out.println(s2.age);   // 20
    }
}