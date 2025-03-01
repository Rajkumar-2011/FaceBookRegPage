package PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;
import UtilityLayer.HandlesDropDown;
import UtilityLayer.WebElementsUtils;

public class LoginPage extends BaseClass{
	public void createAccount(String Fname,String Lname,String Date,String month,
			String year) {
		
		WebElement Firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElementsUtils.sendKeys(Firstname, Fname);
		
		WebElement Lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
		WebElementsUtils.sendKeys(Lastname, Lname);
		
		WebElement dt=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		HandlesDropDown.selectByVisibleText(dt, Date);
			
		WebElement mon=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		HandlesDropDown.selectByVisibleText(mon, month);
		
		WebElement yr=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		HandlesDropDown.selectByVisibleText(yr, year);
		
		WebElement pass=driver.findElement(By.xpath(""));
	
		
		
	}
	}


