package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import base.BaseTest;

public class BasePage extends BaseTest {

		public void verifyTitile(String ExpectedTitle) {
			Assert.assertEquals(driver.getTitle(), ExpectedTitle);
		}
		public void verifyChechInDates(String ExpectedTitle) {
			Assert.assertEquals(driver.getTitle(), ExpectedTitle);
		}
		
		public void getTitle() {
			System.out.println(driver.findElement(By.xpath(test.getProperty("gettitle"))).getText());
		}
		public void clear(WebElement element) {
			element.clear();
		}
		public void type(WebElement element,String date) {
			element.sendKeys(date);
		}
		
		public void selectDropDown(WebElement elemnet,String visibletext) {
			new Select(elemnet).selectByVisibleText(visibletext);
		}

		public void verifyText( String element , String text2) {
			String value=driver.findElement(By.id(element)).getAttribute("value");
			Assert.assertEquals(value, text2);
		}
		
		
} 
