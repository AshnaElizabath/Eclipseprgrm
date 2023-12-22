package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch {
	ChromeDriver driver;
	String baseurl="https://www.google.com";
	@Before
	public void setup()
	{
	driver=new ChromeDriver();
	driver.get(baseurl);

}
	@Test
	
	public void test()
	{
		driver.findElement(By.name("q")).sendKeys("Books",Keys.ENTER);
	}
	}
	
