package DDT;


//import java.io.File;
import java.net.MalformedURLException;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.phantomjs.PhantomJSDriver;
//import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Selenium_Grid {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		WebDriver driver; 
		String baseURL, nodeURL;
		nodeURL = "http://172.30.9.55:5555/wd/hub";
		baseURL = "http://google.com";
		
		DesiredCapabilities capability=DesiredCapabilities.phantomjs();
		capability.setCapability("phantomjs.binary.path", "C:\\SeleniumDriver\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		//capability.setBrowserName("firefox");	
		
		capability.setPlatform(Platform.ANY);
		//capability.setCapability("Version", 45.0.2)th());
	      //capabilities.setPlatform(org.openqa.selenium.Platform.LINUX);
		
		
		//driver= new RemoteWebDriver(new URL(nodeURL), capability);
		driver = new RemoteWebDriver(new URL("http://10.40.84.151:5569/wd/hub"), capability);
		driver.get(baseURL);
		System.out.println("Title of the page "+ driver.getTitle());
	     System.out.println(driver.getTitle());
		
	}
}
