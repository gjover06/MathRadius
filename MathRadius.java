/**
Author:George Samu
Date:5/22/2020

*/
import java.util.Scanner;

public class MathRadius
{
	public static void main (String[]args)
	{
	
	//Create a scanner
	Scanner keyboard= new Scanner(System.in);
	//Prompt user to type radius
	System.out.println("Type the radius of the sphere in inches:  ");
	//the user enters data on keyboard
	double radius=keyboard.nextDouble();
	//calculation
	double volume= 4 * Math.PI * Math.pow(radius,3) / 3;
	System.out.println("The volume of a sphere of radius " +
						radius + "inches is "+ volume + " cubic inches.");
							
	

	}//end main
	}// end MathRadius