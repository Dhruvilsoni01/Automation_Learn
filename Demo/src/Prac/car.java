package Prac;

import java.util.Scanner;

// if else condition practice
public class car
{
	public static void main(String args[])
	{
	Scanner cspeed=new Scanner(System.in); // Scanner used for take input from user. Create object of Scanner
	 
	System.out.print("Enter Car Speed : " );
	int speed= cspeed.nextInt();
	System.out.print("Car speed is " + speed+ "\n \n");
	
	if(speed < 100)
	{
		System.out.println("Car is on ECO Speed");
	}
	else if (speed >=100) 
	{
		System.out.println("Car is on Fast Speed");
	}
	cspeed.close();
	}
}