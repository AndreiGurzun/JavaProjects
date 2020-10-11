import java.util.Scanner;

public class current_time_in_GTM {
    public static void main(String[] args) {
	
	//Write a Java program that prints the current time in GTM (Greenwich Mean Time) vs UTC (Coordinated Universal Time)
	Scanner input = new Scanner(System.in);
	System.out.println("Input the time zone offset to GMT: ");
	long timeZoneChange = input.nextInt();
	input.close();
	
	long totalMilliseconds = System.currentTimeMillis(); //return the curent time in ms
	
	long totalSeconds = totalMilliseconds / 1000;
	long currentSecond = totalSeconds % 60;
	
	long totalMinutes = totalSeconds / 60;
	long currentMinute = totalMinutes % 60;
	
	long totalHours = totalMinutes / 60;
	
	long currentHour = ((totalHours + timeZoneChange) % 24);
	
	System.out.println("Current time is: " + currentHour + ":" + currentMinute + ":" + currentSecond);
	
	//IN: pt Romania, GTM = +3
    }
    
    
}
