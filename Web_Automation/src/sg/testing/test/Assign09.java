package sg.testing.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class MultiUsers
{
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
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
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
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void Createusers1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Suhas");
			oBrowser.findElement(By.name("lastName")).sendKeys("J");
			oBrowser.findElement(By.name("email")).sendKeys("SUhas@125");
			oBrowser.findElement(By.name("username")).sendKeys("Suhasj");
			oBrowser.findElement(By.name("password")).sendKeys("s88");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("s88");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(4000);
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void Createusers2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.name("firstName")).sendKeys("ABD");
			oBrowser.findElement(By.name("lastName")).sendKeys("V");
			oBrowser.findElement(By.name("email")).sendKeys("ABD@125");
			oBrowser.findElement(By.name("username")).sendKeys("Ab");
			oBrowser.findElement(By.name("password")).sendKeys("A17");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("A17");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(4000);
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void Createusers3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.name("firstName")).sendKeys("Ramana");
			oBrowser.findElement(By.name("lastName")).sendKeys("R");
			oBrowser.findElement(By.name("email")).sendKeys("Ramana@111");
			oBrowser.findElement(By.name("username")).sendKeys("Raman");
			oBrowser.findElement(By.name("password")).sendKeys("R111");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("R111");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
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
			Thread.sleep(2000);
			oBrowser.findElement(By.id("logoutLink")).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}


 static void login1()
 {
	try
	{
		oBrowser.findElement(By.id("username")).sendKeys("Suhasj");
		oBrowser.findElement(By.name("pwd")).sendKeys("s88");
		Thread.sleep(3000);
		oBrowser.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
		Thread.sleep(3000);
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
 }
 static void Logoutu1()
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
 static void login2()
 {
	try
	{
		oBrowser.findElement(By.id("username")).sendKeys("Ab");
		oBrowser.findElement(By.name("pwd")).sendKeys("A17");
		Thread.sleep(3000);
		oBrowser.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
		Thread.sleep(3000);
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
 }
 
 static void Logoutu2()
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
 static void login3()
 {
	try
	{
		oBrowser.findElement(By.id("username")).sendKeys("Raman");
		oBrowser.findElement(By.name("pwd")).sendKeys("R111");
		Thread.sleep(3000);
		oBrowser.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
		Thread.sleep(3000);

    }catch(Exception e)
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
 
 
 static void loginasadmin()
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
 static void modifiu1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath(" //span[text()='suhas, u1']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("111");
		
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("111");
			
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(5000);
			
			
			
     }catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modiu2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]")).click();
			Thread.sleep(2000);
          	oBrowser.findElement(By.xpath("//span[text()='ABD, u2']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("s8686");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("s8686");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void modiu3()
	{
		try
		{
			
			oBrowser.findElement(By.xpath(" //span[text()='Raman, u3']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("V18");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("V18");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(5000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutmain2()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e )
		{
			e.printStackTrace();
		}
	}
 
	static void Loginu2modyfy()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("u2");
			oBrowser.findElement(By.name("pwd")).sendKeys("s8686");
			Thread.sleep(4000);
			oBrowser.findElement(By.id("loginButton")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void Logoutu2modify()
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
	
	static void Loginu3modify()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("u3");
			oBrowser.findElement(By.name("pwd")).sendKeys("V18");
			Thread.sleep(4000);
			oBrowser.findElement(By.id("loginButton")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void Logoutu3modify()
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
	
	static void loginasadminthirdtime()
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
 
	static void Deletealluser()
	{
		try
		{
			oBrowser.findElement(By.xpath("  //*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]\r\n")).click();
			oBrowser.findElement(By.xpath("//span[text()='Suhas, u1']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
			
			
		}catch(Exception e )
		{
			e.printStackTrace();
		}
	}
 
 
}




public class Assign09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiUsers.launchBrowser();
		MultiUsers.navigate();
		MultiUsers.login();
		MultiUsers.minimizeFlyOutWindow();
		MultiUsers.Createusers1();
		MultiUsers.Createusers2();
		MultiUsers.Createusers3();
		MultiUsers.logout();
		MultiUsers.login1();
		MultiUsers.Logoutu1();
		MultiUsers.login2();
		MultiUsers.Logoutu2();
		MultiUsers.login3();
		MultiUsers.Logout3();
		MultiUsers.loginasadmin();
		MultiUsers.modifiu1();
		MultiUsers.modiu2();
		MultiUsers.modiu3();
		MultiUsers.logoutmain2();
		MultiUsers.Loginu2modyfy();
		MultiUsers.Logoutu2modify();
		MultiUsers.Loginu3modify();
		MultiUsers.Logoutu3modify();
		MultiUsers.loginasadminthirdtime();
		MultiUsers.loginasadminthirdtime();
		MultiUsers.Deletealluser();

	}

}
