import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a byte value: ");
        byte b = Byte.parseByte(br.readLine());

        System.out.print("Enter an integer value: ");
        int n1 = Integer.parseInt(br.readLine());

        System.out.print("Enter a double value: ");
        double d = Double.parseDouble(br.readLine());

        System.out.println("\nYou entered:");
        System.out.println("Byte: " + b);
        System.out.println("Integer: " + n1);
        System.out.println("Double: " + d);
    }
}