package pageObjects;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearchEnginePage extends BasePage {

	public GoogleSearchEnginePage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	private @FindBy(xpath = "//input[@name='q']") WebElement SearchedPanel;
	
	private @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/a/h3") WebElement FirstLink;
	
	
	public void searchForOrangeSite(String keyword) throws Exception {
		
		sendKeysToWebElement(SearchedPanel,keyword);
		SearchedPanel.sendKeys(Keys.ENTER);
	}
	
public void OpenFirstLink() throws Exception {
		
		clickOnElementUsingCustomTimeout(FirstLink, driver, 10);
	}
	
}
