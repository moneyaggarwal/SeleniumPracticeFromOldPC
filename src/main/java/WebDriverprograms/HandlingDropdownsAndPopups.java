package WebDriverprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropdownsAndPopups {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.facebook.com/");
	     
	     //go to dropdown and select date as oct-9-1990
	     WebElement month=driver.findElement(By.id("month"));
	     WebElement day=driver.findElement(By.id("day"));
	     WebElement year=driver.findElement(By.id("year"));
	     Select selectmonth=new Select(month);
	     selectmonth.selectByVisibleText("Oct");
	     
	     //select by index for day
	     Select selectday=new Select(day);
	     selectday.selectByIndex(9);
	     
	     //select by value for year
	     Select selectyear=new Select(year);
	     selectyear.selectByValue("1990");
	     
	     //getting total values in a dropdown
	     List<WebElement> months=selectmonth.getOptions();
	     //printing all values in dropdown
	     for (int i = 0; i < months.size(); i++) {
	    	 System.out.println(months.get(i).getText());
		}
	     
	     //selecting value from dropdown w/oselect class
	     
	     /*List<WebElement> monthvalues=driver.findElements(By.xpath("//*[@id='month']/option"));
	     for (int i = 0; i < monthvalues.size(); i++) {
	    	 String value=monthvalues.get(i).getText();
	    	 if(value.equals("Oct"))
	    	 {
	    		 monthvalues.get(i).click();
	    	 }
	    	 }*/
			
		}
	}


