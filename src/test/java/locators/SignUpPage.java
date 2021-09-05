package locators;

import java.util.Set;

import org.openqa.selenium.By;

import common.Base;

public class SignUpPage extends Base {
	
	public void signUp(String email) throws InterruptedException {
		String currentWindow = driver.getWindowHandle();
		this.switchWindow("PastBook - Connect");
		Thread.sleep(3000);
		this.clickLink("or use email »");
		this.setInputByName("email", email);
		Thread.sleep(2000);
		this.clickSubmit();
		Thread.sleep(3000);
		driver.switchTo().window(currentWindow);
	}
	
	public void changePassword(String password) throws InterruptedException {
		this.clickLink("Update your password »");
		Thread.sleep(5000);
		this.setInputByName("user[password]", password);
		this.setInputByName("user[passwordConfirm]", password);
		Thread.sleep(2000);
		this.clickButtonByContent("Save Password");
	}
	
	public void signIn(String email, String password) throws InterruptedException {
		String currentWindow = driver.getWindowHandle();
		this.switchWindow("PastBook - Connect");
		Thread.sleep(3000);
		this.clickLink("or use email »");
		this.setInputByName("email", email);
		this.clickSubmit();
		Thread.sleep(5000);
		this.setInputByName("password", password);
		Thread.sleep(2000);
		this.clickSubmit();
		Thread.sleep(3000);
		driver.switchTo().window(currentWindow);
	}
	
	public void clickLink(String content) {
		By link = By.xpath("//a[contains(text(),'"+ content +"')]");
        driver.findElement(link).click();
    }

	public void setInputByName(String name, String value) {
		By emailInput = By.name(name);
        driver.findElement(emailInput).sendKeys(value);
    }
	
	public void clickSubmit() {
		By emailInput = By.xpath("/html/body/div[6]/div/div/div[2]/form/div[2]/span/button");
        driver.findElement(emailInput).click();
    }
	
	public void clickButtonByContent(String content) {
		By btn = By.xpath("//button[contains(text(),'"+ content +"')]");
        driver.findElement(btn).click();
    }
	
	public void switchWindow(String title) {
		Set<String> windows = driver.getWindowHandles();
		for (String window : windows) 
		{ 
			driver.switchTo().window(window);
			if (driver.getTitle().contains(title)) 
			{
				return;
			}
		}
	}
}
