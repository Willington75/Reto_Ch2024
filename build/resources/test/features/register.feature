Feature: User do register in the page utest.com

  @register
  Scenario: Register User Successfully
    Given the user is in the page utest.com
    When The user inputs data for register
    And The user inputs data of address
    And The user inputs data of device
    Then User confirm your register