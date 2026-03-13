import java.util.Scanner;

class javabasics {
    public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
		int B=sc.nextInt();
		sc.nextLine(); 
		String op=sc.nextLine();
		/*switch(op)
		{
			case "AND":System.out.println(A&B);break;
			case "XOR":System.out.println(A^B);break;
			case "OR":System.out.println(A|B);break;
			case "NAND":System.out.println(~(A&B));break;
			default:System.out.println("Invalid input");
		}*/
		
    	if(op.equals("AND")) {
    		System.out.println(A&B);
    	}
    	else if(op.equals("OR")) {
    		System.out.println(A|B);
    	}
    	else if(op.equals("XOR")) {
    		System.out.println(A^B);
    	}
    	else if(op.equals("NAND")) {
    		System.out.println(~(A&B));
    	}
		sc.close();
    }
}