package BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	private static ThreadLocal<WebDriver> driverThreadlocal = new ThreadLocal<WebDriver>();

	public WebDriver getDriver() {

		return driverThreadlocal.get();
	}
	

	public void initialization(String browsername)
	{
	 WebDriver driver = null;
	if(browsername.equals("chrome"))
	{
		driver=new ChromeDriver();
		}
	else if(browsername.equals("edge"))
	{
		driver=new EdgeDriver();
	}
	else if(browsername.equals("firefox"))
	{
		driver=new FirefoxDriver();
	}
	driverThreadlocal.set(driver);
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
}
