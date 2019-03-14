import java.util.Scanner;
class ansque extends Thread{
	int marks=0;
	String str;
	Scanner sc = new Scanner(System.in);
	String[] questr= new String[3];
	String []ans= new String[3];
       public void questionshow() { 
    	   
    	   questr[0]= "1. Java Support Multiple Inheritance";
    	   questr[1]= "1. Java Support Multiple Inheritance";
    	   questr[2]= "1. Java Support Multiple Inheritance";
    	   //System.out.println(questr[0]);
	       ans[0]="1";
	       ans[1]="1";
	       ans[2]="1";
       }
	       
	       void runquestion() throws InterruptedException
	         {
	    	   String str=null;
	    		for(int i=0; i<=questr.length; i++) {
	    		
	    			String s=questr[i];
	    			System.out.println(s);
	    			 System.out.println("1.Yes");
	    		       System.out.println("2.No");
	    		       System.out.print(": ");
	    		       str= sc.next();
	    		       Thread.sleep(1000);
	    			if(str==ans[i]) {
	    				marks++;
	    			}
	    		}
	    	}
}
public class Qiz {
	public static void main(String[] args)  throws Exception
	 {
		ansque qz =new ansque();
		qz.questionshow();
		qz.runquestion();
	}
}

