package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {
	ChromeDriver driver;
	String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
@Test
public void test()
{
boolean radio = driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[24]/td[3]/input")).isSelected();
  if(radio)
  {
	  System.out.println("Is selected");
  }
  else
	  
	  {
		  System.out.println("Is not selected");
	  }
  }


	
	
	
	
	
	
	
	
}
