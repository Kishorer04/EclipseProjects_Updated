Feature: To validate the login feature with positive and negative flows

  Background: 
  Given Launch Open Cart application URL
  

  Scenario Outline: Verify Opencart login with valid credentials for all Users
  
    And Enter valid "<FullName>" and  "<Email>" and "<PhoneNumber>"
    When Click on login button
    Then Application should open landing page
    
    Examples:
    
        | FullName        | Email             |  PhoneNumber |
        | admin           | admin@abc.com     |  1234567890  |
        | manage          | manage@abc.com    |  0987654321  |
