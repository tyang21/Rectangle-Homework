import java.util.Scanner;

/**
 * Rectangle HW
 * @author tyang21
 *Period 7
 */
public class RectangleHw {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Please input the length of the rectangle: ");  // Display Prompt
		double length = in.nextDouble();
		in.nextLine();
		System.out.print("Please input the width of the rectangle: "); // Display Prompt
		double width = in.nextDouble();
		in.nextLine();
		
		System.out.println();
		
		double area = length * width;
		System.out.printf("Area: %15.2f ",  area);
		System.out.println();
		double perimeter = 2 * length + 2 * width;
		System.out.printf("Perimeter: %10.2f", perimeter);
		System.out.println();
		double diagonal = Math.sqrt(length * length + width * width);
		System.out.printf("Diagonal: %11.2f", diagonal);
	}

}
