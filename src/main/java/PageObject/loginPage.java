package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
	public WebDriver driver;
	By email=By.id("field-principal");
	//id="field-principal"
	By password=By.cssSelector("[type='password']");
	By login=By.id("bnz-web-ui-toolkit-5");
	By loginl=By.id("bnz-web-ui-toolkit-2");
	By businessButton=By.xpath("//span[contains(@class,'TextLink-text-31') and contains(text(), 'Business')]");
			
	public loginPage( WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public WebElement getemail()
	{
		return driver.findElement(email);
	}
	public WebElement getlogin()
	{
		return driver.findElement(login);
	}
	public WebElement getpassword()
	{
		return driver.findElement(password);
	}
	public WebElement getloginl()
	{
		return driver.findElement(loginl);
	}

	public WebElement getbusinessButton() {
		// TODO Auto-generated method stub
		return driver.findElement(businessButton);
	}

	
	


}
