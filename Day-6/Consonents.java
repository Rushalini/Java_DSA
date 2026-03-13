import java.util.Scanner;
public class Consonents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        String ch = "aeiouAEIOU";
        System.out.println(sb.toString());
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (ch.indexOf(c) != -1) {
                sb.deleteCharAt(i);
            }
        }
        System.out.println(sb.toString());
        sc.close();
    }
}
