import java.io.IOException;
import java.util.Scanner;

public class Ques2 {
	public static void main(String args[]) throws Exception{
		String name,  email, address, phoneNumber;
		double mHSC,mUG;
		int rollnumber;
		System.out.println("Please Enter the following details");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		name=sc.nextLine();
		
		System.out.println("Enter your email");
		email=sc.nextLine();
		
		System.out.println("Enter your 8 digit roll Number");
		rollnumber=sc.nextInt();
		
		System.out.println("Enter your address");
		address=sc.nextLine();
		
		System.out.println("Enter your phoneNumber");
		phoneNumber=sc.nextLine();
		
		System.out.println("Enter your marks in HSC");
		mHSC=sc.nextDouble();
		
		System.out.println("Enter your nmarks in UG");
		mUG=sc.nextDouble();
		
		checkName(name);
		checkNum(rollnumber);
		checkEg(mHSC);
		checkEg(mUG);
		checkEligibility(mHSC,mUG);
		
		
		
		
	}
	public static void checkName(String x) throws Exception{
		for (int i = 0; i < x.length(); i++) {
		    char charAt2 = x.charAt(i);
		    if (!Character.isLetter(charAt2)) {
		     throw new Exception("Invalid name");   
		    }
		    else{
		    	System.out.println("Name you entered is "+x);
		    }
		    }
	}
	public static void checkNum(int x) throws IOException{
		if(String.valueOf(x).length()==8){
			System.out.println("You roll number is " +x);
			
			}
			else{
				throw new IOException("Invalid roll number");

			}
		}
	public static void checkEg(double y)throws Exception{
		if(y<0 || y>100){
			throw new Exception("Invalid percentage");
		}
		else{
			System.out.println("You have entered a valid percentage. Pls wait umtil we check your eligibility");
			
		}}
	
		private static void checkEligibility(double x ,double y){
			if(0.6*x+0.7*y>=65){
				System.out.println("Your agreggate marks are greater than 65. Admission granted!");
			}
				else{
				
				System.out.println("Aggregate marks less than 65.Admission denied");
			}
	}
	
	
}