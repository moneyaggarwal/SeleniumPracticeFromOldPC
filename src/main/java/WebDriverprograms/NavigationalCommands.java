package WebDriverprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationalCommands {

	public static void main(String[] args) {
// this will take care of driver binaries
     WebDriverManager.chromedriver().setup();
     //this opens chrome
     WebDriver driver=new ChromeDriver();
     //maximize window
     driver.manage().window().maximize();
     //open google
     driver.get("http://www.google.com");
     //capture title and print it
     System.out.println("app title is :"+driver.getTitle());
     //open fb in same browser
     driver.get("http://www.facebook.com");
     System.out.println("new app title is :"+driver.getTitle());
     driver.navigate().back();
     System.out.println("now app title is :"+driver.getTitle());
     driver.navigate().forward();
     System.out.println("now app title is :"+driver.getTitle());
     driver.navigate().to("http://www.yahoo.com");
     System.out.println("now app title is :"+driver.getTitle());
     driver.close();
	}

}
