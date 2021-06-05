package pageObjects;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllProductsPage extends BasePage {

	
	public Select sol;
	
	WebDriverWait wait;
	public AllProductsPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		
	
		
		
	}
	
	 private @FindBy(id= "edit-solutions") WebElement SolutionsDrp;
		
	
	private @FindBy(id = "edit-submit-subhomes") WebElement ApplyButton;
	 
	private @FindBy(xpath = "//div[@class='col-xs-12 col-md-3 views-col col-2']/a/div/div[3]/div/span") WebElement ItemAfterClickingOnButton;
	
	public static String Item;
	
	public List<String> getElementsOfSolutionsDRP(){
		
		
		List<String>SolElements=new ArrayList<String>();
		
		sol=new Select(SolutionsDrp);
	      
	      List<WebElement> options=sol.getOptions();
	      
	      for ( WebElement i : options) {
		      
	    	  
	    	  SolElements.add(i.getText());
		     }
		
		return SolElements;
	}
	
	public String filterWithCloudOption() {
		//sol=new Select(SolutionsDrp);
		sol.selectByValue("Cloud");
		
		clickOnElementUsingCustomTimeout(ApplyButton, driver,10);
		wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(ItemAfterClickingOnButton));
		 Item=ItemAfterClickingOnButton.getText();
		return Item;
		
		
	}
	
	public void navigateToCloudArticle() {
		
		clickOnElementUsingCustomTimeout(ItemAfterClickingOnButton, driver, 15);
	}

}
