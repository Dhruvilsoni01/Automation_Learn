package Prac;

import java.util.Scanner;

class Student1
{

public static void main(String args[])
{
	
	Scanner sc=new Scanner(System.in); // Scanner used for take input from user. Create object of Scanner
	
	System.out.print("Enter Student id : "); //Use for print sentence on console screen
	int studentid=sc.nextInt(); //Take input of integer value from user
	sc.nextLine();
	System.out.print("Enter student name : ");
    String name1=sc.nextLine();  //String value input
    
	System.out.println("\nStudent Id Number is " + studentid + "\n" +"Student Name is : " + name1); // Print id and name 
	sc.close(); //Scanner object closing
 }
}