/*Ternary Operator Cascade: Read an integer score. Using only nested ternary operators (no if/else),
 return the grade: "A" for 90-100, "B" for 80-89, "C" for 70-79, "D" for 60-69, "F" for <60.
Input/Output
Input: A single integer score. Output: A single character grade.
Constraints
Score is between 0 and 100. The entire logic must be a single statement.
Sample Test Case 1
Input: 95 | Output: A
Sample Test Case 2
Input: 82 | Output: B
Sample Test Case 3
Input: 70 | Output: C
Sample Test Case 4
Input: 69 | Output: D
Sample Test Case 5
Input: 45 | Output: F*/

import java.util.Scanner;

class ternary {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            int num = sc.nextInt();

            char op = (num > 90) ? 'A' :
                      (num > 80) ? 'B' :
                      (num > 70) ? 'C' :
                      (num > 60) ? 'D' : 'F';

            System.out.println(op);
        }
    }
}