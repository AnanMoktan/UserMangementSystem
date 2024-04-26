package com.ums.dao;

public interface UserDAO {
 void register();
 boolean verifyUserNameAndPassword(String uname, String pass);
 String forgotPassword(String uname);
}
