package sg.testing.test.objectmap;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class CrProject
{
	public static String filename="F:\\SaleniumAutomation\\Web_Automation\\src\\sg\\testing\\test\\objectmap.properties";
	public static ObjectMap objmap=new ObjectMap(filename);
	public static WebDriver oBrowser=null;
	static void launchBrowser()
	{
		try
		{
		System.setProperty("webdriver.chrome.driver","F:\\SaleniumAutomation\\Web_Automation\\drivers\\chromedriver.exe");
		oBrowser=new ChromeDriver();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:82/login.do");
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void login()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("loginusername")).sendKeys("admin");
			oBrowser.findElement(objmap.getLocator("loginpassword")).sendKeys("manager");
			oBrowser.findElement(objmap.getLocator("loginloginbtn")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("homepageflyoutwin")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void CreateCustomer()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("tasksbutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("addnew")).click();
			oBrowser.findElement(objmap.getLocator("createcustomer")).click();
			oBrowser.findElement(objmap.getLocator("Customername")).sendKeys("Anushka");
			Thread.sleep(3000);
			oBrowser.findElement(objmap.getLocator("createcustomerbutton")).click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void DeleteCustomer()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("editbutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("action")).click();
			oBrowser.findElement(objmap.getLocator("deletebutton")).click();
		
			oBrowser.findElement(objmap.getLocator("deleteconfirmation")).click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void CreateProject()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("tasksbutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("addnew")).click();
			oBrowser.findElement(objmap.getLocator("NewProject")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("ProjectName")).sendKeys("Awanti royal weddings");
			oBrowser.findElement(objmap.getLocator("CreateProject")).click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void DeleteProject()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("editbuttonforPrpject")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objmap.getLocator("actionbuttonforproject")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objmap.getLocator("deletebuttonforproject")).click();
			Thread.sleep(3000);
		
			oBrowser.findElement(objmap.getLocator("deletePeramProject")).click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("homepagelogout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}


public class Assign03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CrProject.launchBrowser();
		CrProject.navigate();
		CrProject.login();
		CrProject.minimizeFlyOutWindow();
		CrProject.CreateCustomer();
		CrProject.CreateProject();
		CrProject.DeleteProject();
		CrProject.DeleteCustomer();
		CrProject.logout();
		CrProject.closeApplication();


	}

}
