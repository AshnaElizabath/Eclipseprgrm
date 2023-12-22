package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstscript {

	public static void main(String[] args) {
		
    ChromeDriver driver=new ChromeDriver();//to launch browser
    driver.get("https://www.google.com");//to open a site
String exptitle="google";
String actualtitle=driver.getTitle();
System.out.println("title="+actualtitle);
if(actualtitle.equalsIgnoreCase(exptitle))
{
System.out.println("pass");
}
else
{
	System.out.println("fail");
}
	
	}

}
