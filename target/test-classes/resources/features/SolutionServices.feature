Feature: Solution Menu 

Scenario Outline: Validate the solutions menu
	Given user navigates to Google
	And user search for "<OrangeWebsite>"  
	When user clicks on FirstLink
	Then go to Orange website link has below "<Url>"     
	And user can click on solution menu
	When user select All Products
	Then  validate the solutions dropdown list contains the following values
	      |   Business innovation        |
        |          Cloud               | 
        | Collaborative workspace      | 
        |     Customer experience      | 
        |        Cyberdefense          | 
        |      Data intelligence       | 
	      |     Internet of Things       |
	      |     Mobile connectivity      |
	      |     Network transformation   |
	      |       Services               |
	 And user select Cloud and click apply
	 When user choose item with the following title
	    |Managed Applications: improve operational capability in the cloud |
	 Then Validate that the system opens the right article  
	 
Examples: 
	| 					OrangeWebsite						 | 					Url				                         |
	|     Orange Business Services       | 		https://www.orange-business.com/en       |	 
 
	
	
