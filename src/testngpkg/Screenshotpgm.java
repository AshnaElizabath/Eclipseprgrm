package testngpkg;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Screenshotpgm {
	String baseurl="https://www.demo.guru99.com/test/drag_drop.html";
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void test() throws IOException
	{
		File screenshot=((TakesScreenshot).driver).getScreenshotAs(OutputType.FILE);
		FileHandler.cpoy(screenshot,new File)
	}
	
	
	
	
	
	
	
}
