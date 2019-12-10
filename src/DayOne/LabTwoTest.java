package DayOne;

import java.util.Scanner;

public class LabTwo {
	
	public static void main(String [] args) {
		
		Scanner scnr = new Scanner (System.in);
        
		System.out.println("Enter the Length");
		
        double Length = scnr.nextDouble();
        
		
		System.out.println("Enter the Width");
		
		double Width = scnr.nextDouble();
		
		 double area = Length * Width;
         double perimeter = 2 * (Length + Width);
		
         System.out.println("area is " + area );
		System.out.println("perimeter is " + perimeter);
		
		scnr.close(); 
	

		
	}
    
    

}
