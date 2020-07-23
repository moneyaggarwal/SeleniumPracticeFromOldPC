package WebDriverprograms;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CommonUtils {
	public void fnToSelectValuesFromDropdownByValue(WebElement element,String value)
	{
		Select select=new Select(element);
		select.selectByValue(value);
		
	}
	public ArrayList fnToCaptureAllElementsOfDropdown(WebElement element)
	{
		Select select=new Select(element);
		List<WebElement> list=select.getOptions();
		ArrayList<String> al=new ArrayList();
		for (int i = 0; i < list.size(); i++) {
			al.add(list.get(i).getText());
			
		}
		return al;
			
		}
		
	
public void fnToHoverMouse(WebElement element,WebDriver driver)
{
	Actions action=new Actions(driver);
	action.moveToElement(element).perform();
}


}