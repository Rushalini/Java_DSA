public class Box {
    int l,w,h;
    Box(){
        l=w=h=1;
    }
    Box(int l, int w, int h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }
    void display() {
        System.out.println("Box Details:");
        System.out.println("Length: " + l + ", Width: " + w + ", Height: " + h);
    }
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.display();
        Box box2 = new Box(5,6,7);
        box2.display();
    }
}
