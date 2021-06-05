package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
    private @FindBy(xpath = "//nav[@id='main_nav']/div/div[3]/div[1]/nav/ul/li[1]/a") WebElement SolutionsMenuTap;
	
	private @FindBy(xpath = "//nav[@id='main_nav']/div/div[3]/div[1]/nav/ul/li[1]/ul/li/div/div[3]/ul/li/a") WebElement AllProductsLink;
	
	
	public void GoToSolutionsTap() {
		clickOnElementUsingCustomTimeout(SolutionsMenuTap, driver, 15);
		
	}
	
	public void NavigateToAllProducts() {
		clickOnElementUsingCustomTimeout(AllProductsLink, driver, 15);
		
	}

}
