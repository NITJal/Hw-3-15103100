import java.io.IOException;
import java.util.Scanner;

public class ATM {
	static int availBal=2000;
	public static boolean checkNum(int num) throws IOException{
		if(String.valueOf(num).length()==5){
			System.out.println("Thank you! You're card number is " +num);
			return true;
			
			}
			else{
				throw new IOException("Invalid card number");

			}
		}
	public static void addNum(int  x) throws Exception {
		if (x>0){
		try{
			
			availBal=availBal+x;
			System.out.println("The current balance is : "+availBal);
				
		}
		catch(Exception E){
			System.out.println(E.getStackTrace());
			
		}
		}
		else{
			System.out.println("pls enter the right amount");
		}
	}
	public static void withdraw(int x)throws Exception{
		if(availBal-x>2000){
			
			System.out.println("Current balance is"+(availBal-x));
		}
		else{
			throw new Exception("Balance has reached minimum level, cant withdraw");
		}
		
	}
	
	public static void check(){
		System.out.println("Current balance is "+availBal);
	}
	

	public static void main(String args[]){
		int availBal=2000;
		int ch;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your card number");
		int n=sc.nextInt();
		try {
			checkNum(n);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			if(checkNum(n)){
				System.out.println("We provide the following services:-");
				System.out.println("Press 1 :To add money to your account");
				System.out.println("Press 2 :To withdraw money from your account");
				System.out.println("Press 3 :To check your account balance");
				ch=sc.nextInt();
				switch (ch){
				case 1:
					int a;
					System.out.println("Enter the amount to be added");
					a=sc.nextInt();
					try {
						addNum(a);
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				case 2:
					int b;
					System.out.println("Enter the amount to be withdrawn");
					b=sc.nextInt();
					try {
						withdraw(b);
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				case 3:
					
					try {
						check();
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				case 4:
					System.out.println("Invalid choice");
					break;
				}
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	
	}


