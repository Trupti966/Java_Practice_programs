package PracticePrograms;

import java.util.Scanner;

public class LargestBetweenThreeNumbers {

	public static void main(String[] args) {
		float num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		num1 = sc.nextFloat();
		System.out.println("Enter Second Number: ");
		num2 = sc.nextFloat();
		System.out.println("Enter Third Number: ");
		num3 = sc.nextFloat();

//		..........................1ST METHOD.............................................

//		if(num1>num2) {
//			if(num1>num3) {
//				System.out.println(num1+" is Greater");
//			}else {
//				System.out.println(num3+" is Greater");
//			}
//		}else {
//			if(num2>num3) {
//				System.out.println(num2+" is Greater");
//			}else {
//				System.out.println(num3+" is Greater");
//			}
//		}
//		..........................2ND METHOD.............................................

		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " is greater");
		} else {
			if (num2 > num1 && num2 > num3) {
				System.out.println(num2 + " is greater");
			} else {
				System.out.println(num3 + " is greater");
			}
		}
	}
}
