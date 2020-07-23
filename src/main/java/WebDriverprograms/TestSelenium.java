package WebDriverprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSelenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	     //this opens chrome
	     WebDriver driver=new ChromeDriver();
	     //maximize window
	     driver.manage().window().maximize();
	     //open google
	     /*driver.get("https://www.facebook.com/");
	     WebElement element=driver.findElement(By.id("year"));
	     WebElement day=driver.findElement(By.id("day"));
	     WebElement signup=driver.findElement(By.xpath("//*[@id=\'u_0_12\']"));
	     CommonUtils cu=new CommonUtils();
	     cu.fnToCaptureAllElementsOfDropdown(element);
	     cu.fnToSelectValuesFromDropdownByValue(day,"9");
	     Thread.sleep(3000);
	     cu.fnToHoverMouse(signup, driver);
	     Thread.sleep(3000);*/
	     driver.get("https://www.amazon.ca");
	     WebElement element=driver.findElement(By.xpath("//*[@id=\'icp-nav-flyout\']/span/span[1]"));
	     CommonUtils cu=new CommonUtils();
	     cu.fnToHoverMouse(element, driver);
	     

	}

}
