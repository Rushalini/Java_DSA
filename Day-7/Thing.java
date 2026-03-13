public class Thing {
    private static int count = 0;
    public static int getCount() {
        return count;
    }
    public Thing() {
        count++;
    }
    public static void main(String[] args) {
        Thing thing1 = new Thing();
        new Thing();
        new Thing();
        new Thing();
        new Thing();
        System.out.println("Total Things created: " + Thing.getCount());
    }
}
