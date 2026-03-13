import java.util.Scanner;

class basic{
    public static void main (String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println("Factors of : "+n);
			if(n%i==0)
			{
				System.out.println(i);
			}
		}
	}
}