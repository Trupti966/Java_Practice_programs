/*

	Algorithm & Flowchart to find Simple Interest
		P : Principle Amount
		T : Time in Months
		R : % Annual Rate of Interest 
		SI : Simple Interest
		
 */
package PracticePrograms;

import java.util.Scanner;

public class SimpleInterestCalculator {

	public static void main(String[] args) {
		float P,T,R,SI;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Principle Amount: ");
		P=sc.nextFloat();
		System.out.println("Enter the Time in Months: ");
		T=sc.nextFloat();
		System.out.println("Enter the % Annual Rate of Interest : ");
		R=sc.nextFloat();
		SI =(P*T*R)/100.0f;
		System.out.println("The Simple Interest is: "+SI);
		

	}

}
