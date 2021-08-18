//Algorithm & Flowchart to find the sum of two numbers without using a temporary variable.
package PracticePrograms;

import java.util.Scanner;

public class SwapTheValueWithoutUsingTemporaryVariable {

	public static void main(String[] args) {
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		num1=sc.nextInt();
		System.out.println("Enter the second number: ");
		num2 =sc.nextInt();
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("After swap the first number is: "+num1);
		System.out.println("After swap the second number is: "+num2);

	}

}
