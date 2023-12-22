package testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowhandler {
	
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}

	@Test
	public void test()
	{
		driver.get("http://demo.guru99.com/popup.php");
		String parentwindow=driver.getWindowHandle();  //currentwindow
		System.out.println("Parent window Title"+driver.getTitle());
		driver.findElement(By.xpath("/html/body/p/a")).click();
		
		Set<String>allWindowHandles =driver.getWindowHandles();
		for(String handle : allWindowHandles) {
			if(!handle.equalsIgnoreCase(parentwindow)) {
				driver.switchTo().window(handle);
				WebElement inputElement=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input"));
				inputElement.sendKeys("abc@gmail.com");
				String s=inputElement.getAttribute("value");
				System.out.println(s);
				driver.close();
				
				
			}
			driver.switchTo().window(parentwindow);
		}
	}
}