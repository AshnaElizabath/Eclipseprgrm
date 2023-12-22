package testngpkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assertprgm {
ChromeDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.google.com/");
}
@Test
public void test()
{
	String exptitle="google";
	String actualtitle=driver.getTitle();
	System.out.println("title="+actualtitle);
	Assert.assertEquals(actualtitle, exptitle);
	System.out.println("title verified");
}
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

