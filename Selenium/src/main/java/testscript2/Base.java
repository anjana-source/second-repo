package testscript2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base {

	WebDriver driver;
	public void initaialBrowser1()
	{
	 driver=new ChromeDriver(); 
	 driver.get("https://selenium.qabible.in/");
	 driver.manage().window().maximize(); // window maximization
		
	}
	
	public static void main(String[] args) {
		Base base=new Base();
		base.initaialBrowser1();	

	}

}
