package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base {
	static public WebDriver driver;
	
	public Base() {
        try {
            if (driver == null) {
                System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Amaya\\Documents\\chrome\\chromedriver_win32\\chromedriver.exe");
                driver = new ChromeDriver();
                driver.get("https://moments.pastbook.com/");
                driver.manage().window().maximize() ;
                driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
            }

        } catch (Exception e) {
            System.out.println("Chrome Driver failed to load");
        }
    }
}
