import java.util.Scanner;

// Write a Java program to display the speed, in meters per second, kilometers per hour and miles per hour.

public class speed {

    public static void main(String[] args) {
	float mps = 0, kph = 0, mph = 0;
	speed_mps_kph_mph(mps, kph, mph);

    }
    
    private static void speed_mps_kph_mph (float mps, float kph, float mph) {
	
	Scanner input = new Scanner(System.in);
	System.out.println("Input distance in meters: ");
	float distance = input.nextFloat();
	System.out.println("Input hour: ");
	float hr = input.nextFloat();
	System.out.println("Input minutes: ");
	float min = input.nextFloat();
	System.out.println("Input seconds: ");
	float sec = input.nextFloat();
	input.close();
	
	float timeSeconds = (hr*3600) + (min*60) + sec;
	mps = distance / timeSeconds;
	kph = (distance / 1000.0f) / (timeSeconds/3600.0f);
	mph = kph / 1.609f;
	
	System.out.println("Your speed in meters/seconds is: " + mps + " mps");
	System.out.println("Your speed in km/h is " + kph + " kph");
	System.out.println("Your speed in miles/h is " + mph + " mph");
    }

    //Input distance in meters: 2500                                                                                
    //Input hour: 5                                                                                                 
    //Input minutes: 56                                                                                             
    //Input seconds: 23                                                                                             
    //Your speed in meters/second is 0.11691531                                                                     
    //Your speed in km/h is 0.42089513                                                                              
    //Your speed in miles/h is 0.26158804
}
