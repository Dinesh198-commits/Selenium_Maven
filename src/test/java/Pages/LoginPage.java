package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	@FindBy(linkText = "Log in")
	WebElement LoginLink;
	@FindBy(name = "user_login")
	WebElement UserName;
	@FindBy(id = "password")
	WebElement password;
	@FindBy(name = "btn_login")
	WebElement LoginButton;
	@FindBy(className = "rememberMe")
	WebElement RButton;
	
	public LoginPage(WebDriver basedriver) {
		this.driver = basedriver;
		PageFactory.initElements(basedriver, this);
	}
	
	
	public void Login(String Username,String Password) throws InterruptedException {
		//Step 1-click on log in link
		Thread.sleep(5000);
		LoginLink.click();		
		//step-3 input value of elements
		UserName.sendKeys(Username);
		password.sendKeys(Password);
		Thread.sleep(3000);
	
		//click on remember me button
	    RButton.click();
				
		//click on Login button
		LoginButton.click();
	    Thread.sleep(3000);
	    
	    
				
		
		
		
	}

}
