package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	WebDriver driver;	
	public void initializeBrowser()
	{
	 driver=new ChromeDriver(); 
	 driver.get("https://selenium.qabible.in/");
	 driver.manage().window().maximize(); // window maximization
		
	}
	
	public void driverQuitandClose()
	{
		//driver.close();
		driver.quit();
		
	}

	public static void main(String[] args) {
		Base base=new Base();
		base.initializeBrowser();
        base.driverQuitandClose();
	}

}
