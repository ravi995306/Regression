package TestBase;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConfigFileReader {
	
	public static Properties properties;
	public static WebDriver driver;
	public String getReportConfigPath(){
		String reportConfigPath = properties.getProperty("/regressionfolder/src/main/java/config/extent-config.xml");
		if(reportConfigPath!= null) return reportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		
	}
	
//	public static void initialization(){
//		String browserName = properties.getProperty("browser");
//		
//		if(browserName.equals("chrome")){
//			System.setProperty("webdriver.chrome.driver", "/regressionfolder/Driver");	
//			driver = new ChromeDriver(); 
//		}
//		else if(browserName.equals("FF")){
//			System.setProperty("webdriver.gecko.driver", "/Users/naveenkhunteta/Documents/SeleniumServer/geckodriver");	
//			driver = new FirefoxDriver(); 
//		}
		
	
}
