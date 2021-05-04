@StartLearning 
Feature: StartLearning 

Background: User has already logged in with valid credentials 
and is navigated to start learning page.

@URLcheck
Scenario: check the url
Given User is on start learning page
Then check the url of the page

@AddCourse
Scenario: Successfully add courses in My goals 
Given User is on start learning page
When user selects all valid data 
Then course gets added to the My goals

@CourseDes
Scenario: Show the course description of selected course
Given User is on start learning page
When user clicks on the course
Then user is navigated to course description page

@GetSubs
Scenario: Show different subscription options
Given User is on start learning page 
When user clicks on the course 
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