import java.util.Scanner;
class Append {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int pos = sc.nextInt();
        StringBuilder sb = new StringBuilder(s1);   
        sb.insert(pos, s2);
        System.out.println(sb.toString());
        sc.close();
    }
}
