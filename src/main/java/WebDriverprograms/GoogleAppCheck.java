package WebDriverprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleAppCheck {

	public static void main(String[] args) {
		try {
		WebDriverManager.chromedriver().setup();
		//opens chrome
		WebDriver driver=new ChromeDriver();
		
		//maximize to full screen
		driver.manage().window().maximize();
		//opens google
		driver.get("http://www.google.ca");
		//recieves title in variable
		String appTitle=driver.getTitle();
		System.out.println("App title is:" +appTitle);
		//verify expected result with actual
		if (appTitle.equalsIgnoreCase("google")) {
			
			System.out.println("Test pass");
		} else {
			System.out.println("Test fail");
		}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		//closes chrome
		//driver.close();

	}

}
