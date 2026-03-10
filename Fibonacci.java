 public class Fibonacci{
      int rec(int n){
        if (n<=1){
            return n;
    }
    return rec(n-1)+rec(n-2);
}
public static void main(String[] args) {
    Fibonacci f =new Fibonacci();
    for (int i = 0; i < 10; i++) 
        System.out.println(f.rec(i));
}


 }
