package testngpkg;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngdemo {

	//@beforesuite
	//@beforetest
	//@beforemethod
	//@test
	//@aftermethod
	//@afterclass
	//@aftertest
	//@aftersuite
@BeforeTest
public void setup()
{
	System.out.println("browseropen");
}
@BeforeMethod
public void urlload()
{
	System.out.println("url loading");
}
@Test(priority=1,enabled=false)
public void test1()
{
	System.out.println("test1");
}
@Test(priority=0,invocationCount=3)
public void test2()
{
	System.out.println("test2");
}
@AfterMethod
public void aftrmthd()
{
	System.out.println("aftermethod");
}
@AfterTest
public void teardown()
{
	System.out.println("browserclosed");
}
	
}
