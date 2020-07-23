package WebDriverprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingImages {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("http://www.amazon.ca");
	     //find number of images and get their links
	  List<WebElement> images=driver.findElements(By.tagName("img"));
	  System.out.println("number of images:" +images.size());
	  
	  for (int i = 0; i < images.size(); i++) {
		  String imagelink=images.get(i).getAttribute("src");
		  System.out.println(imagelink);
	  }
		  //move cursor over hello sign in using Actions class
	  //get xpath for hello sign in and get element in  target
		  
	Actions action=new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//*[@id='nav-link-accountList']/div/span"))).build().perform();
	  
	   //implicit wait
	Thread.sleep(5000);
	}

}
