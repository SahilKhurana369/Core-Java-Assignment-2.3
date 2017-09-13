/**
 * Write a program to print the "X" pattern:
 * The first thing you have to do is to find relationships between indices. 
 * Let's say you have the square matrix of length size (size = 5 in the example):
 * 
 *  0 1 2 3 4 
 * 0*       *
 * 1  *   *
 * 2    *
 * 3  *   *
 * 4*       *
 * 
 * The diagonal from (0,0) to (4,4), indices are the same, this means row == column. 
 */
package Assignment_2;														// package declaration
/**
 * All the comments in the program are placed on the Right-Hand-Side.
 * @author Sahil Khurana <sahilkhurana369@gmail.com>
 */
import java.util.Scanner;													// This will import the Scanner class
public class Assignment_2_3 {												// Proper naming conventions is used for Class Declaration
	public static void main(String[] args) {								// Main methods Starts
		Scanner s = new Scanner(System.in);									// Initialize the scanner to get input from User
		System.out.print("Enter the number of Size of X Pattern : ");		// This will print out the argument and ends the line
		int size = s.nextInt();												// Read input integer size from the User
		int rows, column;													// Two Integers(Variable) Declared rows and column
		s.close();															// object "s" closed 
		for (rows = 1; rows <= size; rows++) {								// for loop expression to initialize row equal to 1, the loop will execute till rows less then equal to size i.e 5, and when this condition is true then value of rows increment by 1  
			for (column = 1; column <= size; column++) {					// nested for loop expression to initialize column equal to 1, the loop will execute till column less then equal to size i.e 5, and when this condition is true then value of column increment by 1   
				if (column == rows) {										// if loop expression,   
					System.out.print("*");									// when value to column == rows then print "*"
				} else if (column == size - (rows - 1)) {					// nested else if, 
					System.out.print("*");									// column == size the subtract value from value of (number of rows-1)
				} else {													// else print space " "
					System.out.print(" ");
				}
			}																// nested for loop
			System.out.println();											// after all the conditions of column are printed then increment the value of row and cursor moves to the next line
		}																	// for loop closed
	}																		// Main methods Closed
}																			// class Assignment_2_3 closed


