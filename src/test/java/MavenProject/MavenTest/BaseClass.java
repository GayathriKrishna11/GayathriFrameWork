package MavenProject.MavenTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static void launchChrome()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		

	}

	
	public static void getWindowHandle()
	{
		String ParentId = driver.getWindowHandle();
	}
	c 
}


--

Sting str="2A2B2C";
AABBCC


[12,10,9] == second max

String str1= "Gayathri";


