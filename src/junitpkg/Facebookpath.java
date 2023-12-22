package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookpath {
ChromeDriver driver;
String baseurl="https://www.facebook.com";
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get(baseurl);

}
@Test
public void fbtest()

{
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("asdhh123");
	driver.findElement(By.xpath("//button[@name='login']")).click();
}
}
