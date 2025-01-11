package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButton extends Base {
	
	public void shows()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		WebElement id1=driver.findElement(By.id("single-input-field"));
		// //input[contains(@id,'-input-field')]..... contains
		//WebElement id1=driver.findElement(By.xpath("//input[contains(@id,'-input-field')]"));..... contains
		id1.sendKeys("Hello, welcome"); 
		
		WebElement id2=driver.findElement(By.id("button-one"));
		// //button[text()='Show Message']..... text()
        //WebElement id2=driver.findElement(By.xpath("//button[text()='Show Message']"));..... text()
		id2.click();
		
		
		WebElement  id3=driver.findElement(By.xpath("//input[@id='value-a']"));
		id3.sendKeys("3");
		WebElement id4=driver.findElement(By.xpath("//input[@id='value-b']"));
		id4.sendKeys("4");
		WebElement id5=driver.findElement(By.xpath("//button[@id='button-two']"));
		id5.click();
		
	}
	
	public void radioButton()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		//label[@class='form-check-label']
		WebElement xpath1=driver.findElement(By.xpath("//label[@class='form-check-label']"));
		xpath1.click();
	}
	
	public void isselected()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement maleselected=driver.findElement(By.xpath("//label[@class='form-check-label']"));

		if(maleselected.isSelected())
		{
			System.out.println("male radio button already selected");
		}
		else
		{
			maleselected.click();
			System.out.println("selected");
		}
	}

	public static void main(String[] args) {
		
		RadioButton radiobutton=new RadioButton();
		
		radiobutton.initaialBrowser1();
		//radiobutton.radioButton();
		radiobutton.isselected();
		//radiobutton.shows();
		

	}

}
