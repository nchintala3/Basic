package com.testng.com.testng.anotations;

import org.testng.annotations.Test;

public class ParellelTesting {
  @Test (groups=("regression"))
  public void login() {
	  System.out.println("system login: "+ Thread.currentThread().getId());
  }
  @Test (groups=("smoke"))
  public void dashboard() {
	  System.out.println("system login to dashboard: "+ Thread.currentThread().getId());
  }
  @Test (groups=("regression"))
  public void logout() {
	  System.out.println("system logout: "+ Thread.currentThread().getId());
  }
}
