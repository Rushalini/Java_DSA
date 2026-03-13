import java.util.Scanner;

class basic{
    public static void main (String[] args){
		Scanner sc=new Scanner(System.in);
		do{
			int a=sc.nextInt();
			if(a==143){
				System.out.println("YOU GOT IT...");
				break;
			}
			else{
				System.out.println("Enter valid number");
			}
		}while(true);
	}
}