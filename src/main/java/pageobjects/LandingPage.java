package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	
	By searchfield=By.xpath("//div[@class='c-tag-picker__display form-control']");
	By digitaloption=By.cssSelector("button[value='digital']");
	By applyfilter=By.xpath("//input[@value='Apply Filters']");
	By crosstocloseresult=By.cssSelector("#Group-6");
	
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}


	public WebElement getsearchfield()
	{
		return driver.findElement(searchfield);
	}
	
	public WebElement selectdigitaloption()
	{
		return driver.findElement(digitaloption);
	}
	
	public WebElement clickoncross()
	{
		return driver.findElement(crosstocloseresult);
	}
	
	public WebElement clickonapplyfilter()
	{
		return driver.findElement(applyfilter);
	}
}
