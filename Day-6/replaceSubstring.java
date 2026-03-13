import java.util.Scanner;
public class replaceSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String oldSub = sc.nextLine();
        String newSub = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        int index = sb.indexOf(oldSub);
        while (index != -1) {
            sb.replace(index, index + oldSub.length(), newSub);
            index = sb.indexOf(oldSub, index + newSub.length());
        }
        System.out.println(sb.toString());
        sc.close();
    }   
}
