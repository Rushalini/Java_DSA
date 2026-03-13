
import java.util.Scanner;

public class CommaSeparatedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine(); 
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            String s= sc.nextLine();
            if(i<size-1){
                sb.append(s+",");
            }else{
                sb.append(s);
            }
        }
        System.out.println(sb.toString());
        sc.close();
    }
}

