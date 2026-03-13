import java.util.Scanner;
class NestedClass {
    class test {
        public static void print() {
        }

        void display() {
            System.out.println("Display");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        NestedClass obj =new NestedClass();
        NestedClass.test t = obj.new test();
        t.display();
        NestedClass.test.print();
        sc.close();
    }
}