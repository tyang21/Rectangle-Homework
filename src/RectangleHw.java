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
		System.out.print(" Please input the length of the rectangle");  // Display Prompt
		double length = in.nextDouble();
		in.nextLine();
		System.out.print( " Please input the width of the rectangle"); // Display Prompt
		double width = in.nextDouble();
		in.nextLine();
		
		System.out.print("area: " + length * width);
	}

}
