import java.util.Scanner;
class constructor {
    int laptop=100;
    constructor(int value){
        System.out.println("int parameter");
    }
    constructor(double num){
        this((int)num);
        System.out.println("double parameter");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        constructor ob=new constructor(50.6);
        System.out.println(ob.laptop);
        sc.close();
    }
}
// import java.util.Scanner;
// public class constructor {
//     int laptop=100;
//     constructor(){
//         System.out.println(laptop);
//     }
//     constructor(int value){
//         this();
//         System.out.println("int parameter");
//     }
//     constructor(double laptop){
//         System.out.println(this.laptop);
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         constructor ob=new constructor(100);
//         System.out.println(ob.laptop);
//     }
// }
