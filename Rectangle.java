/**
 * 
 */
package five;

import java.util.Scanner;

/**
 * @author Abdoulsalam
 *
 */
public class Rectangle {
	double length , width   ;
	/**
	 * @param args
	 */
	Rectangle () {
		length = 0;
		width = 0;
		//area= 0;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please input length:");
		System.out.println("Please input width:");
		double length = in.nextDouble();
		
		
		double width = in.nextDouble();
		
		
		
		System.out.println("The lengh is:" + length);
		System.out.println("The width is:" + width);

		System.out.println("The area is:" + area(length, width));
	}
	
	public static double area(double length, double width) {
		double area = 0;
		area = length*width;
		return area;
	}

}
