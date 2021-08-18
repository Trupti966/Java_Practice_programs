//Algorithm & Flowchart to print multiplication Table of a number
package PracticePrograms;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		int TableOf;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the table number: ");
		TableOf=sc.nextInt();
		for(int i=1;i<=10;i++) {
			int sum = TableOf*i;
			System.out.println(TableOf+" * "+i+" = "+sum);
		}

	}

}
