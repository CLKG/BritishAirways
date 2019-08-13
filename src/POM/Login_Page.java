package POM;

import Design.Base_Page;
import Design.Generic_Select;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class Login_Page extends Design.Base_Page {
	
	
	

public Login_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	
}

	@FindBy(xpath="//a[@id='userAccountLink']']")
	private WebElement myAccount;
	
	@FindBy(xpath="//input[@id='SignIn']")
	private WebElement signinbutton;
	
	@FindBy(xpath="//input[@id='FromTag']")
	private WebElement from;
	
	@FindBy(xpath="//input[@id='ToTag']")
	private WebElement totag;
	
		
	public void Myaccount()
	{
		myAccount.click();
		
		
	}
	public void signin()
	{
		signinbutton.click();
	}
	
	public void from()
	{
		from.sendKeys("banglore");
		from.sendKeys(Keys.ARROW_DOWN);
		from.sendKeys(Keys.ENTER);
	}
	
	
	public void dst()
	{
		totag.sendKeys("pune");
		totag.sendKeys(Keys.ARROW_DOWN);
		totag.sendKeys(Keys.ENTER);
		
		
	}
	
	

}
