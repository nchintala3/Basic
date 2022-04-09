package com.testng.com.testng.com.testng.com.testng.anotations;

import org.testng.annotations.Test;

public class OnDependsMethod {
  @Test(dependsOnMethods= {"third","second"})
  public void first() {
	  System.out.println("I am First");
  }
  @Test(dependsOnMethods= {"third"})
  public void second() {
	  System.out.println("I am Second");
  }
  @Test
  public void third() {
	  System.out.println("I am Third");
  }
}
