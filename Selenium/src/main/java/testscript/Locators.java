package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
	
//WebElement elementname=driver.findElement(By.Locator("locator value"));
	
	public void id()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement id1=driver.findElement(By.id("single-input-field"));
		WebElement id2=driver.findElement(By.id("value-a"));
		WebElement id3=driver.findElement(By.id("value-b"));
	/*	
	id1.sendKeys("Hai"); 
		
	WebElement id2=driver.findElement(By.id("value-a"));
	id2.sendKeys("Hello");  
		
		WebElement id3=driver.findElement(By.id("value-b"));
		id3.sendKeys("selenium");  
		
		*/
		
	}
	
	public void name()
	{
		WebElement name1=driver.findElement(By.name("viewport"));
		WebElement name2=driver.findElement(By.name("description"));
		WebElement name3=driver.findElement(By.name("keywords"));
		WebElement name4=driver.findElement(By.name("author"));
	}
	
	public void className()
	{
		WebElement classname1=driver.findElement(By.className("header-top"));
		WebElement classname2=driver.findElement(By.className("mb-sec"));
		WebElement classname3=driver.findElement(By.className("navbar navbar-expand-md navbar-dark"));
		WebElement classname4=driver.findElement(By.className("navbar-brand"));
		
	}
	
	public void linkText()
	{
		WebElement link1=driver.findElement(By.linkText("Radio Buttons Demo"));
		WebElement link2=driver.findElement(By.linkText("Select Input"));
		WebElement link3=driver.findElement(By.linkText("Form Submit"));
		WebElement link4=driver.findElement(By.linkText("Ajax Form Submit"));
		
	}
	public void partialLinkText()
	{
		WebElement partiallink1=driver.findElement(By.partialLinkText("Ajax For"));
		WebElement partiallink2=driver.findElement(By.partialLinkText("Jquery Sel"));
		WebElement partiallink3=driver.findElement(By.partialLinkText("Date Pick"));
		WebElement partiallink4=driver.findElement(By.partialLinkText(" Progress B"));
	}	
public void tagName()
{
	WebElement tagname1=driver.findElement(By.tagName("button"));
	WebElement tagname2=driver.findElement(By.tagName("input"));
	
}
public void cssSelector()
//   tagname[attribute=’value’]

{
	WebElement cssselector1=driver.findElement(By.cssSelector("button[id='button-one']"));
	WebElement cssselector2=driver.findElement(By.cssSelector("input[id='single-input-field']"));
	
}

public void xpath()
// //tagname[@attribute=’value’]
{
	WebElement xapth1=driver.findElement(By.xpath("//button[@id='button-one']"));
	WebElement xapth2=driver.findElement(By.xpath("//input[@id='value-a']"));
	
    driver.findElement(By.xpath("//input[contains(@id,'-a')]")); // for lengthy xpath
    
    driver.findElement(By.xpath("//button[text()='Show Message']"));
    
    driver.findElement(By.xpath("//button[starts-with(text(),'Show')]"));
    
    driver.findElement(By.xpath("//button[@type='button' and @id='button-one']"));// using And function
    
    driver.findElement(By.xpath("//button[@id='button-one' or @id='button-one-electronics' ] "));// using OR function
    
    
    driver.findElement(By.xpath("//div[contains(text(),'Single Input Field')]/..")); // to find parent tag
   
    
    // //tagname[@attribute=’value’]//axesMethodName::tagname :- common syntax for access method

  driver.findElement(By.xpath("//div[contains(text(),'Single Input Field')]//parent::div"));
}
	
	
	public static void main(String[] args) {
		Locators locator=new Locators();
		
		locator.initializeBrowser();
		locator.id();

	}

}
