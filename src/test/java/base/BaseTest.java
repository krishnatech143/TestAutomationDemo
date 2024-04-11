package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	public static FileInputStream fis;
	public static Properties test;
	public static FileInputStream fis2;
	public static Properties locator;
	public static WebDriver driver;
	@BeforeTest
	public void start() throws IOException {
		
		fis=new FileInputStream("src\\test\\resources\\properties\\config.properties");
		
		test=new Properties();
		test.load(fis);
		
		fis2=new FileInputStream("src\\test\\resources\\properties\\locaters.properties");
		
		locator=new Properties();
		locator.load(fis2);
	}
	@BeforeMethod
	public void Broswer() {
		String browsername=test.getProperty("browser");
		if(browsername.endsWith("chrome")) {
			driver= new ChromeDriver();
		}
		else if(browsername.endsWith("firefox")) {
			driver=new FirefoxDriver();
		}
		else if(browsername.endsWith("edge")) {
			driver=new EdgeDriver();
		}
		
		driver.get(test.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	
	@AfterMethod
	public void Finish() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	

}
