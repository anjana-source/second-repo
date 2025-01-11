package testscript;

public class BroswerCommands extends Base{
	public void browserCommand()
	{
		//String url=	driver.getCurrentUrl();
		//System.out.println(url);
		String title=driver.getTitle();
		System.out.println(title);
		//String page=driver.getPageSource(); //for get HTML code 
		//System.out.println(page);
		

		
		
	}

	public static void main(String[] args) {
		
		BroswerCommands browsercommands=new BroswerCommands();
		
		browsercommands.initializeBrowser();
		browsercommands.browserCommand();
	//	browsercommands.driverQuitandClose();
				
	

	}

}
