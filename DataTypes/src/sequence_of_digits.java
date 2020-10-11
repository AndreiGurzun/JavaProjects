import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class sequence_of_digits {

    public static void main(String[] args) throws NumberFormatException, IOException {
	//Scanner input = new Scanner(System.in);
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter your number which you want to break: ");
	//int nr = input.nextInt();
	int nr = Integer.parseInt(input.readLine());
	//input.close();
	
	int length = (int)(Math.log10(nr)+1);
	System.out.println("Length of entered number is: " + length);
	while(nr > 0) {
	   
	    System.out.println("breake digits are: " + nr%10);
	    nr = nr/10;
	}

    }

}
