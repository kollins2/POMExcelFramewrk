package Page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Basepage {

	public int generateRandomNo(int boundaryNumber) {
		Random rdm = new Random();
		int generateN = rdm.nextInt(boundaryNumber);
		return generateN;

	}

	public void selectFromDropDown(WebElement selectElement, String visisbleText) {

		Select sel = new Select(selectElement);
		sel.selectByVisibleText(visisbleText);
	}

	public void waitForElement(WebDriver driver,int timeInSecond, WebElement element) {
			
		 WebDriverWait wait =new WebDriverWait(driver,timeInSecond);
		   wait.until(ExpectedConditions.visibilityOf(element));
	}		   
}