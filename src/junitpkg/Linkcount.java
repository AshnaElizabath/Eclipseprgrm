package junitpkg;

import java.util.List;

//import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {
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
	List<WebElement> linkdetails=driver.findElements(By.tagName("a"));
	System.out.println("total no. of links="+linkdetails.size());
	for (WebElement element: linkdetails) {
	    String linkText = element.getText();
	    String linkURL = element.getAttribute("href");
	    System.out.println("Link Text: " + linkText);
	    System.out.println("Link URL: " + linkURL);
	}

	
}
//@After
//public void backup()
//{
	//driver.quit();
//}
}	
	
	
	
	
	

