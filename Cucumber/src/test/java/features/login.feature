#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
####################################################################################

#Can use Given also instead of And
#We can give the common steps in 'Background'. We can use Background only for common preconditions, cannot used for common post conditions
#Background is similar to @BeforeTest in TestNG. So the steps in Background will run before each Scenario.
#Background is only for feature file. While hooks are for multiple feature files

Feature: BookCart application demo

  Background: 
    #Given User should navigate to the application login
    And User clicks on the login link


  Scenario: Login should be success
    And User enter the username as "ortoni"
    And User enter the password as "pass1234"
    When User click the login button
    Then login should be success

  @smoke
  Scenario: Login should be fail
    And User enter the username as "kishore"
    And User enter the password as "passkishore"
    When User click the login button
    But login should be fail
