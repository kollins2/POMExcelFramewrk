package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page.DashboardPage;
import Page.LoginPage;
import util.Browserfactory;
import util.ExcelReader;

@Test
public class LoginTest {

	WebDriver driver;
	ExcelReader exlread = new ExcelReader("TestData\\SelemiunExcel.xlsx");
	String username = exlread.getCellData("Loginimfo", "UserName", 2);
	String password = exlread.getCellData("Loginimfo", "PassWord", 2);
 

	// By creating an Object
    //	By the name of the Class

	public void validUserShouldBeAbleToLoginTest() {

		driver = Browserfactory.init();
		// driver=Browserfactory.init();

//		LoginPage loginPage1 = new LoginPage();
		// Object Variable
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName(username);
		loginPage.insertPassword(password);
		loginPage.clickOnSignInButton();

		DashboardPage dashboard = PageFactory.initElements(driver, DashboardPage.class);
		dashboard.verifyDashboardPage();
		dashboard.clickcustomerelemet();
		dashboard.clickaddcustomerelement();

		// AddCustomerPage.clickaddcustomerelement();
		// Browserfactory.tearDown();
	}

}
