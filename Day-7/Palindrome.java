public class Palindrome {
    public static void main(String[] args) {
        String s="madam";
        int l=0,r=s.length()-1;
        boolean flag=true;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                flag=false;
                break;
            }
            l++;
            r--;
        }
        System.out.println(flag);
    }
    
}
