import java.util.Scanner;
public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();   // Read full line

        StringBuilder sb = new StringBuilder(input);
        sb.reverse();   // Reverse using StringBuilder

        String reversed = sb.toString();   // Convert back to String

        if (input.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        sc.close();
    }
}