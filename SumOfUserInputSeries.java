
//Algorithm & Flowchart to find sum of series 1+2+3+…..+N

package PracticePrograms;

import java.util.Scanner;

public class SumOfUserInputSeries {

	public static void main(String[] args) {
		int N, sum = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		N=sc.nextInt();
		for(int i=1;i<=N;i++) {
			sum=sum+i;
			System.out.println(sum);
		}
		
	}

}
