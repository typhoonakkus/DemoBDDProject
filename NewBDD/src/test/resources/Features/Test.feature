Feature: Test login


  @Smoke
  Scenario: check login is sucessful A
    Given write username "TuribHelpDesk1"
    And write password "123456"
    When clicks on login btn    
    Then user is navigate to the home page
  
  @Smoke 
 Scenario: check login is sucessful B
    Given write username "TuribHelpDesk2"
    And write password "123456"
    When clicks on login btn    
    Then user is navigate to the home page
    
 Scenario: check login is sucessful C
    Given write username "TuribHelpDesk3"
    And write password "123456"
    When clicks on login btn    
    Then user is navigate to the home page

    