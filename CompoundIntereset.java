/*
Algorithm & Flowchart to find Compound Interest 
P : Principle Amount
N : Time in Years
R : % Annual Rate of Interest 
CI : Compound Interest
 */
package PracticePrograms;

import java.util.Scanner;

public class CompoundIntereset {

	public static void main(String[] args) {
		float P,N,R,CI;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Principle Amount: ");
		P=sc.nextFloat();
		System.out.println("Enter the Time in Years: ");
		N=sc.nextFloat();
		System.out.println("Enter the % Annual Rate of Interest : ");
		R=sc.nextFloat();
		
		float Amount = (float) (P*Math.pow((1+R/100),N));
		CI=Amount-P;
		System.out.println("Amount: "+Amount);
		System.out.println("The Compound Interest is: "+CI);
	}

}
