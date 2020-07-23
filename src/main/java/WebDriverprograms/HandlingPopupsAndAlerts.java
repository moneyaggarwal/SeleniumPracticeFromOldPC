package WebDriverprograms;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingPopupsAndAlerts {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("http://www.popuptest.com/goodpopups.html");
	     
	     //how close() works and position of current cursor
	     /*driver.findElement(By.linkText("Good PopUp #3")).click();
	     System.out.println(driver.getTitle());
	     driver.close();*/
	     
	     //WINDOW HANDLES
	     driver.findElement(By.linkText("Good PopUp #3")).click();
	     Set<String> winid=driver.getWindowHandles();
	     Iterator<String> itr=winid.iterator();
	     String primary=itr.next();
	     String secondary=itr.next();
	     System.out.println(primary+secondary);
	     driver.switchTo().window(secondary);
	     System.out.println(driver.getTitle());
	     
	     

	}

}
