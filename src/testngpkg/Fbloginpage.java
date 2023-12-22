package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbloginpage {
WebDriver driver;
//By fbemail=By.id("email");
//By fbpassword=By.id("pass");
//By fblogin=By.name("login");
//Locating login button
@FindBy(name="login")
WebElement loginbutton;
  
//Locating Email id text box
@FindBy(name="email")
WebElement emailIdField;

//Locating password Text box
@FindBy(name="pass")
WebElement pswd;
public Fbloginpage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
}
public void setvalues(String email,String password)
{
	emailIdField.sendKeys("email");
	pswd.sendKeys("password");
	
	
}
//clicking on login button 
public void login()
{
	loginbutton.click();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
