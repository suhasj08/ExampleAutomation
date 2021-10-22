package sg.testing.pageobjectmodel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class cruser
{
	public static WebDriver oBrowser = null;
	public static ActiTimePage oPage= null;
	static void launch()
	{
		try
		{
		System.setProperty("webdriver.chrome.driver", "F:\\SaleniumAutomation\\Web_Automation\\drivers\\chromedriver.exe");
		oBrowser=new ChromeDriver();
		oPage = new ActiTimePage(oBrowser);
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
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			Thread.sleep(3000);
			oPage.getPassword().sendKeys("manager");
			Thread.sleep(3000);
			oPage.getLoginBtn().click();
			Thread.sleep(3000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void minimize()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(3000);

		}
		catch(Exception e)
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
			oPage.getfirstname().sendKeys("u1");
			Thread.sleep(2000);
			oPage.getlastName().sendKeys("awanti");
			Thread.sleep(2000);
			oPage.getemail().sendKeys("awantidhanu@gmail.com");
			Thread.sleep(2000);
			oPage.getuserusernameInAdduser().sendKeys("u1");
			Thread.sleep(2000);
			oPage.getpasswordinadduser().sendKeys("1");
			Thread.sleep(2000);
			oPage.getpasswordCopyinAdduser().sendKeys("1");
			Thread.sleep(2000);
			oPage.getclickonCreateuser().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deletecustomer()
	{
		try
		{
			oPage.getclickonusertodelete().click();
			Thread.sleep(2000);
			oPage.getCLICKONDELETEUSERU1().click();
			Thread.sleep(4000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	static void logout()
	{
		try
		{
			oPage.getlogout().click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void close()
	{
		try
		{
			oBrowser.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}


public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cruser.launch();
		cruser.navigate();
		cruser.login();
		cruser.minimize();
		cruser.Createuser();
		cruser.deletecustomer();
		cruser.logout();
		cruser.close();


	}

}
