package stepDefenition;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import PageObject.HomeLoan;
import PageObject.loginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import resources.base;

@RunWith(Cucumber.class)
public class StepDefenition extends base {

    @Given("^Initialize the browser with chrome$")
    public void initialize_the_browser_with_chrome() throws Throwable {
    	driver =initializeDriver();
    }
    @Given("^Navigate to \"([^\"]*)\" Site$")
    public void navigate_to_site(String arg1) throws Throwable {
    	driver.get(arg1);
    }

  
  
     
     @Then("^Land on homepage and checking the calculator$")
	public void land_on_homepage_and_checking_the_calculator() throws Throwable {
		
   	 HomeLoan l=new HomeLoan(driver);
 	   l.gethomeloan().click();	
 		l.getrepayments().click();
 		l.getslider().click();
WebElement getslider = l.getslider();
		
		Actions actions=new Actions(driver);
		actions.dragAndDropBy(getslider, -100, 0).build().perform();
	    // WebElement value=l.value();
	    // System.out.print(value);
	     l.getapply().click();
   }

  

 
    @When("^User enters (.+) and (.+) and logs in$")
      public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
  	   
  		
  		
  		
      	loginPage lp=new loginPage(driver);
        Assert.assertTrue(lp.getlogin().isDisplayed());
      	lp.getlogin().click();
      	lp.getbusinessButton().click();
  		lp.getemail().sendKeys(username);
  		lp.getpassword().sendKeys(password);		
  		
  		lp.getloginl().click();
      }
       


    @And("^close browsers$")
    public void close_browsers() throws Throwable {
    	 driver.quit();
    }

}