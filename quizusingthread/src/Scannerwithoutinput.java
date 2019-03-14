import java.util.Scanner;
public class Scannerwithoutinput {
//static boolean truefalse = true;

public static void main(String[] args) {

	// Initialize Scanner object
	Scanner scan = new Scanner("15");
	// Printing the radix used by Scanner object
	int a=scan.radix();
	System.out.println("radix:"+a);
	
	// Printing the tokenized Strings
	scan.close();
	System.out.println("Hello1");

	
	
	/*while(scan.hasNextInt()){
		System.out.println(scan.nextInt());
	}
	*/
	
	// closing the scanner stream
	

}

}