/*

Algorithm & Flowchart to convert temperature from Fahrenheit to Celsius.
C : temperature in Celsius,
F : temperature Fahrenheit

*/
package PracticePrograms;

import java.util.Scanner;

public class ConvertTemperatreFromFahrenheitToCelsius {

	public static void main(String[] args) {
		float C,F;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenheit: ");
		F=sc.nextFloat();
		C=(5.0f/9.0f)*(F-32);
		System.out.println("The temperature in Celsius: "+C);
	}

}
