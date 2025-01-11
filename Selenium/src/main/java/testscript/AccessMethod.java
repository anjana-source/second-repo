package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AccessMethod extends Base{
	
	public void parent()
	{
		//1.parent axes methods
		//child-->parent   //tag[@attribute='value']//parent::tag
		WebElement xpath=driver.findElement(By.xpath("//button[@id='button-one']//parent::form"));
	}
	
	public void child()
	{
		//2.child axes methods
		//parent-->child   //tag[@attribute='value']//child::tag
		WebElement xpath=driver.findElement(By.xpath("//div[@id='collapsibleNavbar']//child::ul"));
	}
	
	public void followingsibling()
	{
		//following sibling   //tag[@attribute='value']//following-sibling::tag
		WebElement xpath=driver.findElement(By.xpath("//button[@id='button-one']following-sibling::div"));
		
	}
	public void following()
	{
		//tag[@attribute='value']//following::tag
		WebElement xpath=driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='example my-3']"));	
	}
	public void preceeding()
	{
		//tag[@attribute='value']//preceeding::tag
		WebElement xpath=driver.findElement(By.xpath("//button[@id='button-one']//preceeding::div[@class='header-top']"));
	}
	
	public void ancestor()
	{
		//button[@id='button-one']//ancestor::div
		WebElement id1=driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div"));
	}
	
	public void descendant()
	{
		WebElement id1=driver.findElement(By.xpath("(//div[@id='collapsibleNavbar']//descendant::li)"));
		
		WebElement id2=driver.findElement(By.xpath("(//div[@id='collapsibleNavbar']//descendant::li)[4]")); // by indexing
	}
	
	
	public static void main(String[] args) {
	
}


}
