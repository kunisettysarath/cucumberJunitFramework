Feature: user should be able to register in new tours website 
@newTours
Scenario Outline: Navigating to the website and registering as the user 
	Given I navigate to newtours website "<url>" 
	When I click on register button 
	Then I verify register page is displayed
	When I enter user firstname as "<FirstName>"
	And I enter user lastname as "<LastName>"
	And I enter user PhoneNo as "<PhoneNo>"
	And I enter user Email as "<Email>"
	And I enter user Address as "<Address>"
	And I enter user City as "<City>"
	And I enter user State as "<State>"
	And I enter user PostalCode as "<PostalCode>"
	And I enter user Country as "<Country>"
	And I enter UserName Country as "<UserName>"
	And I enter Password Country as "<Password>"
	And I enter Confirm Password Country as "<Password>"
	When I click on submit button
	Then I verify user is registered
	
	
	Examples: 
		|         			 url					   |FirstName|LastName|PhoneNo   |Email        |Address|City |State |PostalCode|Country|UserName|Password|
		|http://newtours.demoaut.com/mercurywelcome.php|Raj1     |Sekar1  |8074451140|test@tst1.com|street1|City1|State1|123451    |INDIA  |Random1 |Test1234|
		|http://newtours.demoaut.com/mercurywelcome.php|Raj2     |Sekar2  |8074451141|test@tst2.com|street2|City2|State2|123452    |INDIA  |Random2 |Test1234|
		|http://newtours.demoaut.com/mercurywelcome.php|Raj3     |Sekar3  |8074451142|test@tst3.com|street3|City3|State3|123453    |INDIA  |Random3 |Test1234|
		|http://newtours.demoaut.com/mercurywelcome.php|Raj4     |Sekar4  |8074451143|test@tst4.com|street4|City4|State4|123454    |INDIA  |Random4 |Test1234|
		|http://newtours.demoaut.com/mercurywelcome.php|Raj5     |Sekar5  |8074451144|test@tst5.com|street5|City5|State5|123455    |INDIA  |Random5 |Test1234|
		|http://newtours.demoaut.com/mercurywelcome.php|Raj6     |Sekar6  |8074451145|test@tst6.com|street6|City6|State6|123456    |INDIA  |Random6 |Test1234|
		|http://newtours.demoaut.com/mercurywelcome.php|Raj7     |Sekar7  |8074451146|test@tst7.com|street7|City7|State7|123457    |INDIA  |Random7 |Test1234|
		|http://newtours.demoaut.com/mercurywelcome.php|Raj8     |Sekar8  |8074451147|test@tst8.com|street8|City8|State8|123458    |INDIA  |Random8 |Test1234|
		|http://newtours.demoaut.com/mercurywelcome.php|Raj9     |Sekar9  |8074451148|test@tst9.com|street9|City9|State9|123459    |INDIA  |Random9 |Test1234|
		|http://newtours.demoaut.com/mercurywelcome.php|Raj10    |Sekar10 |8074451110|tst@tst10.com|stret10|Cty10|Stte10|123410    |INDIA  |Random10|Test1234|  
