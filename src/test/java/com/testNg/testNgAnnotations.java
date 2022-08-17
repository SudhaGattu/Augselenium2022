package com.testNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class testNgAnnotations {
  @Test
  public void testCase1() {
	  System.out.println("inside testcase1");
  }
  @Test
  public void testCase2() {
	  System.out.println("inside testcase2");
  }
  @Test
  public void testCase3() {
	  System.out.println("inside testcase3");
  }
  @Test
  public void testCase4() {
	  System.out.println("inside testcase4");
  }
  @Test
  public void testCase5() {
	  System.out.println("inside testcase5");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("inside before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("inside afterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("inside beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("inside afterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("inside beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("inside afterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("inside  beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("inside after Suite");
  }

}
