package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Page.DashboardPage;
import Page.LoginPage;
import Page.addCustomerPage;
import util.Browserfactory;
import util.ExcelReader;


public class addCustomerTest {
	WebDriver driver;

	ExcelReader exlread = new ExcelReader("TestData\\SelemiunExcel.xlsx");
	String username = exlread.getCellData("Loginimfo", "UserName", 2);
	String password = exlread.getCellData("Loginimfo", "PassWord", 2);
	String fullname = exlread.getCellData("addContachinfo", "FullName", 2);
	String company = exlread.getCellData("addContachinfo", "CompanyName", 2);
	String email = exlread.getCellData("addContachinfo", "Email", 2);
	String phone = exlread.getCellData("addContachinfo", "Phone", 2);
	String address = exlread.getCellData("addContachinfo", "Address", 2);
	String city = exlread.getCellData("addContachinfo", "City", 2);
	String zip = exlread.getCellData("addContachinfo", "Zip", 2);
	String Country = exlread.getCellData("addContachinfo", "Country", 2);
	String region = exlread.getCellData("addContachinfo", "State", 2);

//	String group = "56648";
//	String password2 = "abc123456";
//	String repassword2 = "abc123456";

//	  /	By creating an Object
//		By the name of the Class

	
	public void validUserShouldBeAbleToAddCustomer() {

		driver = Browserfactory.init();
		

		// LoginPage loginPage1 = new LoginPage();
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName(username);
		loginPage.insertPassword(password);
		loginPage.clickOnSignInButton();

		DashboardPage dashboard = PageFactory.initElements(driver, DashboardPage.class);
		dashboard.verifyDashboardPage();
		dashboard.clickcustomerelemet();
		dashboard.clickaddcustomerelement();

		addCustomerPage AddCustomerPage = PageFactory.initElements(driver, addCustomerPage.class);
		AddCustomerPage.insertFullName(fullname);
		AddCustomerPage.selectCompany("company");
		AddCustomerPage.insertEmailElement(email);
		AddCustomerPage.selectCounrty("Country");
		AddCustomerPage.insertPhoneNumber(phone);
		AddCustomerPage.insertAddress(address);
		AddCustomerPage.insertCity(city);
		AddCustomerPage.insertZipCode(zip);
	//	AddCustomerPage.insertPassWord2(password2);
	//	AddCustomerPage.insertRePassWord2(repassword2);
		AddCustomerPage.clickSubmitButton();
		AddCustomerPage.verifyProfilePage();

		dashboard.ClickAddCustomerButton();
		AddCustomerPage.verifyEnteredNameAndDelete();

		// Browserfactory.tearDown();
	}
}

