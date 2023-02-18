package Tsf;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest
{
	WebDriver driver=null;
  
  @BeforeTest
  public void Login() throws Throwable
  {
	  //Driver Launch
	  	  System.setProperty("webdriver.chrome.driver","C:\\Users\\mihir\\Desktop\\task1\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://www.thesparksfoundationsingapore.org/");
		  driver.manage().window().maximize();
		
	  //Verify Title
		  String title1 = driver.getTitle();
	 	  System.out.println(title1);
		  Assert.assertEquals("The Sparks Foundation | Home", title1);

	  //verify Home Page Logo
		  WebElement verifylogo = driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/h1/a/img"));
		  Assert.assertTrue(verifylogo.isDisplayed(),"Home Page Logo not displayed");
		
	 //AboutUs Page
		  WebElement ClickOnAboutUsPage =  driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[1]/a"));
		  ClickOnAboutUsPage.click();
		  Thread.sleep(2000);
		  
		  WebElement ClickOnExeutiveAboutUsDropdown =  driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[1]/ul/li[4]/a"));
		  ClickOnExeutiveAboutUsDropdown.click();
		  Thread.sleep(2000);
		  
		  String ExecutiveTeamHeader =  driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[2]/h2")).getText();
		  Assert.assertEquals("Executive Team", ExecutiveTeamHeader);
		  System.out.println(ExecutiveTeamHeader);
		  
		  String FounderName =  driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/div/h4")).getText();
		  Assert.assertEquals("Priyesh Kumar", FounderName);
		  System.out.println(FounderName);
		  
		  WebElement FounderDescription =  driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/div/p"));
		  Assert.assertTrue(FounderDescription.isDisplayed(),"Founder Discription not displayed");
		  
		  WebElement FounderPicture =  driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/a/img"));
		  if(FounderPicture.isDisplayed())
		  {
			  FounderPicture.click();
			  String title2 = driver.getTitle();
			  System.out.println(title2);
			  
			  String MainWindow2=driver.getWindowHandle();
			  driver.switchTo().window(MainWindow2);
			  System.out.println(MainWindow2);
		  }
		  else
		  {
			  System.out.println("Founder Picture not dislayed");
		  }
		  
	  //Verify policy and code page
		  WebElement policy=driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[2]/a"));
		  policy.click();
		  Thread.sleep(3000);
		  
		  WebElement ethics=driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[2]/ul/li[2]/a\n"));
		  ethics.click();
		  Thread.sleep(3000);
		  
		  String heading=driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[2]/h2")).getText();
		  Assert.assertEquals("Code Of Ethics And Conduct", heading);
		  System.out.println(heading);
		  
	  //Verify programs page
		  WebElement program=driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[3]/a"));
		  program.click();
		  Thread.sleep(3000);
		  
		  WebElement workshop=driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[3]/ul/li[4]/a"));
		  workshop.click();
		  Thread.sleep(3000);
		  WebElement student=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/ul/li[1]/a"));
		  student.click();
		  Thread.sleep(3000);
			  
		  String studentscholar=driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[2]/h2")).getText();
		  Assert.assertEquals("Student Scholarship Program",studentscholar );
		  System.out.println(studentscholar);
		  
   	 //Verify Links page Details
		  WebElement links=driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[4]/a"));
		  links.click();
	      Thread.sleep(3000);
		  	
	      WebElement AI=driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[4]/ul/li[3]/a"));
	      AI.click();	  
	      Thread.sleep(3000);
		  
	      WebElement nextlink=driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/div/div/div[2]/div/a"));
	      nextlink.click();
	      Thread.sleep(3000);
		  	
	      String MainWindow1=driver.getWindowHandle();
	      driver.switchTo().window(MainWindow1);
	      System.out.println(MainWindow1);
	      
	  //Verify JoinUs Page details
	      WebElement joinus=driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[5]/a"));
	      joinus.click();
	      Thread.sleep(2000);
		  	
	      WebElement why=driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[5]/ul/li[1]/a\n"));
	      why.click();
	      Thread.sleep(2000);
		 	
	      String span=driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[3]/h3/span")).getText();
		  Assert.assertEquals("Be Your Own Boss", span);
		  System.out.println(span);
     	  
	  //Verify ContactUs page Details(Header)
		  WebElement clickoncontactuspage =  driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[6]/a"));
		  clickoncontactuspage.click();
		  Thread.sleep(2000);
			
		  String header = driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[2]/h2")).getText();
		  Assert.assertEquals("Contact Us",header,"Contact Us Header Not displayed ");
		  System.out.println(header);
		  
		  WebElement GotoHomepage =  driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/h1/a/img"));
		  GotoHomepage.click();		  

		  Thread.sleep(3000);
		  
	  //Driver close		  
		  driver.close();		
		  System.out.println("Driver Close");

  }  
  
}
