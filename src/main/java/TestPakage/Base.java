package TestPakage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;
	
	public WebDriver intializedriver() throws IOException
	{
		Properties pop=new Properties();
		FileInputStream fi=new FileInputStream("C:\\Users\\gopal\\eclipse-workspace\\SiteTest\\src\\main\\java\\Resources\\data.properties");
				pop.load(fi);
				pop.getProperty("browser");
				//System.out.println(pop.getProperty("browser"));
				System.setProperty("webdriver.chrome.driver","C://Users//gopal//Downloads//chromedriver_win32nn//chromedriver.exe");
			driver=new ChromeDriver();

		       return driver;
	
	}

}