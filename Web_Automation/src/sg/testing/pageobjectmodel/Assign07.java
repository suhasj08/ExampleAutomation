package sg.testing.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class CreateTask
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
	static void createcustomer()
	{
		try
		{
			
			oPage.getclickoncustomertaskbutton().click();
			Thread.sleep(2000);
			oPage.getclickonADDnewforCustomer().click();
			Thread.sleep(2000);
			oPage.getclickonNewCustomer().click();
			Thread.sleep(2000);					
			oPage.getCustomerName().sendKeys("Wipro");
			Thread.sleep(2000);
			oPage.getclickCreateCustomButton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void projectcreate()
	{
		try
		{
			oPage.getclickOnNewbotton().click();
			Thread.sleep(2000);
			oPage.getclickOnNewProject().click();
			Thread.sleep(2000);
			oPage.getNewProjectName().sendKeys("Student data");
			Thread.sleep(2000);
			oPage.getclickCreateProjToCreate().click();
			Thread.sleep(2000);	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		
		static void Taskcreate()
		{
			try
			{
				oPage.getclickToAddNEwTASK().click();
				Thread.sleep(2000);
				oPage.getclickToCreateNewTask().click();
				Thread.sleep(2000);
				oPage.getNewNAmeOfTask().sendKeys("Student");
				Thread.sleep(2000);
				oPage.getclickonCreateTaskButtonFinally().click();
				Thread.sleep(2000);
				
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	
	
	static void deletecustomer()
	{
		try
		{
			oPage.getclickToeditbuttonForCustom().click();
			Thread.sleep(2000);
			oPage.getclickOnActionForCustomer().click();
			Thread.sleep(2000);
			oPage.getclickOnDeleteForCustomer().click();
			Thread.sleep(2000);
			oPage.getClickOnDeletePermaForCustom().click();
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

public class Assign07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateTask.launchBrowser();
		CreateTask.navigate();
		CreateTask.login();
		CreateTask.minimizeFlyOutWindow();
		CreateTask.createcustomer();
		CreateTask.projectcreate();
		CreateTask.Taskcreate();
		CreateTask.deletecustomer();
		CreateTask.logout();
		CreateTask.closeApplication();

	}

}
