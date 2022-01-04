package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	public WebDriver driver;
	
	By personal=By.id("LoanAmount");
	By cs=By.className("spinning");
	By get=By.className("js-CallToAction");
	By apply=By.id("next");
	By login=By.id("bnz-web-ui-toolkit-5");

	By personalButton=By.className("TextLink-text-31");	
	
	
	public LandingPage( WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;		

}	

	public WebElement getpersonal()

	{
		return driver.findElement(personal);
	}
	
	public WebElement getcs()
	{
		return driver.findElement(cs);
	}
	public WebElement getget()
	{
		return driver.findElement(get);
	}
	public WebElement getapply()
	{
		return driver.findElement(apply);
	}
	
	public WebElement getlogin()
	{
		return driver.findElement(login);
	}
	public WebElement getpersonalButton()
	{
		return driver.findElement(personalButton);
	}
	
}

