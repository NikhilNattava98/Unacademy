Feature: Login

Background: User is on Unacademy home page
Given User is on login page

@Login
Scenario: Successful login with valid phone number
When User selects country code
And User enters registered phone number
And User click login button
And User should enter valid otp
And click on verify otp button
Then User should be able to login successfully