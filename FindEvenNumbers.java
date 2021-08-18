//Algorithm & Flowchart to find Even numbers between 1 to n where n is a positive Integer

package PracticePrograms;

import java.util.Scanner;

public class FindEvenNumbers {

	public static void main(String[] args) {
		int num,rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number till you want to know the even numbers: ");
		num=sc.nextInt();
		for(int i=1; i<=num; i++) {
			if((i%2)==0)
			System.out.println(i);
		}
		
	}
}
