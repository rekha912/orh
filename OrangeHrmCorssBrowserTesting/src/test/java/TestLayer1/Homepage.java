package TestLayer1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseLayer1.BaseClass;

public class Homepage extends BaseClass{
	@Test(priority = 1 , groups={"HomePage","EndToEndTesting"} ,dependsOnGroups="Loginpage")
	public void homePageTitle() throws InterruptedException {
		String actualtitle = getDriver().getTitle();

	 Assert.assertEquals(actualtitle.contains("OrangeHRM"), true);
		System.out.println(actualtitle);
	}

	@Test(priority = 2 , groups={"HomePage","EndToEndTesting"} ,dependsOnGroups="Loginpage")
	public void homePagrUrl() throws InterruptedException {

		String actualurl = getDriver().getCurrentUrl();

		Assert.assertEquals(actualurl.contains("orangehrm"), true);
	}

	@Test(priority = 3 , groups={"HomePage","EndToEndTesting"} ,dependsOnGroups="Loginpage")
	public void homePagrLogo() throws InterruptedException {
		boolean actuallogoStatus = getDriver().findElement(By.xpath("//img[@alt='client brand logo']")).isDisplayed();

		Assert.assertEquals(actuallogoStatus,false);
	}

}
