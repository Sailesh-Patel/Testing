package useracceptance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestUAT {

	private RemoteWebDriver driver = new ChromeDriver();

	@BeforeEach
	void init() {
		ChromeOptions opts = new ChromeOptions();
//		this.driver = new ChromeDriver(opts);
		this.driver.manage().window().maximize();
	}

//	@Test
//	void seleniumTest() {
//		this.driver.get("http://www.bing.com");
//	}

//	@Test
//	void seleniumTest2() {
//		this.driver.get("http://www.google.com");
//	}

//	@Test
//	void seleniumTest3() {
//		this.driver.get("http://www.yahoo.com");
//	}

//	@Test
//	void textBoxTest() {
//		this.driver.get("http://demoqa.com/text-box");
//
//		WebElement consent = this.driver.findElement(By.cssSelector(
//				"body > div.fc-consent-root > div.fc-dialog-container > div.fc-dialog.fc-choice-dialog > div.fc-footer-buttons-container > div.fc-footer-buttons > button.fc-button.fc-cta-consent.fc-primary-button"));
//		consent.click();
//
//		WebElement fullName = this.driver.findElement(By.id("userName"));
//		fullName.sendKeys("Barry");
//
//		WebElement email = this.driver.findElement(By.id("userEmail"));
//		email.sendKeys("BarryAllan@Starlabs.com");
//
//		WebElement currentAddress = this.driver.findElement(By.id("currentAddress"));
//		currentAddress.sendKeys("Star Labs");
//
//		WebElement permanentAddress = this.driver.findElement(By.id("permanentAddress"));
//		permanentAddress.sendKeys("Star Labs");
//
//		WebElement submit = this.driver.findElement(By.id("submit"));
//		submit.click();
//
//		WebElement display = this.driver.findElement(By.id("name"));
//
//		Assertions.assertEquals(true, display.getText().contains("Barry"));
//
//		WebElement display2 = this.driver.findElement(By.id("email"));
//
//		Assertions.assertEquals(true, display2.getText().contains("BarryAllan@Starlabs.com"));
//	}

	@Test
	void checkBoxTest() {
		this.driver.get("http://demoqa.com/text-box");

		WebElement consent = this.driver.findElement(By.cssSelector(
				"body > div.fc-consent-root > div.fc-dialog-container > div.fc-dialog.fc-choice-dialog > div.fc-footer-buttons-container > div.fc-footer-buttons > button.fc-button.fc-cta-consent.fc-primary-button"));
		consent.click();

		WebElement checkBox = this.driver.findElement(By.cssSelector("#item-1 > svg"));
		checkBox.click();

		WebElement home = this.driver.findElement(By.cssSelector("#tree-node > ol > li > span > button > svg"));
		home.click();

		WebElement document = this.driver
				.findElement(By.cssSelector("#tree-node > ol > li > ol > li:nth-child(2) > span > button > svg"));
		document.click();

		WebElement workSpace = this.driver.findElement(By.cssSelector(
				"#tree-node > ol > li > ol > li.rct-node.rct-node-parent.rct-node-expanded > ol > li:nth-child(1) > span > button > svg"));
		workSpace.click();

		WebElement react = this.driver.findElement(By.cssSelector(
				"#tree-node > ol > li > ol > li.rct-node.rct-node-parent.rct-node-expanded > ol > li.rct-node.rct-node-parent.rct-node-expanded > ol > li:nth-child(1) > span > label > span.rct-checkbox > svg"));
		react.click();

		WebElement display = this.driver.findElement(By.id("result"));

		Assertions.assertEquals(true, display.getText().contains("react"));
	}
}
