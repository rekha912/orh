package TestLayer1;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseLayer1.BaseClass;

public class LoginPage extends BaseClass
{

@BeforeTest(groups={"Loginpage" , "EndToEndTesting"})
@Parameters({"browsername"})

public void setup(String browsername)
{
	initialization(browsername);
}
@Parameters({"username" ,"password"})
@Test(groups={"Loginpage" , "EndToEndTesting"})
public void validateloginFunctionality(String username, String password) throws InterruptedException
{
	Thread.sleep(15000);
	 getDriver().findElement(By.name("username")).sendKeys(username);
	 getDriver().findElement(By.name("password")).sendKeys(password);
	 getDriver().findElement(By.xpath("//button[text()=' Login ']")).click();
}
@AfterTest()
public void teardown()
{
	getDriver().quit();
}


}
