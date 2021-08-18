package PracticePrograms;

import java.util.Scanner;

public class SumOfUserInputSeries2 {

	public static void main(String[] args) {
		int N,X, sum = 0,term=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		N=sc.nextInt();
		System.out.println("Enter the value of X: ");
		X=sc.nextInt();
		for(int i=1;i<=N;i++) {
			term=-term*X;
			sum=sum+term;
			System.out.print(sum);
		}


	}

}
