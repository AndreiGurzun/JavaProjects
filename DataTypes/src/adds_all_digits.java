import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class adds_all_digits {

    public static void main(String[] args) throws NumberFormatException, IOException {
	int nr = 0;
	addDigits(nr);
    }

    
    //Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.
    private static int addDigits (int digits) throws NumberFormatException, IOException {
	
	BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter your number: ");
	int nr = Integer.parseInt(buff.readLine());
	
	int nrLength = (int) (Math.log10(nr) + 1);
	System.out.println("Your number have " + nrLength + " digits");
	
	int sum = 0;
	while (nr != 0) {
	    sum += nr % 10;
	    nr = nr / 10;
	    System.out.println("sum = " + sum + " nr = " + nr);
	}
	
	System.out.println("Sum of your digits is: " + sum);
	return sum;
    }
    
    //IN: 565
    //OUT: 16
}
