package TestLayer;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;

public class Loginpage extends BaseClass {
@Parameters({"browsername"})
@BeforeTest(groups={"Loginpage" , "EndToEndTesting"})
	public void setup(String browsername)
	{
	initialization(browsername);
	}
@Test(groups={"Loginpage" , "EndToEndTesting"})
public void validateloginFunctionality()
{
	 getDriver().findElement(By.name("username")).sendKeys("Admin");
	 getDriver().findElement(By.name("password")).sendKeys("admin123");
	 getDriver().findElement(By.xpath("//button[text()=' Login ']")).click();
}
@AfterTest()
public void teardown()
{
	getDriver().quit();
}
}

