Feature: I want to test login functionality of OrangeHRM
Scenario: want to test login feature
    Given I need to enter proper url 
    When user enter crendentials to login
    | Admin | admin123 |
    |Admin1| admin1234|
     Then login should be successfully done

