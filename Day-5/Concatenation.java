import java.util.Scanner;
public class Concatenation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String result = "";
        for (int i = 1; i <= n; i++) {
            result += i;
        } 
        System.out.println(result);
        sc.close();
    }
} 
