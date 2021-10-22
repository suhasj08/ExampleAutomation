package sg.testing.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class loginlogoutchrome
{
	public static WebDriver obrowser=null;
	static void launchbrowser()
	{
		try {
			System.setProperty("webdriver.chrome.driver", "F:\\SaleniumAutomation\\Web_Automation\\drivers\\chromedriver.exe");
			obrowser=new ChromeDriver();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void navigate() 
	{
		try
		{
			obrowser.get("http://localhost:82/login.do");
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		static void Applicationclose()
		{
			try
			{
				obrowser.close();
			
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void login()
		{
			try
			{
				obrowser.findElement(By.id("username")).sendKeys("admin");
				obrowser.findElement(By.name("pwd")).sendKeys("manager");
				obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
				Thread.sleep(4000);
			
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void Minimize()
		{
			try
			{
				obrowser.findElement(By.id("gettingStartedShortcutsPanelId"));
				Thread.sleep(4000);
			
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void Logout()
		{
			try
			{
				obrowser.findElement(By.linkText("Logout")).click();
				Thread.sleep(4000);
			
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	
}
public abstract class Locators_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loginlogoutchrome.launchbrowser();
		loginlogoutchrome.navigate();
		loginlogoutchrome.login();
		loginlogoutchrome.Minimize();
		loginlogoutchrome.Logout();
	
	}

}

