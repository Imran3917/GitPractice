package DayOne;

import java.util.Scanner;

public class LabTwoPractice {

	public static void println(String message) {
        System.out.println(message);
	}
	
   
    public static void print(String message) {
        System.out.print(message);
    }
    
    public static void main(String[] args) throws java.lang.Exception {
        //1
        double height, width, area, perimeter;
        //2
        Scanner scanner = new Scanner(System.in);
        //3
        print("Enter the height of the rectangle : ");
        height = scanner.nextFloat();
        print("Enter the width of the rectangle : ");
        width = scanner.nextFloat();
        //4
        area = height * width;
        perimeter = 2 * (height + width);
        //5
        println("Area = " + area);
        println("Perimeter = " + perimeter);
        
        scanner.close(); 
    }

       
}
