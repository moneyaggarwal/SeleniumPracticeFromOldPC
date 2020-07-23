package WebDriverprograms;

import java.util.List;
import java.util.Arrays;

import org.hamcrest.core.IsNot;
import org.jsoup.select.Evaluator.IsEmpty;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AllLocators {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	     //this opens chrome
	     WebDriver driver=new ChromeDriver();
	     //maximize window
	     driver.manage().window().maximize();
	     //open google
	     /*driver.get("https://www.surveymonkey.com/user/sign-in/?ut_source=megamenu");
	     String text=driver.findElement(By.id("username")).getText();
	     //no text in this tag so it will not display anything
	     System.out.println(text);
	     //copy id from html dom as it is.it is case sensitive
	     //enetring values in usernamne and password
	     driver.findElement(By.id("username")).sendKeys("SeleniumTraining1");
	     driver.findElement(By.id("password")).sendKeys("Selenium1234");
	     //clicking on login button
	   //  xpath for login button *[@id="sign_in_form"]/fieldset/div/div[5]/button
	    // driver.findElement(By.xpath("//*[@id='sign_in_form']/fieldset/div/div[5]/button")).click();
	     //or by class name
	     //driver.findElement(By.className("wds-button--arrow-right")).click();
	     //by css selector

	     driver.findElement(By.cssSelector("#sign_in_form > fieldset > div > div:nth-child(5) > button")).click();
	     */
	     //handling links
	     //go to survey monkey.com, find login,click and get text, find links on page
	    
	     
	     
	     
	     driver.get("https://www.surveymonkey.com/");
	     
	     //finding login button
	    // driver.findElement(By.linkText("LOG IN")).click();
	     driver.findElement(By.cssSelector("#hd > div > div > ol > li:nth-child(1) > a")).click();
	     WebElement username=driver.findElement(By.id("username"));
	     WebElement password=driver.findElement(By.id("password"));
	     username.sendKeys("SeleniumTraining1");
	     password.sendKeys("selenium1213");
	     System.out.println(password.getText());
	     System.out.println(username.getSize());
	     //getattribute to get runtime enetred values
	     System.out.println(username.getAttribute("value"));
	     
	     driver.navigate().back();
	     //find links avaialable
	      List<WebElement> links=driver.findElements(By.tagName("a"));
	      System.out.println("number of links available" +links.size());
	      for (int i = 0; i < links.size(); i++) {
	    	  //we can use trim and equals but it will also print empty texts
	    	  //if(!((links.get(i).getText()).trim()).equals(null))
	    	  String linkname1=links.get(i).getText();
	    	 if (!(linkname1.isEmpty())) {
	    		 System.out.println(links.get(i).getText());
	    	  //System.out.println(links.get(i).getAttribute("value"));
	    	  
	    	 } 
		
	    	
	      }
}
}
