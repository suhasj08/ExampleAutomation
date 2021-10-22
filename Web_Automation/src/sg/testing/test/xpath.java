package sg.testing.test;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class xpath {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchBrowser();
		navigate();
	 //  absoluteXPathDemo();
	  // relativeXPathUsingTagNameAlone();
		//relativeXPathUsingTagNameWithIndex();
		relativeXPathUsingTagNameWithAttributeNameAndValue();

	}
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
			oBrowser.get("file:///F:/S%20G/selenium/07_OCT_2021_XPath_Day1/Sample.html");
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void absoluteXPathDemo()
	{
		oBrowser.findElement(By.xpath("html/body/div/form/input")).sendKeys("DemoUser1");
		oBrowser.findElement(By.xpath("//*[@id=\'pwd1pass1word1\']")).sendKeys("123");
		//oBrowser.findElement(By.xpath(" //*[@id=\'btn1submit1button1\']")).click();
	}
	static void relativeXPathUsingTagNameAlone()
	{
		oBrowser.findElement(By.xpath("//input")).sendKeys("DemoUser1");
		oBrowser.findElement(By.xpath("//*[@id=\'pwd1pass1word1\']")).sendKeys("123");
		oBrowser.findElement(By.xpath("//a[2]")).click();		
	}
		
	static void relativeXPathUsingTagNameWithIndex()
	{
		oBrowser.findElement(By.xpath("//input[2]")).sendKeys("DemoUser1");
	}
	static void relativeXPathUsingTagNameWithAttributeNameAndValue()
	{
		oBrowser.findElement(By.xpath("//input[@class='pass1word1']")).sendKeys("DemoUser123");
	}
}
