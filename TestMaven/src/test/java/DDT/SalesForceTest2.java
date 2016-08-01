

package DDT;


import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
//import org.testng.Assert;
//import org.testng.Assert;
//import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.ExcelDataConfig;
//import utility.Helper;

public class SalesForceTest2 {
	WebDriver driver;
	ExcelDataConfig config;
	 
	
	//@Test(dataProvider="testdata")
	@Test
	public void logintoSales() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver.exe");
		 //driver=new FirefoxDriver();
		driver=new ChromeDriver();
		//driver.get("https://test.salesforce.com/");
	   //driver.manage().window().maximize();
		
		//File src = new File("C:\\SeleniumDriver\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		//System.setProperty("phantomjs.binary.path",src.getAbsolutePath());
		//PhantomJSDriver driver = new PhantomJSDriver();
	   	//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//WebDriver driver = new HtmlUnitDriver();
		//driver.get("https://www.google.com/");
		//driver.get("https://test.salesforce.com/");
		driver.get("https://nylic--qa.cs43.my.salesforce.com/home/home.jsp");
	   //	Helper.captureScreenshot(driver,"BrowserStarted");
	   	//System.out.println("Title of the page "+ driver.getTitle());
	   	
	   	//System.out.println("Title of the page "+ driver.getCurrentUrl());
	   	
	   //driver.findElement(By.id("username")).sendKeys(u);
		//Helper.captureScreenshot(driver,"Entered username");
	   //	driver.findElement(By.id("password")).sendKeys(p);
	   //	Helper.captureScreenshot(driver,"Entered password");
	   	//driver.findElement(By.id("Login")).click();
	   	
	   	//Helper.captureScreenshot(driver,"Clicked on Login");
	    Thread.sleep(5000);
	    //Assert.assertTrue(driver.getTitle().contains("Google"),"user is not able to login-invalidcredential");
	    
	    //System.out.println("Page tite is verified user is able to log in succesfully");
	    //Thread.sleep(10000);
	    driver.findElement(By.xpath("//div[@id='createNewButton']")).click();
	   	
	    
	   	driver.findElement(By.linkText("Consumer")).click();
	   	
	   	driver.findElement(By.xpath("//select[@name='p3']")).click();
	   	
	   	//assertEquals(driver.getTitle(), "");

	}

	


	//@AfterMethod
	//public void tearDown()
	//{
		//driver.quit();
		//Helper.captureScreenshot(driver,"Closed Browser");
		//System.out.println("Browser Closed ");
	//}
	
	//@DataProvider(name="testdata")
	//public Object[][] passData()
	//public Object[][] TestDataFeed(){
	//{
		
		
		//config = new ExcelDataConfig("C:\\Users\\t15juo8\\workspace\\SalesForceLogin1\\TestData\\Salesdata.xlsx");
		
		//int rows = config.getRowCount(0);
		//int rows = 2;
		//Object[][] data = new Object[rows-1][2];
		//for(int i=1 ;i<rows;i++)
			
		//{

		//data[i-1][0]= config.getData(0,i,0);
		//data[i-1][1] = config.getData(0,i,1);
		
		//}
//=============================================================
		//return data;
	
	//}
	
	//}
}
	
	
	
	
	

