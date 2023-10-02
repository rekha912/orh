package TestLayer;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;

public class EmployeeSearchPage extends BaseClass  {
	@Test(groups= {"EmployeeSearchPage","EndToEndTesting"} , dependsOnGroups = "PimPage")
	public void searchEmployeeByName() throws InterruptedException {
		
		getDriver().findElement(By.xpath("//a[text()='Employee List']")).click();
		Thread.sleep(5000);
		getDriver().findElement(By.xpath("(//input[@placeholder='Type for hints...'])")).sendKeys("Rekha");

		getDriver().findElement(By.xpath("//button[@type='submit']")).click();
	}
}
