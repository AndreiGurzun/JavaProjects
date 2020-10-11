import java.util.ArrayList;
import java.util.Scanner;

public class convert_min_to_years_and_days {
    public static void main(String[] args) {
	int min = 0;
	min_to_years_and_days(min);
    }

    // write a Java program to convert minutes into a number of years and days
    private static void min_to_years_and_days(int min) {
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter minutes: ");
	min = scn.nextInt();
	scn.close();

	int minutesInYear = 60 * 24 * 365;

	int years = (int) (min / minutesInYear);
	int days = (int) ((min / 60 / 24) % 365);

	ArrayList<Integer> rezultat = new ArrayList<Integer>();
	rezultat.add(years);
	rezultat.add(days);

	System.out.println("Nr. de ani este: " + rezultat.get(0));
	System.out.println("Nr. de zile este: " + rezultat.get(1));

	// IN: 3456789
	// OUT: Nr. de ani este: 6 || Nr. de zile este: 210
    }
}
