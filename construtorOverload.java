import java.util.*;
class Hospital {
    int variable1, variable2;
    double variable3;
public Hospital(int doctors, int nurses) {
 variable1 = doctors;
 variable2 = nurses;
}
public Hospital(int doctors) {
 variable1 = doctors;
}
public Hospital(double salaries) {
 variable3 = salaries;
}
void display(){
    System.out.println("Printing");
}

    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       Hospital h =new Hospital(100,20);
       h.display();

       

    }

}