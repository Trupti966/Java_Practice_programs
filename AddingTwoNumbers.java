//Take the input from the user and add them
package PracticePrograms;

import java.util.Scanner;

public class AddingTwoNumbers {

	public static void main(String[] args) {
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		num1=sc.nextInt();
		System.out.println("Enter the second number: ");
		num2=sc.nextInt();
		int SUM=num1+num2;
		System.out.println("The addition of two numbers is = "+SUM);
		
	}

}
