/*Switch-Case Fall-Through Calendar: Read an integer representing a month (1-12). 
Use a switch statement with fall-through logic to print all the months from the given month to the end of the year.
Input/Output
Input: A single integer (1-12). Output: A space-separated string of month names.
Constraints
No break statements are allowed between cases (except for the default).
Sample Test Case 1
Input: 10 | Output: October November December
Sample Test Case 2
Input: 12 | Output: December
Sample Test Case 3
Input: 1 | Output: January February March April May June July August September October November December
Sample Test Case 4
Input: 7 | Output: July August September October November December
Sample Test Case 5
Input: 13 | Output: Invalid Month*/

import java.util.Scanner;

class switchcase{
    public static void main (String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		switch(n)
		{
			case 1:System.out.println("January");
			case 2:System.out.println("February");
			case 3:System.out.println("March");
			case 4:System.out.println("April");
			case 5:System.out.println("May");
			case 6:System.out.println("June");
			case 7:System.out.println("July");
			case 8:System.out.println("August");
			case 9:System.out.println("September");
			case 10:System.out.println("October");
			case 11:System.out.println("November");
			case 12:System.out.println("December");break;
			default:System.out.println("Invalid Input");
		}
	}
}