package testngpkg;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class Doubleandrightclick {
String baseurl="https://demo.guru99.com/test/simple_context_menu.html";
ChromeDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
}
@Test
public void test()
{
	Actions act=new Actions(driver);
	WebElement right=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
	act.contextClick(right).perform();
	driver.findElement(By.xpath("//*[@id=\"authentication\"]/button")).click();
	driver.switchTo().alert().accept();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
