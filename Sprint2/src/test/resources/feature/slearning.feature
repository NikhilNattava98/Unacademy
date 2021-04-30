Feature: Start Learning

Scenario: User should be able to select start learning
Given User is on the Unacademy page
When User selects start learning
Then The start learning page is displayed

Scenario: User should be able to add the course from start learning
Given User on the start learning page
When User selects the course
And User should be able to select the language
Then The course should be displayed in My goals

Scenario: User should be able to select the type of exam
Given User on start learning page
When User selects the type of exam
Then It is navigated to the related course

Scenario: User should be able to select the course from My goals
Given User has added the courses to My goals
When User selects the course from my goals
Then The subscription option is displayed

Scenario: User should be able to select the subscription
Given User is in the subscription page
When User selects the subscribe option
Then The respective plans for subscription is displayed 

Scenario: User shoul be able to select the subscription plans
Given User in the subscription plans page
When User selects any one of the subscription plan
And selects the proceed to pay option
Then The payment is done accordingly

Scenario: User should be able to select live classes
Given User is in the subscribtion page
When User scrolls down
And selects the live classes
Then The live video classes are given

Scenario: User should be able to select the course information
Given User is in the subscribtion page
When User scrolls down
And selects the required details of the course
Then The details of the course are displayed