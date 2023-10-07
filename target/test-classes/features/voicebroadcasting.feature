Feature: Create Voice Broadcasting Campaign

  @CreateBroadcasting
  Scenario: verify user should able to create a new Voice Broadcasting Campaign 
    Given the user is on dashbboard page
    When the user click on Create Campaign button
    And the user select voice broadcasting
    And user click next button
    Then user should land on New Voice Broadcast Campaign
    When user select live Answer
    And User Select transfer option
    And user select Do Not Call option
    And Click On next button
    Then user should land on contacts option
    When user select a contact list
    And user click on next button
    Then user should land on general Settings page
    When the user click on next button on
    Then user should land on Schedule Campaign page
    And Click on Finish button
    Then user should see successfully alert message match with campaign name.