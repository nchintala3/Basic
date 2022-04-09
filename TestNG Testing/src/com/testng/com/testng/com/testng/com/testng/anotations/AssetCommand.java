package com.testng.com.testng.com.testng.com.testng.anotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssetCommand {
  @Test (enabled=false) //if (enabled=false) is written while running the class it will ignore this test
  public void LoginTest() {
	  Assert.assertEquals("Nagendra", "Nagendra");
	  System.out.println("Login by Email");
  }
  @Test
  public void LoginTest2() {
	  Assert.assertEquals("Nagendra", "Pavan");
	  System.out.println("Login by Email");
  }
}

