import java.util.Scanner;
class QuesAns extends Thread{
	int count=0;
	Scanner sc = new Scanner (System.in);
       public void show() throws InterruptedException {
    	   synchronized(this) {  
	   System.out.println("1. Java Support Multiple Inheritance");
	   System.out.println("1.Yes");
	   System.out.println("2.No");
	    String str= sc.nextLine();
	   if(str.equals("2")) {
		   System.out.println("Correct");
		   count++;
	   }else {
		   System.out.println("Wrong");
	   }
	  Thread.sleep(2500);
	 //  this.wait(2500);
	   //
	   System.out.println("2. Java has feature of Automatic memory management and garbage collection?");
	   System.out.println("1.Yes");
	   System.out.println("2. No");
	   str=sc.nextLine();
	   if(str.equals("1")) {
		   System.out.println("Correct");
		   count++;
	   }else {
		   System.out.println("Wrong");
	   }
	   Thread.sleep(2500);
	   //this.wait(2500);
	   //
	   System.out.println("3. Java support multiple inheritance?");
	   System.out.println("1. Yes");
	   System.out.println("2. No");
	   str=sc.nextLine();
	   if(str.equals("2")) {
		   System.out.println("Correct");
		   count++;
	   }else {
		   System.out.println("Wrong");
	   }
	   Thread.sleep(2500);
	   //this.wait(2500);
	   //
	   System.out.println("4. Java support pointer?");
	   System.out.println("1. Yes");
	   System.out.println("2. No");
	   str=sc.nextLine();
	   if(str.equals("2")) {
		   System.out.println("Correct");
		   count++;
	   }else {
		   System.out.println("Wrong");
	   }
	   Thread.sleep(2500);
	   //Sthis.wait(2500);
	   //
	   System.out.println( count + " Correct out of 4");
	 
   }
       }
}
public class Projectqa {
public static void main(String[] args) {
	QuesAns aq=new QuesAns();
	try {
		aq.show();
	} catch (InterruptedException e) {
	
		e.printStackTrace();
	}

}
}

