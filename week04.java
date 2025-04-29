package week04;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class week04 {

	private static int sumAges2;

	public static void main(String[] args) {
		
		//STEP 1 - ALL PARTS
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};						//CREATE ARRAY OF INTS PROVIDED
		int dif = ages[ages.length-1] - ages[0];
		System.out.println("Difference example 1: " + dif);					//confirm result
		
		int[] ages2 = {3, 9, 27, 63, 2, 7, 37, 45, 25};						//INT WITH 9 ELEMENTS
		int dif2 = ages2[ages2.length-1] - ages2[0];
		System.out.println("Difference example 2: " + dif2);					//confirm result
		
		double sum = 0;
			for ( int number : ages) {
				sum += number;
		}
			System.out.println("Average: " + sum/ages.length);				//CALCULATE AVERAGE FROM 1st ARRAY OF INTS
			
			double sum2 = 0;
			for ( int number : ages2) {
				sum2 += number;
		}
			System.out.println("Average: " + sum2/ages2.length);			//CALCULATE AVERAGE FROM 2nd ARRAY OF INTS
		

		//STEP 2 - ALL PARTS
		String[] strings = {"Sam", "Tommy", "Tim", "Sally","Buck", "Bob"};
			
			double nameSum = 0;
				for ( String name : strings) {
						nameSum += name.length();
				}
				System.out.println("Average: " + nameSum/strings.length);
			
		String concat = "";
		for ( String string : strings) {
			concat += (string + ", ");
		}
		System.out.println(concat);
		
	
		//3. Access the last element - use length-1
		System.out.println(strings[strings.length-1]);
		
		//4. Access first element in array [0]
		System.out.println(strings[0]);
		
	//5. new int[] nameLengths, loop with array nameLengths
			
		int[] nameLength = new int[strings.length];
			for (int i = 0; i < nameLength.length; i++) {
			nameLength[i] = strings[i].length();
			}
		
		
	//6. Loop to iterate over nameLengths[] and calc sum of all elements in array
		sum = 0;
		for (int i = 0; i < nameLength.length; i++) {
		sum += nameLength[i];
		}
	// 7.  Call in method to repeat word a specfic number of times
		
		System.out.println(phrase("Friday",13));
		
	//8. CONCATE FIRST & LAST NAME WITH A SPACE
		System.out.println(fullName("Sarah","Shows"));
		
	//9 CALC INT ARRAY AND RETURN TRUE VALUE IF SUM OF INT ARRAY IS GREATER THAN 100
		System.out.println(sumGreaterthan100(ages2));
	
	//10. CALC DOUBLE ARRAY AVERAGE
		double [] payRate = { 14.70, 15.30, 15.65, 17.02 + 19.85 };
		System.out.println(calcAverage(payRate));

	//11. RETURN TRUE IF AVERAGE OF FIST ARRAY IS GREATER THAN 2ND ARRAY
		double [] payRate2 = { 24.70, 45.30, 55.65, 17.02 + 19.85 };
		System.out.println(isFirstGreater(payRate, payRate2));

	//12.  RETURNS TRUE IF BOTH IS HOT OUTSIDE IS TRUE AND PRICE OF ITEM IS LESS THAN MONEYINPOCKET
		isHotOutside = 110.5
		moneyInPocket = 20.00
		System.out.println(willBuyDrink(110.5, 20.00);
	
//Method Writing Below:
	//13. Method:
	//public static permission (String str) {
	return (
		
	//12. Method:
	public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		return (isHotOutside == true && moneyInPocket > 10.50);
	}
		
	//11. Method:
	public static boolean isFirstGreater (double[] calcAveA, double[] calcAveB) {
		return calcAverage(calcAveA) > calcAverage(calcAveB);
	}
		
		
	//10. Method:
public static double calcAverage (double[] numbers) {
	double sum = 0;
	for ( double number : numbers) {
		sum += number;
	}
	return sum/numbers.length;	
}


	//9. Method:
public static boolean sumGreaterthan100 (int[] num) {
	int sum = 0;
	for ( int value : num) {
		sum += value;
	}
	return sum > 100;
	}
	

	//8. Method:

public static String fullName (String firstName, String lastName) {
		return firstName + " " + lastName;
}

	//7. Method: 
	
public static String phrase (String word, int n) {
	String result = "";
	for (int i = 0; i < n; i++) {
		result += word;
	}
	return result;
}
}