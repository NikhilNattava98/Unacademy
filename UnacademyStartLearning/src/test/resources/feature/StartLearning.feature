@StartLearning 
Feature: StartLearning

Scenario: User is on Unacademy Home page
Given User is successfully logged into his account
When User selects country code
And User enters registered phone number
And User click login button
And User should enter valid otp
And click on verify otp button
Then User should be able to login successfully

@AddCourse
Scenario: Successfully add courses in My goals 
Given User is on start learning page
When user selects the courses he wants to add
Then course gets added to the My goals

@CourseLanguage
Scenario: Show the course description of selected course
Given User is on start learning page
When user clicks on the course
Then user is navigated to select the language

@GetSubs
Scenario: Show different subscription options
Given User is on start learning page 
When user clicks on the course in mygoals
Then user is navigated to course description page 
And when user clicks on get subscription 
Then user is shown different subscription plans

@Warn
Scenario: Show alert page
Given User is on start learning page
When user clicks on the remove sign on course
Then show the alert msg

@CancelRemoval
Scenario: Cancel the removal of course from My goals
Given User is on start learning page
When user clicks on the remove sign on course
Then show the alert msg
And when user clicks on cancel button
Then the course does not get removed

@RemoveCourse
Scenario: Remove the course from My goals
Given User is on start learning page
When user clicks on the remove sign on course
Then show the alert msg
And when user clicks on remove button
Then the course gets removed 

@DisplayCourse
Scenario: Display various courses for exam type
Given User is on start learning page
When user clicks on the exam type
Then various courses related to exam are displayed