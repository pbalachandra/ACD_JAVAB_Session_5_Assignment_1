/* ACD_JAVAB_Session_5_Assignment_1_Main :
 * Calculate area of rectangle and triangle using single inheritance.
 */
package session5;

import java.util.Scanner;

class rectangle_area
{
	static double area = 0;
	public double rectangle(double x, double y)
	{
		area = x * y;
		return area;
	}
}

public class ACD_JAVAB_Session_5_Assignment_1_Main extends rectangle_area 
{
	public double triangle(double x, double y) 
	{
		area = 0.5 * x * y;
		return area;
	}
	public static void main(String[] args) 
	{
		double x, y;
		Scanner s = new Scanner(System.in);
		ACD_JAVAB_Session_5_Assignment_1_Main area_calculation = new ACD_JAVAB_Session_5_Assignment_1_Main();
		System.out.println("Enter Length & Breadth of a Rectangle : ");
		x = s.nextDouble();
		y = s.nextDouble();
		area_calculation.rectangle(x,y);
		System.out.println("Area of Rectangle : " + area + " sq.units");
		System.out.println("------------------------------------------");
		System.out.println("Enter Base & Height of a Triangle : ");
		x = s.nextDouble();
		y = s.nextDouble();		
		s.close();
		area_calculation.triangle(x, y);
		System.out.println("Area of Triangle : " + area + " sq.units");
		System.out.println("------------------------------------------");		
	}
}

/* OUTPUT

Enter Length & Breadth of a Rectangle : 
11
10.5
Area of Rectangle : 115.5 sq.units
------------------------------------------
Enter Base & Height of a Triangle : 
10
9
Area of Triangle : 45.0 sq.units
------------------------------------------

*/