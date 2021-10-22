package sg.testing.pageobjectmodel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class CreateDeleteuser
{
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "F:\\SaleniumAutomation\\Web_Automation\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
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
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLoginBtn().click();
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
			oPage.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void Createuser()
	{
		try
		{
			oPage.getclickonuserlist().click();
			Thread.sleep(2000);
			oPage.getadduser().click();
			Thread.sleep(2000);
			oPage.getfirstname().sendKeys("Virat");
			Thread.sleep(2000);
			oPage.getlastName().sendKeys("k");
			Thread.sleep(2000);
			oPage.getemail().sendKeys("Virat@gmail.comm");
			Thread.sleep(2000);
			oPage.getUserName().sendKeys("VK");
			Thread.sleep(2000);
			oPage.getpasswordinadduser().sendKeys("V18");
			Thread.sleep(2000);
			oPage.getpasswordCopyinAdduser().sendKeys("V18");
			Thread.sleep(2000);
			oPage.getclickonCreateuser().click();
			Thread.sleep(2000);
		
		}catch(Exception e)
			
		{
			e.printStackTrace();
		}
	}
	static void Deleteuser()
	{
		try
		{
			oPage.getclickonuserlist().click();
			Thread.sleep(3000);
			oPage.getclickonusertodelete().click();
			Thread.sleep(3000);
			oPage.getCLICKONDELETEUSERU1().click();
			Thread.sleep(4000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(3000);;
		
		}catch(Exception e)
			
		{
			e.printStackTrace();
		}
	}
	
	
	
	static void logout()
	{
		try
		{
			oPage.getlogout().click();
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

public class Assign01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateDeleteuser.launchBrowser();
		CreateDeleteuser.navigate();
		CreateDeleteuser.login();
		CreateDeleteuser.minimizeFlyOutWindow();
		CreateDeleteuser.Createuser();
		CreateDeleteuser.Deleteuser();
		CreateDeleteuser.logout();
		CreateDeleteuser.closeApplication();
		
	}

}
