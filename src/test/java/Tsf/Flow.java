package Tsf;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Flow {
  @Test
  public void f() 
  {
	  System.out.println("test");
  }
  
  @BeforeClass
  public void beforeClass()
  {
	  System.out.println("before class");
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("Before Method");
  }
  @AfterClass
  public void afterclass() 
  {
	  System.out.println("after classs");
  }
  @AfterMethod
  public void aftermethod()
  {
	  System.out.println("after method");
  }
  @BeforeTest
  public void Beforetest()
  {
	  System.out.println("before test");
  }
  
}
