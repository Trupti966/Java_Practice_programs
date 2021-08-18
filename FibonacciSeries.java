// To generate the N numbers of FIBONACCI TERMS.
package PracticePrograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int N;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the max value: ");
		N=sc.nextInt();
		int A = 0;
		int B = 1;
		int C = 0;
		while(C<=N) {
			System.out.println(C);
			A=B;
			B=C;
			C=A+B;
		}
		

	}

}
