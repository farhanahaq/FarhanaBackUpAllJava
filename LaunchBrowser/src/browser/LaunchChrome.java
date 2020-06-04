package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {
		
		//calling the chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\14693\\eclipse-workspace-2\\LaunchBrowser\\Drivers\\chromedriver.exe");
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\14693\\eclipse-workspace-2\\LaunchBrowser\\Drivers\\geckodriver.exe");
		//WebDriver d = new FirefoxDriver();
		//driver.get("http://www.google.com");
		//driver.quit();
		
		
		//creating object driver for class WebDriver of type ChromeDriver
		WebDriver d = new ChromeDriver();
		
		//making object d do stuffs using properties of WebDriver 
		d.get("https://www.selenium.dev/downloads/"); //getting a website
		d.manage().window().maximize(); //maximing it
		Thread.sleep(2000); //wait 2 sec
		d.close(); //closing it
		
	}

}
