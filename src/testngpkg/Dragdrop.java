package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dragdrop {
	String baseurl="https://www.demo.guru99.com/test/drag_drop.html";
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void Test()
	{
		WebElement from=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement to=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		WebElement from1=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement to1=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		WebElement from2=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement to2=driver.findElement(By.xpath("//*[@id=\"loan\"]"));
		WebElement from3=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement to3=driver.findElement(By.xpath("//*[@id=\"amt8\"]"));
		
		Actions act=new Actions(driver);
		 act.dragAndDrop(from, to);
		 act.dragAndDrop(from1, to1);
		 act.dragAndDrop(from2, to2);
		 act.dragAndDrop(from3, to3);
		 act.perform();
		 
	}
}
