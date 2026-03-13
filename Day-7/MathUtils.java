public class MathUtils {
    void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }
    static void multiply(int a, int b) {
        System.out.println("Product: " + (a * b));
    }
    public static void main(String[] args) {
        MathUtils mathUtils = new MathUtils();
        mathUtils.add(5, 10);
        MathUtils.multiply(5, 10);
    }
}
