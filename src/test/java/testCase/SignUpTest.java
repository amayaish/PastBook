package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import common.Base;
import locators.AlertPage;
import locators.LeftMenuPage;
import locators.SignUpPage;

public class SignUpTest extends Base {
	
	 SignUpPage signUpPage;
	 LeftMenuPage leftMenuPage;
	 AlertPage alertPage;

	@Test
	public void signUpWithNewEmail () throws InterruptedException {
		leftMenuPage = new LeftMenuPage();
		signUpPage = new SignUpPage();
		alertPage = new AlertPage();
		
		// click Sign in option from side menu
		leftMenuPage.clickSideMenuItem("Sign in");
		
		// sign up with new email
		signUpPage.signUp("test20@gmail.com");
		Thread.sleep(10000);
		
		//click Profile option from side menu
		leftMenuPage.clickSideMenuItem("Profile");
		
		// Change password
		signUpPage.changePassword("password@123");
		Thread.sleep(5000);
		
		// Check alert result
		Assert.assertEquals(alertPage.getAlertContent(), "×\\nPassword updated!");
		alertPage.closeAlert();
    }
	
	@Test
	public void signInWithExistingEmail () throws InterruptedException {
		leftMenuPage = new LeftMenuPage();
		signUpPage = new SignUpPage();
		
		// click Sign in option from side menu
		leftMenuPage.clickSideMenuItem("Sign in");
		
		// sign in with email
		signUpPage.signIn("test20@gmail.com", "password@123");
		Thread.sleep(10000);
		
		// Check Sign out option is available
		Assert.assertEquals(leftMenuPage.isAvailableMenuItem("Sign out"), true);
    }
	
	@Test
	public void signOut () throws InterruptedException {
		leftMenuPage = new LeftMenuPage();
		signUpPage = new SignUpPage();
		
		// click Sign in option from side menu
		leftMenuPage.clickSideMenuItem("Sign in");
		
		// sign in with email
		signUpPage.signIn("test20@gmail.com", "password@123");
		Thread.sleep(10000);
		
		// Sign out
		leftMenuPage.clickSideMenuItem("Sign out");
		
		// Check Sign out option is available
		Assert.assertEquals(leftMenuPage.isAvailableMenuItem("Sign in"), true);
    }
}
