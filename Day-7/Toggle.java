public class Toggle {
    public static void main(String[] args) {
        String s="Dell";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>'Z'){
                System.out.print((char)(s.charAt(i)-32));
            }
            else if(s.charAt(i)<='Z' ){
                System.out.print((char)(s.charAt(i)+32));    
            }    
        }
    }
    
}
