
//Write a Java program to compare two given signed and unsigned numbers.

public class compare_sign_unsign {

    public static void main(String[] args) {
	
	int in1 = Integer.MIN_VALUE;
	int in2 = Integer.MAX_VALUE;
	
	System.out.println("Signed integers: " + in1 + ", " + in2);
	System.out.println("-----------------------------------------");
	
	int compare_Signed_num = Integer.compare(in1, in2);
	System.out.println("Result of comparing signed numbers is: " + compare_Signed_num);
	//the value 0 if in1 == in2;	a value less than 0 if in1 < in2; and a value greater than 0 if in1 > in2
	
	int compare_Unsigned_num = Integer.compareUnsigned(in1, in2);
	System.out.println("Result of comparing Unsigned numbers is: " + compare_Unsigned_num);
	//the value 0 if in1 == in2; a value less than 0 if in1 < in2 as unsigned values; and a value greater than 0 if in1 > in2 as unsigned values
    }

}
