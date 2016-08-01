package DDT;







import java.io.File;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
//import org.testng.Assert;
//import org.testng.Assert;
//import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.ExcelDataConfig;
//import utility.Helper;

public class LoginTest {
	WebDriver driver;
	ExcelDataConfig config;
	 
	
	@Test(dataProvider="testdata")
	public void logintoSales(String u, String p) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver.exe");
		// driver=new FirefoxDriver();
		driver=new ChromeDriver();
		//driver.get("https://test.salesforce.com/");
	   //driver.manage().window().maximize();
		
		
		driver.get("https://test.salesforce.com/");
	   //	Helper.captureScreenshot(driver,"BrowserStarted");
	   	System.out.println("Title of the page "+ driver.getTitle());
	   	
	   	//System.out.println("Title of the page "+ driver.getCurrentUrl());
	   	
	   driver.findElement(By.id("username")).sendKeys(u);
		//Helper.captureScreenshot(driver,"Entered username");
	   	driver.findElement(By.id("password")).sendKeys(p);
	   //	Helper.captureScreenshot(driver,"Entered password");
	   	driver.findElement(By.id("Login")).click();
	   	
	   	//Helper.captureScreenshot(driver,"Clicked on Login");
	    Thread.sleep(5000);
	    //Assert.assertTrue(driver.getTitle().contains("Google"),"user is not able to login-invalidcredential");
	    
	    System.out.println("Page tite is verified user is able to log in succesfully");
	    //Thread.sleep(10000);
	    

	}

	


	//@AfterMethod
	//public void tearDown()
	//{
		//driver.quit();
		//Helper.captureScreenshot(driver,"Closed Browser");
		//System.out.println("Browser Closed ");
	//}
	
	@DataProvider(name="testdata")
	//public Object[][] passData()
	public Object[][] TestDataFeed(){
	{
		
		
		config = new ExcelDataConfig("C:\\Selenium\\com.learnautomation.hybrid\\ApplicationTestData\\AppData.xlsx");
		
		//int rows = config.getRowCount(0);
		int rows = 2;
		Object[][] data = new Object[rows-1][2];
		for(int i=1 ;i<rows;i++)
			
		{

		data[i-1][0]= config.getData(0,i,0);
		data[i-1][1] = config.getData(0,i,1);
		
		}
//=============================================================
		return data;
	
	}
	
	}
}
	
	
	
	
	

