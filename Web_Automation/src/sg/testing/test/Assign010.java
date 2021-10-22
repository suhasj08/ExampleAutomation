package sg.testing.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Multiuserss
{
	public static WebDriver oBrowser = null;
	static void launch()
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
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void login()
	{
		try
		{
	
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(4000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(4000);
			oBrowser.findElement(By.id("loginButton")).click();
			Thread.sleep(4000);
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
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
			

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void creuser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("user111");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("lastName")).sendKeys("suhas");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("email")).sendKeys("suhas@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("username")).sendKeys("user1");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("12345");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("12345");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		
	static void Logoutmain()
	 {
		try
		   {
			   oBrowser.findElement(By.id("logoutLink")).click();
				Thread.sleep(2000);
					
			}catch(Exception e)
			 {
				e.printStackTrace();
			}
		}
	
	static void loginas1()
	{
		try
		{
	
			oBrowser.findElement(By.id("username")).sendKeys("user1");
			Thread.sleep(4000);
			oBrowser.findElement(By.name("pwd")).sendKeys("12345");
			Thread.sleep(4000);
			oBrowser.findElement(By.id("loginButton")).click();
			Thread.sleep(4000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void creuser2()
	{
		try
		{
			
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("user22");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("lastName")).sendKeys("Virat");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("email")).sendKeys("Virat@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("username")).sendKeys("user2");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("123");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("123");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginas2()
	{
		try
		{
	
			oBrowser.findElement(By.id("username")).sendKeys("user2");
			Thread.sleep(4000);
			oBrowser.findElement(By.name("pwd")).sendKeys("123");
			Thread.sleep(4000);
			oBrowser.findElement(By.id("loginButton")).click();
			Thread.sleep(4000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void Logout2()
	 {
		try
		   {
			   oBrowser.findElement(By.id("logoutLink")).click();
				Thread.sleep(2000);
					
			}catch(Exception e)
			 {
				e.printStackTrace();
			}
		}
	
	
	static void creuser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("user33");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("lastName")).sendKeys("Rohit");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("email")).sendKeys("Rohit@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("username")).sendKeys("user3");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("122");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("122");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void loginas3()
	{
		try
		{
	
			oBrowser.findElement(By.id("username")).sendKeys("user3");
			Thread.sleep(4000);
			oBrowser.findElement(By.name("pwd")).sendKeys("122");
			Thread.sleep(4000);
			oBrowser.findElement(By.id("loginButton")).click();
			Thread.sleep(4000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void Logout3()
	 {
		try
		   {
			   oBrowser.findElement(By.id("logoutLink")).click();
				Thread.sleep(2000);
					
			}catch(Exception e)
			 {
				e.printStackTrace();
			}
		}
	
}

public class Assign010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Multiuserss.launch();
		 Multiuserss.navigate();
		 Multiuserss.login();
		 Multiuserss.minimize();
		 Multiuserss.creuser1();
		 Multiuserss.Logoutmain();
		 Multiuserss.loginas1();
		 Multiuserss.creuser2();
		 Multiuserss.Logout2();
		 Multiuserss.loginas2();
		 Multiuserss.creuser3();
		 Multiuserss.Logout3();
		 Multiuserss.loginas3();		
		 Multiuserss.Logout3();
	}

}
