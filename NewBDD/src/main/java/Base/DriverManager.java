package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import Utility.Util;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {

	public static ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();
			
	@BeforeMethod
	public static void CreateDriver() {
		System.out.println("Driver Yaratýlýyor************");
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		//driver.get(Util.properties("config", "Applink"));	
		driver.navigate().to("http://www.google.comtr");
		driver.manage().window().maximize();		
		webDriver.set(driver);
		webDriver.get().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			//.implicitlyWait(Integer.parseInt((Util.properties("config", "ImplicitWait"))), TimeUnit.SECONDS);
	}

	@AfterMethod
	public synchronized void afterSuite() {
		System.out.println("Driver kapanacak************");
		webDriver.get().close();
		webDriver.get().quit();		
	}

}
