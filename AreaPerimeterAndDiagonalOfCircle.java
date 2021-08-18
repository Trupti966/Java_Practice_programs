/*
Algorithm & Flowchart to find Area, Perimeter and Diagonal of Circle
	R 	      :Radius of Circle
	AREA 	  :Area of Circle
	CIRCUMFERENCE :Perimeter of Circle
	DIAGONAL  :Diagonal of Circle
 */
package PracticePrograms;

import java.util.Scanner;

public class AreaPerimeterAndDiagonalOfCircle {

	public static void main(String[] args) {
		int R;
		float AREA,CIRCUMFERENCE,DIAGONAL,DIAMETER,PERIMETER;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Radius of Circle: ");
		R=sc.nextInt();
		AREA=(float) (3.1415*(R*R));
		CIRCUMFERENCE=2*((22/7)*R);
		DIAMETER=2*R;
		System.out.println("The area of circle is: "+AREA);
		System.out.println("The circumference of circle is: "+CIRCUMFERENCE);
		System.out.println("The diameter of circle is: "+DIAMETER);
	}

}
