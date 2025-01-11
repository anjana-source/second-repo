package testscript2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base {
	
	public void tablePrinting()
	{
		//table[@id='dtBasicExample']
		
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(table.getText());
	}
	
	public void rowPrinting()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		//table[@id='dtBasicExample']//tbody//tr[2]
	
	  WebElement row=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[2]"));
	  System.out.println(row.getText());
	}
public void cellPrinting()
{
	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	//table[@id='dtBasicExample']//tbody//tr[6]//td[3]

  WebElement cell=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[6]//td[3]"));
  System.out.println(cell.getText());
  
}
public void columnPrinting()
{
	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	//table[@id='dtBasicExample']//tbody//tr//td[2]

  List<WebElement> column=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[4]"));
 for(WebElement list1:column)
 {
  System.out.println(list1.getText());
 }
  
}

	
	public static void main(String[] args) {
		TableHandling tablehandling= new TableHandling();
		
		tablehandling.initaialBrowser1();
		// tablehandling.tablePrinting();
		//tablehandling.rowPrinting();
		//tablehandling.cellPrinting();
		tablehandling.columnPrinting();
		

	}

}
