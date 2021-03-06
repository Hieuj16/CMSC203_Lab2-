/**
   This program demonstrates how numeric types and operators behave in Java
*/
import java.util.Scanner;
public class NumericTypes {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in); //TASK #2 Create a Scanner object here 
		//identifier declarations
		final int NUMBER = 2; // number of scores
		int score1; // first test score
		int score2; // second test score
		final int BOILING_IN_F; // boiling temperature
		double fToC; // temperature in Celsius
		double average; // arithmetic average
		String output; // line of output to print out
		//Task #2 declare a variable to hold the user�s temperature
		System.out.println("P1ease enter score 1: ");  //Task #2 prompt user to input score1
		score1=scan.nextInt();			 //Task #2 read score1 
		System.out.println("Please enter score 2: ");  //Task #2 prompt user to input score2
		score2=scan.nextInt();			 //Task #2 read score2 
		// Find an arithmetic average
		average = (double)(score1 + score2) / NUMBER;
		output = score1 + " and " + score2 + " have an average of " + average;	
		System.out.println(output);
		// Convert Fahrenheit temperatures to Celsius
		System.out.println("Please enter a number in Fahrenheit degree: "); //Task #2 prompt user to input another temperature
		BOILING_IN_F=scan.nextInt();//Task #2 read the user�s temperature in Fahrenheit
		fToC = ((double)5/9) * (BOILING_IN_F - 32); //Task #2 convert the user�s temperature to Celsius
		output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius."; //Task #2 print the user�s temperature in Celsius
		System.out.println(output);		
		System.out.println("Goodbye"); // to show that the program is ended	
		scan.close();
	}
}

