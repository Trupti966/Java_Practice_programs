/*
Algorithm & Flowchart to find Area, Perimeter and Diagonal of Rectangle.
	L 		  :Length of Rectangle
	B 		  :Breadth of Rectangle
	AREA 	  :Area of Rectangle
	PERIMETER :Perimeter of Rectangle
	DIAGONAL  :Diagonal of Rectangle
 */
package PracticePrograms;

import java.util.Scanner;

public class AreaPerimeterAndDiagonalOfRectangle {

	public static void main(String[] args) {
		int L,B,AREA,PERIMETER;
		float DIAGONAL;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Length of the Rectangle: ");
		L=sc.nextInt();
		System.out.println("Enter the Breadth of the Rectangle: ");
		B=sc.nextInt();
		AREA=L*B;
		PERIMETER=2*(L+B);
		DIAGONAL=(float) Math.sqrt((B*B) +(L*L));
		System.out.println("The area of Rectangle is: "+AREA);
		System.out.println("The perimeter of Rectangle is: "+PERIMETER);
		System.out.println("The diagonal of Rectangle is: "+DIAGONAL);

	}

}
