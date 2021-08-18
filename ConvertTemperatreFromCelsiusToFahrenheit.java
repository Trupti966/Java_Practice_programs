/*

Algorithm & Flowchart to convert temperature from Celsius to Fahrenheit
C : temperature in Celsius,
F : temperature Fahrenheit

*/

package PracticePrograms;

import java.util.Scanner;

public class ConvertTemperatreFromCelsiusToFahrenheit {

	public static void main(String[] args) {
		float C,F;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the temperature in Celsius: ");
		C=sc.nextFloat();
		F=((9.0f/5.0f)*C)+32;
		System.out.println("The temperature in Fahrenheit is: "+F+"^oF");

	}

}
