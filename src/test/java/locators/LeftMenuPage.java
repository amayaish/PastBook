package locators;

import org.openqa.selenium.By;

import common.Base;

public class LeftMenuPage extends Base {
	public void openCloseSideMenu() {
		By sideMenuBtn = By.xpath("//span[@class = 'icon-hamburger-animated']/..");
        driver.findElement(sideMenuBtn).click();
    }
	
	public void clickSideMenuItem(String itemContent) throws InterruptedException {
		this.openCloseSideMenu();
		Thread.sleep(10000);
		By sideMenuItem = By.xpath("//div[@class = 'sidemenu-items']//a[contains(text(),'"+ itemContent +"')]");
		driver.findElement(sideMenuItem).click();
    }
	
	public boolean isAvailableMenuItem(String itemContent) throws InterruptedException {
		this.openCloseSideMenu();
		Thread.sleep(10000);
		By sideMenuItem = By.xpath("//div[@class = 'sidemenu-items']//a[contains(text(),'"+ itemContent +"')]");
		if( driver.findElement(sideMenuItem).isDisplayed()){
			System.out.println("Menu Item '"+ itemContent +"' is Visible");
			return true;
		}else{
			System.out.println("Menu Item '"+ itemContent +"' is not Visible");
			return false;
		}
    }
}
