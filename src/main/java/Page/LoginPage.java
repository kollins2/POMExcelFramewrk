package Page;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;

	public class LoginPage {

		WebDriver driver;

		/*public LoginPage() {
		}*/

		public LoginPage(WebDriver driver) {
			this.driver = driver;
		}

		// Element Library
		@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]")
		WebElement USERNAME_ELEMENT;
		@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
		WebElement PASSWORD_ELEMENT;
		@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button")
		WebElement SIGNIN_BUTTON_ELEMENT;

		public void insertUserName(String userName) {
			USERNAME_ELEMENT.sendKeys(userName);
		}

		public void insertPassword(String password) {
			PASSWORD_ELEMENT.sendKeys(password);
		}

		public void clickOnSignInButton() {
			SIGNIN_BUTTON_ELEMENT.click();
		}

		/*
		 * public void loginTest(String userName, String password) {
		 * USERNAME_ELEMENT.sendKeys(userName); PASSWORD_ELEMENT.sendKeys(password);
		 * SIGNIN_BUTTON_ELEMENT.click(); }
		 */

	

	


	}


