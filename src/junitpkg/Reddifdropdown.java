package junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Reddifdropdown {
	ChromeDriver driver;
	String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	
		public void test()
		 {
			 WebElement dayelement=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]"));
			 Select day=new Select(dayelement);
			 day.selectByValue("02");
			 WebElement monthelement=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]"));
			 Select month=new Select(monthelement);
			month.selectByVisibleText("FEB");
			 WebElement yearelement=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]"));
			 Select year=new Select(yearelement);
			year.selectByValue("1989");
			
		
			List<WebElement> list_Options=driver.findElements(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]/option"));
			System.out.println("Total no of dropdowns in the list are:"+ list_Options.size());
			System.out.println("Options in the month drop down are:");
			for(WebElement option:list_Options)
			{
				System.out.println(option.getText());
			}
			
			List<WebElement> date_Options=driver.findElements(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]/option"));
			System.out.println("Total no of dropdowns in the list are:"+ date_Options.size());
			System.out.println("Options in the dates in drop down are:");
			for(WebElement option:date_Options)
			{
				System.out.println(option.getText());
			}
			List<WebElement> year_Options=driver.findElements(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]/option"));
			System.out.println("Total no of dropdowns in the list are:"+ year_Options.size());
			System.out.println("Options in the dates in drop down are:");
			for(WebElement option:year_Options)
			{
				System.out.println(option.getText());
			}
		 }
	
	
	
	
	

}
