import java.text.NumberFormat;
import java.util.Scanner;

public class inch_to_meters {

    public static void main(String[] args) {
	float inch = 0;
	inchToMeters(inch);

    }

    // Write a Java Program that reads a number in inches, converts it to meters.
    private static float inchToMeters(float inch) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter your inch number: ");
	inch = scan.nextFloat();
	scan.close();

	// cu format
	/*
	 * By using String format() method 
	 * By using DecimalFormat format() method 
	 * By using printf() method 
	 * By using Formatter's format() method 
	 * By using setMaximumFractionDigits() of NumberFormat class
	 */
	
	NumberFormat nf = NumberFormat.getInstance();
	nf.setMaximumFractionDigits(2);

	float meters = (float) (inch * 0.0254);
	System.out.println(inch + " inch is " + (nf.format(meters)) + " meters");
	return meters;
    }
}
