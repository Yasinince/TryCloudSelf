Feature: As a user, I should be able to access to Talks module.

  Background: Login as user

  Scenario: verify users can access to Talks module
  When Click Talks module
  Then Verify the page tile is Talks module’s tile

  Scenario: verify users can send message
  When Click Talks module
  And Search a user from search box on the left
  And Write a message
  And Click submit button
  Then Verify the message is displayed on the conversation log