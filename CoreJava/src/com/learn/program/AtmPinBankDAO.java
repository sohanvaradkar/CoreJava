package com.learn.program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class AtmPinBankDAO {


	private static int accountBalance;
	/**
	 * function to handle show balance request
	 * @param user
	 */
	public void showBalance(String user){
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			//here TIH is database name, root is username as well as password 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:1206/TIH","root","root");  

			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select balance as ActBalance from AccountTable"); 

			accountBalance = rs.getInt("ActBalance");
			accountBalance = 1000;
			System.out.println("Your account balance is displayed below: ");
			System.out.println(accountBalance);  

			con.close();  
		}catch(Exception e){ System.out.println(e);}  
	}  

	/**
	 * function to handle withdrawal request
	 * @param user
	 * @param withdrawalAmount
	 */
	public void withdraw(String user,int withdrawalAmount){
		try{  
			showBalance(user);

			if(withdrawalAmount>accountBalance){
				System.out.println("Insufficient fund in your Account");
			}else{
				//calculate new account balance after deducting withdrawal amount
				accountBalance = accountBalance-withdrawalAmount;
				
				Class.forName("com.mysql.jdbc.Driver");  
				//here TIH is database name, root is username as well as password 
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:1206/TIH","root","root");  

				final String update_Balance = "update balance set balance = ? where user = ?";
				PreparedStatement stmt= con.prepareStatement(update_Balance);
				stmt.setInt(0, accountBalance);
				stmt.setString(1, user);
				
				stmt.executeUpdate("update_Balance");  
				//System.out.Println("Transaction Complete. Please Collect your cash");
				con.close();  
			}
		}catch(Exception e){ System.out.println(e);}  

	}  

}
