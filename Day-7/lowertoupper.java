
import java.util.Scanner;

public class lowertoupper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="Dell";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>'Z'){
                System.out.print((char)(s.charAt(i)-32));
            }
            else{
                System.out.print(s.charAt(i));
            }    
        }
        sc.close();
    }
}
