package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class Alerthandling {
ChromeDriver driver;
String baseurl="file:///F:/PERSONAL/PROGRAMMING/USEFUL%20DOCS/alert.html";
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
}
@Test
public void Alerttest()
{
	driver.findElement(By.xpath("//input[@type='button']")).click();
	Alert a=driver.switchTo().alert();
	String alertext=a.getText();
	if(alertext.equals("Hello i am an alert box"))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	a.accept();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ashna");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("elizabath");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
}






}
