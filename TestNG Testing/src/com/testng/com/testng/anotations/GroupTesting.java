package com.testng.com.testng.anotations;

import org.testng.annotations.Test;

public class GroupTesting {
  @Test (groups="regression")
  public void regressiontest() {
	  System.out.println("Regression test done");
  }
  @Test (groups= "sanity")
  public void sanitytest() {
	  System.out.println("Sanity test done");
  }
  @Test (groups= "smoke")
  public void smoketest() {
	  System.out.println("Smoke test done");
  }
}
