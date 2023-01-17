package Testcase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import TestPakage.Base;
import pageobjects.LandingPage;

public class HomePage extends Base {
	
	@Test
	public void basepagenavigation() throws IOException, InterruptedException
	{
		driver=intializedriver();
		Properties pop=new Properties();
		FileInputStream fi=new FileInputStream("C:\\Users\\gopal\\eclipse-workspace\\SiteTest\\src\\main\\java\\Resources\\data.properties");
				pop.load(fi);
			String homeurl=	pop.getProperty("url");
		driver.get(homeurl);
		driver.manage().window().maximize();
		LandingPage l=new LandingPage(driver);
		l.getsearchfield().click();         //click on searchfiled
		l.selectdigitaloption().click();	//select digital option 
		l.clickoncross().click();			//click on cross
		l.clickonapplyfilter().click();		//click on apply filter button
		Thread.sleep(20000);
		List<WebElement> items=driver.findElements(By.xpath("(//div[@class='casestudies-card card'])/div/h4")); //get the four filter blocks
		
		for(WebElement ll:items)
		{
			String linkname=ll.getText();
			System.out.println(linkname);  //it will display all filter four blocks names in console. you can verify from this tahat correct block will get filtered 
		}
		
	}

}
