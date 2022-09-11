package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SimplelearnLoginTest extends BaseClass {
	@Test
	public void Test1() throws InterruptedException {
		Pages.LoginPage lp = new Pages.LoginPage(driver);
		lp.Login("kumar.indian777@gmail.com","*Dine2207*");
		Thread.sleep(2000);

		// error verification
		Thread.sleep(2000);
		WebElement Error = driver.findElement(By.id("msg_box"));
		String Actual_Error = Error.getText();
		String Expected_Error = "The email or password you have entered is invalid.";
		Assert.assertTrue(Error.isDisplayed());
		Assert.assertEquals(Actual_Error,Expected_Error);
		}
	@Test
	@Parameters({"uname","pwd"})
	public void Test2(String Username,String Password) throws InterruptedException {
		Pages.LoginPage lp = new Pages.LoginPage(driver);
		lp.Login(Username,Password);
		
		
	}
	@Test
	public void Test3() throws InterruptedException {
		String Username = sheet.getRow(1).getCell(0).getStringCellValue();
		String Password = sheet.getRow(1).getCell(1).getStringCellValue();
		Pages.LoginPage lp = new Pages.LoginPage(driver);
		lp.Login(Username,Password);
	}
		
}
