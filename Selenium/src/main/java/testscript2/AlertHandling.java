package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base {
	
	public void simpleAlert()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement simple=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		simple.click();
		driver.switchTo().alert().accept();
		
	}
	
	public void confirmationAlert()
	{

		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");	
		WebElement confirm=driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		confirm.click();
		driver.switchTo().alert().dismiss();
		//driver.switchTo().alert().accept();
	}
	
	public void PromptAlert()
	{

		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement prompt=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		prompt.click();
		driver.switchTo().alert().sendKeys("hello");
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
	}

	public static void main(String[] args) {
		AlertHandling alerthandling=new AlertHandling();
		alerthandling.initaialBrowser1();
	//	alerthandling.simpleAlert();
		//alerthandling.confirmationAlert();
	    alerthandling.PromptAlert();
	}

}
