public class FirstCaps {
    public static void main(String[] args) {
        String s="hello world";
        for(int i=0;i<s.length();i++){
            if(i==0 || s.charAt(i-1)==' '){
               char c=(char)(s.charAt(i)-32);
               System.out.print(c);
            }
            else{
                System.out.print(s.charAt(i));
            }    
        }
    }
}
