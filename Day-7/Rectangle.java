public class Rectangle {
    int a,b;
    Rectangle(int a, int b){
        this.a = a;
        this.b = b;
    }
    void scale(double factor){
        System.out.println("a : " +(int)(a*factor) + " b : " + (int)(b*factor));
    }
}
class RectangleTest{
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10,20);
        System.out.println("a: " + rect.a + " b: " + rect.b);
        rect.scale(2.5);
    }
}
