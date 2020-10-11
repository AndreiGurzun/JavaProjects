import java.util.Scanner;

//Write a Java program that reads a number and display the square, cube, and fourth power.

public class pow {

    public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	System.out.println("Input the side length value: ");
	float nr = input.nextFloat();
	System.out.println("Enter the desired power: ");
	int n = input.nextInt();
	input.close();
	
	System.out.printf("Square: %12.2f\n", nr * nr); //!!! printf()
	System.out.printf("Cube: %14.2f\n", nr * nr * nr); //Math.pow(nr, 3)
	System.out.printf("Fourth power: %6.2f\n", Math.pow(nr, 4));
	System.out.printf("n power: %6.2f\n", Math.pow(nr, n));
    }

}
