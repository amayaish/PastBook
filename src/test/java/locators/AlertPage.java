package locators;

import org.openqa.selenium.By;

import common.Base;

public class AlertPage extends Base {
	
	public String getAlertContent() {
		By alert = By.xpath("//div[contains(@class, 'alert')]");
        return driver.findElement(alert).getText();
	}
	
	public void closeAlert() {
			
	}
}
