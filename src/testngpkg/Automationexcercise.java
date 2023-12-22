package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Automationexcercise {
	String baseurl="https://automationexercise.com/login";
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void autmtest()
	{
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));
		WebElement fullname=driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]"));
		fullname.sendKeys("Ashna");
		WebElement emailid=driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")); 
		emailid.sendKeys("abc926@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("ash12&8");

		 WebElement dayelement=driver.findElement(By.xpath("//*[@id=\"days\"]"));
		 Select day=new Select(dayelement);
		 day.selectByValue("2");
		 WebElement monthelement=driver.findElement(By.xpath("//*[@id=\"months\"]"));
		 Select month=new Select(monthelement);
		month.selectByVisibleText("February");
		 WebElement yearelement=driver.findElement(By.xpath("//*[@id=\"years\"]"));
		 Select year=new Select(yearelement);
		year.selectByValue("2002");
		driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("Ashna");
		driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("Elizabath");
		driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("LOVESHORE(H) AROOR P.O KOCHI");
		WebElement countryElement=driver.findElement(By.xpath("//*[@id=\"country\"]"));
		 Select country=new Select(countryElement);
		 country.selectByValue("India");
		driver.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("Kerala");
		driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Kochi");
		driver.findElement(By.xpath("//*[@id=\"zipcode\"]")).sendKeys("688534");
		driver.findElement(By.xpath("//*[@id=\"mobile_number\"]")).sendKeys("9037157830");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button")).click();
		 
		
	}
	@Test
	public void testt()
	{
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")).sendKeys("abc926@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")).sendKeys("ash12&8");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
		String expectedurl="https://automationexercise.com/";
		String crnturl=driver.getCurrentUrl();
		if(crnturl.equals(expectedurl))
		{
			System.out.println(crnturl);
		}
		else
		{
			System.out.println("Url is different");
			System.out.println("Actual url is :"+crnturl);
		}
	
	}
	
}
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


