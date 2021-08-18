package PracticePrograms;

import java.util.Scanner;

public class CheckPalindromOrNot {

	public static void main(String[] args) {
		int N,rev = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		N=sc.nextInt();
		int Z = N;
		while(N>0) {
			rev = (rev*10)+N%10;
			N=N/10;
			if(rev == Z) {
				System.out.println(Z+" number is a Pallindrom Number");
			}
	
		}

	}

}
