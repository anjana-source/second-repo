package testscript;

public class NavigationCommands extends Base {
	public void navigationCommands()
	{
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

	public static void main(String[] args) {
		
	NavigationCommands navigationCommands=new NavigationCommands();
	
	navigationCommands.initializeBrowser();
	navigationCommands.navigationCommands();
	//navigationCommands.driverQuitandClose();	

	}

}
