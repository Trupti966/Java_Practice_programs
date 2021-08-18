/*
Algorithm & Flowchart to find Area, Perimeter and Diagonal of Square.
L 			: Side Length of Square
AREA 		: Area of Square.
PERIMETER   : Perimeter of Square.
DIAGONAL	: Diagonal of Square.
*/
package PracticePrograms;

import java.util.Scanner;

public class AreaPerimeterAndDiagonalOfSquare {

public static void main(String[] args) {
	int L,AREA,PERIMETER;
	float DIAGONAL;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first length:");
	L=sc.nextInt();
	AREA=L*L;
	PERIMETER=4*L;
	DIAGONAL=(float) (Math.sqrt(2)*L);
	System.out.println("The area of Square is: "+AREA);
	System.out.println("The perimeter of Square is: "+PERIMETER);
	System.out.println("The diagonal of Square is: "+DIAGONAL);
}

}
