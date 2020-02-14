import java.util.Scanner;
public class SphereVolume 
{ 
public static void main(String[] args) 
{ 
	// add your declaration and code here 
	double diam;
	double radius;
	double volume;
	Scanner scan= new Scanner(System.in);
	System.out.println("This program is from scratch using predefined Math Functions.");
	System.out.println("Please enter the diameter of a sphere: ");
	diam=scan.nextDouble();
	radius=(double)diam/2;
	volume=((double)4/3)*Math.PI*Math.pow(radius, 3);
	System.out.println("The radius is "+radius+", and the volume is "+volume);
	
} 
} 

