package DayOne;

import java.util.Scanner;

public class inClassPrectice {

	// Main Method below
	// void = do not return thing
	// main = just a key word, []= multiple argument

	public static void main(String[] args) {

		// statement below, all statement in java ends in a semicolon
		System.out.println("hello World");

		System.out.print("hello " );
		
		System.out.print("world" );
		
		Scanner scan = new Scanner (System.in);
		
		// This is the scanner object 
		
		scan.nextLine(); 
		
		System.out.println("Please enter you age:");
		
		int userAge = scan.nextInt();
		
		
		System.out.println(" Please enter your first and last name:");
		String userName = scan.next();
		System.out.println(userName);
		
		// primitive data types 
		
		byte b = 127; 
		short s = 128;  
		int i = 133333;
		long l = 45611222222L; 
		float f = 56.7F; 
		//or (float) 56.7; its called cast
		double d = 56.7; 
		char c = '@';
		boolean bool = true;
		
		// this is a constant and can not change 
		final String TEST = "hello"; 
		
		// TEST " now way" --- we can't do this 
		
		// % modulus return the reminder 
		// s++ increase by 1/ inriment ++, 
		
		// s-- decrese by 1,  decrimint --
		
		String words = "This is a sentence"; 
		words += "and i added some words";
		System.out.println(words);
		
		int nums = 5;
		nums += 12;
		
		// implicit casting example 
		
		int age = 30;
		double myAge = age;
		
		System.out.println(myAge);
		
		
		// explicit casting 
		// when going form a more price to less pricese 
		
		//double total = 258.54;
		//int newTotal = (int) 
		
		
		scan.close();
		
		
		
				
	}	
	
	

}
