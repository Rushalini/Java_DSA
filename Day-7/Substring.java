public class Substring {
    public static void main(String[] args) {
        String s1="Laptop";
        String s2="top";
        boolean flag=false;
        System.out.println(s1.substring(3,6));
        int last=s1.length()-s2.length();
        for(int i=0;i<s1.length();i++){
            if(i<=last && s2.equals(s1.substring(i,i+s2.length()))){
                flag=true;
            }
        }
        System.out.println(flag);
    }
}
