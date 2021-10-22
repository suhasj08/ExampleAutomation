package sg.testing.test.objectmap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class LoginLogoutOM
{
	public static String filename="F:\\SaleniumAutomation\\Web_Automation\\src\\sg\\testing\\test\\objectmap.properties";
	public static ObjectMap objmap=new ObjectMap(filename);
	public static WebDriver oBrowser=null;
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "F:\\SaleniumAutomation\\Web_Automation\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		
		}catch(Exception e)
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
	
	static void creatreuser()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("userimage")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("adduserbutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("firstnametextfield")).sendKeys("virat");
			oBrowser.findElement(objmap.getLocator("lastnametextfield")).sendKeys("k");
			oBrowser.findElement(objmap.getLocator("emailtextfield")).sendKeys("virat@gmail.com");
			oBrowser.findElement(objmap.getLocator("usernametextfield")).sendKeys("VK");
			oBrowser.findElement(objmap.getLocator("passwordtextfield")).sendKeys("v18");
			oBrowser.findElement(objmap.getLocator("retypepasswordtextfield")).sendKeys("v18");
			oBrowser.findElement(objmap.getLocator("createuserbutton")).click();
			Thread.sleep(4000);
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
}
public class demo1 {
	public static void main(String[] args) {
		LoginLogoutOM.launchBrowser();
		LoginLogoutOM.navigate();
		LoginLogoutOM.login();
		LoginLogoutOM.minimizeFlyOutWindow();
		 LoginLogoutOM.creatreuser();
		LoginLogoutOM.logout();
		LoginLogoutOM.closeApplication();

	}
}



