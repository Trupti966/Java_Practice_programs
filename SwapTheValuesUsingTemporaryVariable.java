//Algorithm & Flowchart to find the sum of two numbers by using a temporary variable.

package PracticePrograms;

import java.util.Scanner;

public class SwapTheValuesUsingTemporaryVariable {

	public static void main(String[] args) {
		int a, b , temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		a = sc.nextInt();
		System.out.println("Enter second number: ");
		b= sc.nextInt();
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("After swap the value of first number is: "+a);
		System.out.println("After swap the value of second number is: "+b);

	}

}
