import java.util.Scanner;

class Menu{
    public static void main (String[] args){
		Scanner sc=new Scanner(System.in);
		int order=0;
		int e=0;
		do{
			System.out.println("1.Dosa/t2.Idly/t3.Poori/t4.Chappati/t5.Exit");
			order=sc.nextInt();
			if(order==1){
				System.out.println("1.Normal/t2.Masala/t3.Set/t4.Onion/t5.Kaaram");
				e=sc.nextInt();
			}
			else if(order==2){
				System.out.println("1.Normal/t2.Podi/t3.Ghee/t4.Millets/t5.Carrot");
				e=sc.nextInt();
			}
		}while(order!=5);
		System.out.print("Full");
		sc.close();
	}
}
		
		