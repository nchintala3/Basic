package com.testng.com.testng.anotations;

import org.testng.annotations.Test;

public class TestingwithPriority {
  @Test (priority=2)
  public void login() {
	  System.out.println("I am logged In");
  }
  @Test(priority=3)
  public void dashboard() {
	  System.out.println("I am on Dashboard");
  }
  @Test(priority=1)
  public void logout() {
	  System.out.println("I am Logged Out");
  }
}
