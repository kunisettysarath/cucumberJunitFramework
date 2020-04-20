Feature: User should be able to search flights in airasia website and validate login error message
Background: 
	Given I navigate to air asia website 
		|https://www.airasia.com/en/home.page|
		
@flight 
Scenario: Navigating to air asia website and performing flight search 
	Then I verify the title of the website should be as "Book Flights, Hotels, Deals & Activities Online | AirAsia" 
	When I click on the flight option on the home page 
	And I enter "Bengaluru" as origin city 
	And I enter "Pune" as destination city 
	And I click on calendar option 
	And I click on oneway as a trip type 
	And I select departure date as "16" 
	And I click on confirm button 
	And I click on search button 
	Then I verify user is navigated to select flight page 
	
@login
Scenario: Validating invalid login message
When I click on Log In/Sign Up button on the home page
Then I verify that login modal is displayed
When I enter "a@gmail.com" as username
And I enter "India1234" as password
And I click on Log in button
Then I verify "Your log in attempts has been unsuccessful." error message is displayed 
