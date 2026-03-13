 import java.util.Scanner;
 class prime{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
		bye:
        for(int i=2;i<=n;i++){
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    break bye;
                }
            }
            System.out.println(i);
        }
    }   
}
