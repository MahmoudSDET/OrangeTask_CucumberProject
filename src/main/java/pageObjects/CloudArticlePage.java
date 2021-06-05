package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CloudArticlePage extends BasePage {

	public CloudArticlePage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	private @FindBy(xpath = "//*[@id='block-theme-boosted-page-title']/h1/span") WebElement ArticleTitle;
	
	public String getArticleTitle() {
		
	    return ArticleTitle.getText();
	}
}
