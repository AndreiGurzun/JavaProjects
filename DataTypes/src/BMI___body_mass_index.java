import java.util.Scanner;

public class BMI___body_mass_index {

    public static void main(String[] args) {
	float weight = 0, height = 0;
	BMI(weight, height);
    }
    
    //Write a Java program to compute body mass index (BMI) => BMI = weight(kg) / height(m)^2;
    
    private static float BMI(float weight, float height) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter weight: ");
	weight = input.nextFloat();
	System.out.println("Enter height: ");
	height = input.nextFloat();
	input.close();
	
	float BMI = (float) (weight / (Math.pow(height, 2)) * 10000);
	
	System.out.println("Body Mass Index is: " + BMI + " kg/m^2");
	return BMI;
    }

}
