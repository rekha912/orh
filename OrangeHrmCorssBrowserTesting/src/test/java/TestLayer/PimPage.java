package TestLayer;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;

public class PimPage extends BaseClass  {
String empID;
	@Test(priority =1 , groups= {"PimPage","EndToEndTesting"} , dependsOnGroups = "HomePage")
	 public void pimPageLink() throws InterruptedException
	 {
		 Thread.sleep(1000);
	getDriver().findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[2]")).click();
	getDriver().findElement(By.xpath("(//button[@type='button'])[4]")).click(); 	 
	getDriver().findElement(By.name("firstName")).sendKeys("Rekha");	 
	getDriver().findElement(By.name("lastName")).sendKeys("Misal");
	empID = getDriver().findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"))
			.getAttribute("value");

	Thread.sleep(5000);
	getDriver().findElement(By.xpath("//button[@type='submit']")).click(); 
	 Thread.sleep(5000);
	 }
	@Test(priority =2 , groups= {"PimPage","EndToEndTesting"} , dependsOnGroups = "HomePage")
	public void addMoreDetails() throws InterruptedException {
		Thread.sleep(5000);
		getDriver().findElement(By.xpath("//label[text()='SSN Number']/following::input[1]")).sendKeys("1245454899");
		getDriver().findElement(By.xpath("//label[text()='SIN Number']/following::input[1]")).sendKeys("1234567899");
		//find female radio button
		getDriver().findElement(By.xpath("(//div[@clear='false'])[2]")).click();
		getDriver().findElement(By.xpath("(//div[@role='option'])[3]")).click();
		Thread.sleep(5000);
		//find blood group
		getDriver().findElement(By.xpath("(//div[@class='oxd-select-text--after'])[3]")).click();
		getDriver().findElement(By.xpath("//span[text()='AB+']")).click();
		getDriver().findElement(By.xpath("(//label[text()='SSN Number']/following::input)[3]")).sendKeys("2000-12-2");
		Thread.sleep(5000);
		//find female radio button
		//	driver.findElement(By.xpath("(//label[text()='SSN Number']/following::input)[5]")).click();
		//smoker radio button
		getDriver().findElement(By.xpath("(//label[text()='SSN Number']/following::input)[6]")).sendKeys("No");
}
}
