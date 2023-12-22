package junitpkg;

import org.junit.After;
import org.junit.Before;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonprgm {
ChromeDriver driver;
String baseurl="https://www.amazon.in";
@Before
public void setup()throws InterruptedException
{
	driver=new ChromeDriver();
	driver.get(baseurl);
	Thread.sleep(10000);
	driver.manage().window().maximize();
}
@Test
public void Amztest() 
{
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("phones");
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	driver.findElement(By.xpath("//*[@id='nav-xshop']/a[5]")).click();
	driver.findElement(By.xpath("//*[@id='nav-cart-count']")).click();
	
}
@After
public void teardown()
{
	driver.quit();
}
}
