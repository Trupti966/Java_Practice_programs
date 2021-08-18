/*
Algorithm & Flowchart to find Area & Perimeter of Triangle BY HERO'S FORMULA (when three sides are given)
	A 	 	  :First Side of Triangle
	B 	 	  :Second Side of Triangle
	C 	 	  :Third Side of Triangle
	AREA 	  :Area of Triangle
	PERIMETER : Perimeter of Triangle
	SEMIPERIMETER: Semiperimeter.
 */
package PracticePrograms;

import java.util.Scanner;
import java.lang.*; 

public class AreaAndPerimeterOfTriangle {

	public static void main(String[] args) {
		int A, B, C, PERIMETER, S;
		double AREA;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Side of Triangle: ");
		A = sc.nextInt();
		System.out.println("Enter Second Side of Triangle: ");
		B = sc.nextInt();
		System.out.println("Enter Third Side of Triangle: ");
		C = sc.nextInt();
		S = (A + B + C) / 2;
		AREA = (double) Math.sqrt(S * (S - A) * (S - B) * (S - C));
		PERIMETER=A+B+C;
		System.out.println("Area of Triangle is: " + AREA);
		System.out.println("Perimeter of Triangle is: "+ PERIMETER);

	}
}