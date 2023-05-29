package generic;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class generic 
{
	private static final String URL = null;
	public WebDriver driver;
	
@BeforeMethod
public void openApp()
{
System.setProperty(chrome_key, chrome_value);
 driver = new chromdedriver();
 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 driver.get(URL);


	
}

@AfterMethod
public void closeApp()
{
	driver.close();
}
}
