package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBox extends Base {
	
	public void checkBox()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		
		WebElement checkbox1=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		//label[@class='form-check-label']
		checkbox1.click();
		
	}

	public static void main(String[] args) {
		CheckBox checkbox=new CheckBox();
		checkbox.initaialBrowser1();
		checkbox.checkBox();

	}

}
