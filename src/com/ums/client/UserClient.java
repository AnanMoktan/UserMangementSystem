package com.ums.client;

import java.util.Scanner;

import com.ums.dao.impl.UserDAOImpl;

public class UserClient {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		UserDAOImpl daoImpl= new UserDAOImpl();
		
		while(true) {
			System.out.println("======================");
			System.out.println("     1)CreateAccount     ");
			System.out.println("     2)SignIn        ");
			System.out.println("     3)ForgotPassword   ");
			System.out.println("     4)Exit  ");

			System.out.println("======================");
			System.out.println("Enter the choice ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				daoImpl.register();
				break;
			case 2:
				System.out.println("Enter User Name");
				String uname=sc.next();
				System.out.println("Enter User password");
				String pass=sc.next();
				boolean flag=daoImpl.verifyUserNameAndPassword(uname, pass);
				if(flag)
					System.out.println("Valid User");
				else
					System.out.println("Invalid User");
				break;
			case 3:
				System.out.println("enter User Name");
				String name = sc.next();
				String password = daoImpl.forgotPassword(name);
				if(password!=null)
					System.out.println("Your password is " + password);
				else 
					System.out.println("User Name dosesn't exists");
				break;
			case 4:
				System.out.println("Thanks for using this application");
				System.exit(0);
				default:
					System.out.println("Choose 1 to 4");
			
			
		}
		
		}
	}
	

}
