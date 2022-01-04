package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeLoan {
	public WebDriver driver;
	By homeloan=By.cssSelector("a[href*='home-loans']");
	//By repayments=By.className("sc-gsTEea kWQwQw");
	By repayments=By.cssSelector("a[href*='home-loan-calculator']");
	By slider=By.className("noUi-handle-lower");
	By slideMove=By.cssSelector("noUi-handle-lower[aria-valuenow=397000]");
	By value=By.id("hlc-repayment");
	By apply=By.cssSelector("a[href*='apply-for-a-bnz-home-loan#form-header']");
	
	public HomeLoan( WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;

}
	
	public WebElement gethomeloan()

	{
		return driver.findElement(homeloan);
	}
	
	public WebElement getrepayments()

	{
		return driver.findElement(repayments);
	}
	
	public WebElement getslider()

	{
		return driver.findElement(slider);
		
	}
	public  WebElement getslideMove()
	{
		return driver.findElement(slideMove);
	}
	public  WebElement value()
	{
		return driver.findElement(value);
	}
	public  WebElement getapply()
	{
		return driver.findElement(apply);
	}
	
}



