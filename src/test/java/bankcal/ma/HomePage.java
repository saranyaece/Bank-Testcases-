package bankcal.ma;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import PageObject.LandingPage;
import resources.base;


public class HomePage extends base{
	public static Logger log =LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver= initializeDriver();
		log.info("Driver is initialized");
		driver.get("https://tools.anz.co.nz/home-loans/repayment-calculator/");
		log.info("Navigated to HomePage");
	}
	
@Test()
	public void basePageNavigation() throws IOException
	{

	
		
		LandingPage l=new LandingPage(driver);
		
		l.getpersonal().sendKeys("8000");
		log.info("enter the value");
		l.getcs().click();
		l.getget().click();
		l.getapply().click();
		log.info("successfully click the apply button");
				
		
	}
@AfterTest
public void teardown()
{
driver.close();	
}

}




