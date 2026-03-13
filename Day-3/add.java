import java.util.Scanner;

class add{
    public static void main (String[] args){
		Scanner sc=new Scanner(System.in);
		int sum=0;		
		for(;;){
			int n=sc.nextInt();
			if(n==0){
				break;
			}
			else{
				sum+=n;
			}
		}
		System.out.println("Sum : "+sum);
	}
}