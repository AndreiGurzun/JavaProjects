import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * A program in Java that use a file and extract numbers from this file 
 */
public class file_IN_Math {
    public static void main(String[] args) throws FileNotFoundException {
	File file = new File("C:\\Users\\Andrei Gurzun\\eclipse-workspace\\DataTypes\\src\\input");
	BufferedReader buff = new BufferedReader(new FileReader(file)); // se adauga throws FileNotFoundException in
									// cazul in care nu gasescte file-ul

	String str;
	int add = 0, diff = 0, mul = 1;

	try {
	    while ((str = buff.readLine()) != null) {
		add += Integer.parseInt(str);
		diff -= Integer.parseInt(str);
		mul *= Integer.parseInt(str);
	    }
	} catch (IOException e) {
	    e.printStackTrace();
	}

	System.out.println("Add: " + add);
	System.out.println("Difference: " + diff);
	System.out.println("Multiply: " + mul);
    }
}
