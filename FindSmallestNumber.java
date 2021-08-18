//Algorithm & Flowchart to find the smallest of two numbers

package PracticePrograms;

import java.util.Scanner;

public class FindSmallestNumber {

	public static void main(String[] args) {
		int num1,num2;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter First Number: ");
		num1=sc.nextInt();
		System.out.println("Enter Second Number: ");
		num2=sc.nextInt();
		if(num1<num2) {
			System.out.println("The smallest number is: "+num1);
		}else {
			System.out.println("The smallest number is: "+num2);
		}

	}

}
