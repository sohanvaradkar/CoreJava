package com.learn.program;

import java.util.Scanner;

public class AtmPinBank {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Alibaba Mauritius Ltd.");

		System.out.println();
		System.out.println("Press 1 to enter your ATM");
		int choice = scan.nextInt();
		if(choice==1){
			System.out.println("You have successfully entered your ATM");	
		}else{
			System.out.println("Card not inserted properly. Retry!");
			System.exit(0);
		}
		System.out.println("Enter your pin");

		boolean validated = false;
		String user = null;
		int attempt = 0;

		//Only three attempts to enter ATM pin
		while(attempt<=3){
			int pin = scan.nextInt();
			validated = validatePin(pin);
			user = getUser(pin);

			if(validated==false){
				++attempt;
				if (attempt==3){
					System.out.println("Your card has been blocked. Please contact your bank");
					break;
				}
				System.out.println("Please re-enter the pin");
			}else{
				displayBankingOptions(validated, user);
			}
		}
	}

	//function to validate length of pin 
	public static boolean validatePin(int pin){
		boolean validationResult = false;
		String pin1 = String.valueOf(pin);
		int pinLength = pin1.length(); 
		//System.out.println(pinLength);

		if(pinLength==4){
			validationResult = true;
		}

		if(pin!=2627 ){
			System.out.println("Incorrect Pin");
			validationResult = false;

		}
		return validationResult;
	}

	public static String getUser(int pin){
		String user = null;
		if(pin==2627){
			user = "A";
		}else if(pin==1142){
			user = "B";
		}

		return user;
	}

	//Creating ATM Banking Menu
	public static void displayBankingOptions(boolean validated, String user){

		//System.out.println("Operation for user "+ user);
		while(validated){

			System.out.println("");
			System.out.println("View Account Balance, Enter 1");
			System.out.println("Withdraw Cash, Enter 2");
			System.out.println("To Exit, Enter 0");

			System.out.println();
			System.out.println("Enter choice::");
			Scanner scan = new Scanner(System.in);
			int choice = scan .nextInt();

			switch(choice){
			case 1: System.out.println("Your Account balance is: ");
			AtmPinBankDAO dao = new AtmPinBankDAO();
			dao.showBalance(user);  //call showBalance method from AlibabaMBDAO class 
			break;
			case 2: System.out.println("Enter the amount to be withdrawn. Available denominations are Rs. 100, Rs. 200, Rs. 500, Rs. 1000");
			Scanner sc = new Scanner(System.in);
			int withdrawalAmount = sc.nextInt();
			AtmPinBankDAO dao1 = new AtmPinBankDAO();
			dao1.withdraw(user, withdrawalAmount); //call withdraw method from AlibabaMBDAO class
			break;
			case 0: System.out.println("Thank you for using Alibaba Mauritius.");
			System.exit(0); //Lets you exit from ATM system
			}
		}
	}

}
