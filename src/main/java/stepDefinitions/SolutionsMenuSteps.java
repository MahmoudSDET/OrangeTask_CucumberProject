package stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.hamcrest.collection.IsArrayContaining;
import org.hamcrest.collection.IsArrayContainingInAnyOrder;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.GoogleSearchEnginePage;
import utils.DriverFactory;

public class SolutionsMenuSteps extends DriverFactory {
	
	
	
	@Given("^user navigates to Google$")
	public void user_navigates_to_Google() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		getDriver().get("https://www.google.com/?hl=ar");
	}

	@Given("^user search for \"([^\"]*)\"$")
	public void user_search_for(String Keyword) throws Throwable {
		GoogleSearch.searchForOrangeSite(Keyword);
	}

	@When("^user clicks on FirstLink$")
	public void user_clicks_on_FirstLink() throws Throwable {
		GoogleSearch.OpenFirstLink();
	}

	@Then("^go to Orange website link has below \"([^\"]*)\"$")
	public void go_to_Orange_website_link_has_below(String ExpectedURL) throws Throwable {
	  
		String ActulURL=getDriver().getCurrentUrl();
		
		Assert.assertEquals(ExpectedURL, ActulURL);
		
	  
	}

	@Then("^user can click on solution menu$")
	public void user_can_click_on_solution_menu() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  HP.GoToSolutionsTap();
	}

	@When("^user select All Products$")
	public void user_select_All_Products() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    HP.NavigateToAllProducts();
	}

	@Then("^validate the solutions dropdown list contains the following values$")
	public void validate_the_solutions_dropdown_list_contains_the_following_values(DataTable ExpectedResValues) throws Throwable {
	   
	    List<String>ActList=ALP.getElementsOfSolutionsDRP();
	    List<String> details = ExpectedResValues.asList(String.class);
	    
	    Assert.assertTrue(ActList.containsAll(details));
	}

	@Then("^user select Cloud and click apply$")
	public void user_select_Cloud_and_click_apply() throws Throwable {
		ALP.filterWithCloudOption();
	}

	@When("^user choose item with the following title$")
	public void user_choose_item_with_the_following_title(DataTable Item) throws Throwable {
		 List<String> details = Item.asList(String.class);
		assertEquals(ALP.filterWithCloudOption(), details.get(0));
		ALP.navigateToCloudArticle();
	}

	@Then("^Validate that the system opens the right article$")
	public void validate_that_the_system_opens_the_right_article() throws Throwable {
		assertEquals(ALP.Item, CAP.getArticleTitle());
	    
	}


}
