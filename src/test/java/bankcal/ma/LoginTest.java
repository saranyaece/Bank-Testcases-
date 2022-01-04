package bankcal.ma;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.LandingPage;
import PageObject.loginPage;
import resources.base;


public class LoginTest extends base {
	@Test(dataProvider="dp")
	public void basePageNavigation(String data) throws IOException
	{
		String users[]=data.split(",");
		driver= initializeDriver();
		driver.get("https://www.bnz.co.nz/");
		LandingPage l=new LandingPage(driver);
		l.getlogin().click();
		
		l.getpersonalButton().click();
		loginPage lp=new loginPage(driver);
		lp.getemail().sendKeys(users[0]);
		lp.getpassword().sendKeys(users[1]);		
		
		lp.getloginl().click();
	}

@DataProvider(name="dp")
String[] readJson() throws IOException, ParseException
{

JSONParser jsonParser=new JSONParser();
FileReader reader=new FileReader("C:\\Users\\admin\\eclipse-workspace\\ma\\jsonfile\\test.json");
Object obj=jsonParser.parse(reader);
JSONObject userloginsJsonobj=(JSONObject) obj;
JSONArray userloginsArray=(JSONArray) userloginsJsonobj.get("userlogins");
String arr[]=new String[userloginsArray.size()];

for(int i=0;i<userloginsArray.size();i++)
{
JSONObject users=(JSONObject) userloginsArray.get(i);
String user=(String) users.get("username");
String pwd=(String) users.get("password");
arr[i]=user+","+pwd;
}
return arr;

}


}




