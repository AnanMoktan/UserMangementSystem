package com.ums.dao.impl;

import java.util.Scanner;

import com.ums.dao.UserDAO;
import com.ums.model.User;

public class UserDAOImpl implements UserDAO {

	User[] addUsers=new User[2];
	 Scanner sc=new Scanner(System.in);
	@Override
	public void register() {
		// TODO Auto-generated method stub
		for(int i=0; i<2;i++) {
			System.out.println("Enter user ID");
			int id=sc.nextInt();
			System.out.println("Enter First Name");
			String fname=sc.next();
			System.out.println("Enter Last Name");
			String lname=sc.next();
			System.out.println("Enter email");
			String email=sc.next();
			System.out.println("Enter User Name");
			String uname=sc.next();
			System.out.println("Enter Password");
			String pass=sc.next();
			
			User user= new User(id,fname,lname,email,uname,pass);
			addUsers[i]=user;
		}
		
		
		

	}

	@Override
	public boolean verifyUserNameAndPassword(String uname, String pass) {
		// TODO Auto-generated method stub
		for(User u: addUsers) {
			if(u.getUserName().equals(uname)&&u.getPassword().equals(pass)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String forgotPassword(String uname) {
		// TODO Auto-generated method stub
		for(User us : addUsers) {
			if(us.getUserName().equals(uname))
				return us.getPassword();
		}
		return null;
	}

}
