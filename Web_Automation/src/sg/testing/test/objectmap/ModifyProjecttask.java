package sg.testing.test.objectmap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class ModifyProject 
{
	public static String filename="F:\\SaleniumAutomation\\Web_Automation\\Object Map\\objectmap.properties";
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
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("createcustomer")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("Customername")).sendKeys("TCS");
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("createcustomerbutton")).click();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void modifyCustomer()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("editbutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("Description")).sendKeys("It is good company");
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("closebutton")).click();
			Thread.sleep(3000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void Project()
	{
		try
		{
			//oBrowser.findElement(objmap.getLocator("Tasks")).click();
			//Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("Addnew")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("NewProject")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objmap.getLocator("ProjectName")).sendKeys("Employee data");
			Thread.sleep(3000);
			oBrowser.findElement(objmap.getLocator("Description")).sendKeys("It is good company");
			Thread.sleep(3000);		
			oBrowser.findElement(objmap.getLocator("createproject")).click();
			Thread.sleep(3000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
	
	static void ProjectModify()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("editbotton")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objmap.getLocator("ModifyDescription")).sendKeys("It have number of projects");
			Thread.sleep(3000);		
			oBrowser.findElement(objmap.getLocator("close")).click();
			Thread.sleep(3000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
	
	static void createtask()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("addnewtask")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objmap.getLocator("Createnewtask")).click();
			Thread.sleep(3000);
			
			oBrowser.findElement(objmap.getLocator("taskname1")).sendKeys("Student1");
			Thread.sleep(3000);
			oBrowser.findElement(objmap.getLocator("taskname2")).sendKeys("Student2");
			Thread.sleep(3000);
			oBrowser.findElement(objmap.getLocator("taskname3")).sendKeys("Student3");
			Thread.sleep(3000);
			oBrowser.findElement(objmap.getLocator("taskname4")).sendKeys("Student4");
			Thread.sleep(3000);
			oBrowser.findElement(objmap.getLocator("taskname5")).sendKeys("Student5");			
			Thread.sleep(3000);
			oBrowser.findElement(objmap.getLocator("createtask")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void Deletetask()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("DeleteTaskbutton")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objmap.getLocator("delbutton")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objmap.getLocator("deletetaskparamanently")).click();
			Thread.sleep(3000);						
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void Deletecustomer()
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

public class ModifyProjecttask  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ModifyProject.launchBrowser();
		ModifyProject.navigate();
		ModifyProject.login();
		ModifyProject.minimizeFlyOutWindow();
		ModifyProject.CreateCustomer();
		ModifyProject.Project();
		ModifyProject.ProjectModify();
        ModifyProject.createtask();
        ModifyProject.Deletetask();
        ModifyProject.Deletecustomer();
        ModifyProject.logout();
        ModifyProject.closeApplication();

		
	}

}
