package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class DashboardPage {

	WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[2]/div/h2")
	WebElement DASHBOAR_HEADERE_ELEMENT;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Customers')]")
	WebElement CUSTOMER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Add Customer')]")
	WebElement ADDCUSTOMER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'List Customers')]")
	WebElement LIST_CUSTOMER_BUTTON_ELEMENT;

	public void verifyDashboardPage() {

		Assert.assertEquals(DASHBOAR_HEADERE_ELEMENT.getText(), "Dashboard", "Wrong Page!!!");
	}

	public void clickcustomerelemet() {
	
	Assert.assertEquals(CUSTOMER_ELEMENT.getText(), "Customers", "Wrong Page !!!");	
   
   CUSTOMER_ELEMENT.click();

	}

	public void clickaddcustomerelement() {
		// WebDriverWait wait3= new
		// WebDriverWait(driver,10);/wait3.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//a[contains(text(),'Add
		// Customer')]")));

		ADDCUSTOMER_ELEMENT.click();

	}

	public void ClickAddCustomerButton() {
		LIST_CUSTOMER_BUTTON_ELEMENT.click();

	}

}