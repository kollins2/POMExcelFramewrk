package Page;

//import java.util.Random;

///import javax.swing.Spring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class addCustomerPage extends Basepage {

	WebDriver driver;

	public addCustomerPage(WebDriver driver) {

		this.driver = driver;

		

	}

	@FindBy(how = How.XPATH, using = "//input[@name='account']")
	WebElement FULLMANE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//select[@name='cid']")
	WebElement COMPANY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id='email']")
	WebElement EMAIL_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"country\"]")
	WebElement COUNTRY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@name='phone']")
	WebElement PHONE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@name='address']")
	WebElement ADDRESS_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@name='city']")
	WebElement CITY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@name='state']")
	WebElement STATE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@name='zip']")
	WebElement ZIP_CODE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//select[@name='group']")
	WebElement GROUP_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement PASSWORD2_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@name='cpassword']")
	WebElement REPASSWORD2_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@id='submit']")
	WebElement SUBMIT_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"summary\"]")
	WebElement SUMMARY_ON_PROFILE_ELEMENT;
	
	
	
	String generatedName;
	public void insertFullName(String fullname) {
		 generatedName=fullname + generateRandomNo(999);
		
		FULLMANE_ELEMENT.sendKeys(generatedName);
//Random rdm= new Random();
//rdm.nextInt(999);
//generateRandomNo(999);
	}

	public void selectCompany(String company) {
//elect sel =new Select(COMPANY_ELEMENT);
//el.selectByVisibleText(company);

		selectFromDropDown(COMPANY_ELEMENT, company);
	}

	public void insertEmailElement(String email) {

		EMAIL_ELEMENT.sendKeys(generateRandomNo(9999) + email);

	}

	public void selectCounrty(String country) {

		selectFromDropDown(COUNTRY_ELEMENT, country);

	}

	public void insertPhoneNumber(String phone) {

		PHONE_ELEMENT.sendKeys(generateRandomNo(9999) + phone);

	}

	public void insertAddress(String address) {

		ADDRESS_ELEMENT.sendKeys(address);

	}

	public void insertCity(String city) {

		CITY_ELEMENT.sendKeys(city);

	}

	public void insertState(String state) {

		STATE_ELEMENT.sendKeys(state);

	}

	public void insertZipCode(String zipcode) {

		ZIP_CODE_ELEMENT.sendKeys(zipcode);

	}

	public void insertPassWord2(String password2) {

		PASSWORD2_ELEMENT.sendKeys(password2);

	}

	public void insertRePassWord2(String repassword2) {

		REPASSWORD2_ELEMENT.sendKeys(repassword2);

	}

	public void clickSubmitButton() {

		SUBMIT_ELEMENT.click();

	}

   public void verifyProfilePage() { 
   
  waitForElement(driver,5,SUMMARY_ON_PROFILE_ELEMENT);
   
  Assert.assertEquals(SUMMARY_ON_PROFILE_ELEMENT.getText(), "Summary", "Wrong Page!!!");
   }

 //tbody/tr[1]/td[3]
 //tbody/tr[2]/td[3]
 //tbody/tr[3]/td[3]
   //tbody/tr[i]/td[3]
	//tbody\tr[1]/td[3]/following-sibling::td[4]/a[2]"   
 String beforeXpath= "//tbody/tr[";
 String afterXpath ="]/td[3]";
 String afterXpathDelete ="]/td[3]/following-sibling::td[4]/a[2]";		 
		 public void verifyEnteredNameAndDelete() {
   
   for( int i =1;i<=10; i++) {
	 
String enteredname = driver.findElement(By.xpath(beforeXpath + i + afterXpath)).getText();
   //System.out.println(enteredname);
  // Assert.assertEquals(enteredname,generatedName, "Enter Name does !!!");
 if(enteredname.contains(generatedName)) {
	 System.out.println("Entered name Exist");
	 
	 driver.findElement(By.xpath(beforeXpath + i + afterXpathDelete)).click();	 
 }
break;
   }
   
   }

}
