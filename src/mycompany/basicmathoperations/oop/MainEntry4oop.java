/**
 * 
 */
package mycompany.basicmathoperations.oop;

import java.util.Scanner;
import mycompany.basicmathoperations.oop.Multiply;

/**
 * @author ilker
 *
 */
public class MainEntry4oop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("BEF main of MainEntry4oop with args:" + args);
		
		// get inputs
		Scanner scanner = new Scanner(System.in);
		float number1, number2;
		float result;
		// read number 1 and number 2 inputs
		System.out.println("Enter number 1");
		number1 = scanner.nextFloat();
		System.out.println("Enter number 2");
		number2 = scanner.nextFloat();
		
		// Multiply block
		Multiply multiplier = new MultiplyOperatorFor2numbers(number1, number2);
		result = multiplier.multiply(number1, number2);
		System.out.printf("result of multiply(float, float) is %.2f%n", result);
		result = multiplier.multiply2numbers();
		System.out.printf("result of multiply2numbers() is %.2f%n", result);
		
		System.out.println();
		
		//Divide block
		Divide divider = new DivideOperatorFor2numbers(number1, number2);
		result = divider.divide(number1, number2);
		System.out.printf("result of divide(float, float) is %.2f%n", result);
		result = divider.divide2numbers();
		System.out.printf("result of divide2numbers() is %.2f%n", result);
		
		Addition adder=new AdditionOperatorFor2Numbers(number1, number2);
		result=adder.add(number1, number2);
		System.out.printf("result of add(float, float) is %.2f%n", result);
		result = adder.add2Numbers();
		System.out.printf("result of add2numbers() is %.2f%n", result);
		
		Subtraction subtracter=new SubtractOperatorFor2Numbers(number1, number2);
		result=subtracter.subtract(number1, number2);
		System.out.printf("result of add(float, float) is %.2f%n", result);
		result = subtracter.subtract2Numbers();
		System.out.printf("result of add2numbers() is %.2f%n", result);

		
		// print out result - NOTE %d is for int, %f is for float(and double), %.2f means 2 digits after decimal like 123.45
		//System.out.printf("result is %.2f%n", result);
		scanner.close();
	}

}
