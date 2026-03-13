/*Leap Year and Day of Week Calculator: Read a year and an integer N. 
First, determine if the year is a leap year. 
Then, calculate the day of the week for the Nth day of that year (assuming Jan 1st is a Monday).
Input/Output
Input: Integer year, integer N. 
Output: "Leap Year/Common Year" and the day of the week.
Constraints
1 <= N <= 366. year > 1582. Use modulo arithmetic.
Sample Test Case 1
Input: 2024 366 | Output: Leap Year\nMonday
Sample Test Case 2
Input: 2025 1 | Output: Common Year\nMonday
Sample Test Case 3
Input: 2025 8 | Output: Common Year\nMonday
Sample Test Case 4
Input: 2024 60 | Output: Leap Year\nFriday
Sample Test Case 5
Input: 2025 366 | Output: Common Year\nInvalid Day*/

import java.util.Scanner;

class leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int N = sc.nextInt();
        boolean isLeap = false;
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            isLeap = true;
        }
        if (isLeap)
            System.out.println("Leap Year");
        else
            System.out.println("Common Year");
        if ((isLeap && N > 366) || (!isLeap && N > 365) || N < 1) {
            System.out.println("Invalid Day");
            sc.close();
            return;
        }
        String[] days = {"Monday", "Tuesday", "Wednesday","Thursday", "Friday", "Saturday", "Sunday"};
        int dayIndex = (N - 1) % 7;
        System.out.println(days[dayIndex]);
        sc.close();
    }
}
