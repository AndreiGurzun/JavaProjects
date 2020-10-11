import java.util.Scanner;

public class Fahr_to_Celsius {
    public static void main(String[] args) {
	float fahrenheit = 0;
	fahrToCelsius(fahrenheit);
	
    }
    
    
    //write a java program to convert temperature from Fahrenheit to Celsius degree.
    private static float fahrToCelsius (float fahrenheit) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a degree in Fahrenheit: ");
	fahrenheit = scan.nextFloat();
	scan.close();
	
	float celsius = ((5* (fahrenheit - 32)) / 9);
	
	System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
	return celsius;
    }
}
