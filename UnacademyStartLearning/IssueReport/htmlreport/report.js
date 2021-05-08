$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/StartLearning.feature");
formatter.feature({
  "line": 2,
  "name": "StartLearning",
  "description": "",
  "id": "startlearning",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@StartLearning"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "User is on Unacademy Home page",
  "description": "",
  "id": "startlearning;user-is-on-unacademy-home-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is successfully logged into his account",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User selects country code",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters registered phone number",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User click login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User should enter valid otp",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "click on verify otp button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User should be able to login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StartLearningStepDefinition.User_is_successfully_logged_into_his_account()"
});
formatter.result({
  "duration": 8605790000,
  "status": "passed"
});
formatter.match({
  "location": "StartLearningStepDefinition.user_selects_country_code()"
});
formatter.result({
  "duration": 5466731900,
  "status": "passed"
});
formatter.match({
  "location": "StartLearningStepDefinition.user_enters_registered_phone_number()"
});
formatter.result({
  "duration": 5316385200,
  "status": "passed"
});
formatter.match({
  "location": "StartLearningStepDefinition.user_click_login_button()"
});
formatter.result({
  "duration": 137231600,
  "status": "passed"
});
formatter.match({
  "location": "StartLearningStepDefinition.user_should_enter_valid_otp()"
});
formatter.result({
  "duration": 1533462500,
  "status": "passed"
});
formatter.match({
  "location": "StartLearningStepDefinition.click_on_verify_otp_button()"
});
formatter.result({
  "duration": 8247675700,
  "status": "passed"
});
formatter.match({
  "location": "StartLearningStepDefinition.user_should_be_able_to_login_successfully()"
});
formatter.result({
  "duration": 10286843400,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Successfully add courses in My goals",
  "description": "",
  "id": "startlearning;successfully-add-courses-in-my-goals",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@AddCourse"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "User is on start learning page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "user selects the courses he wants to add",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "course gets added to the My goals",
  "keyword": "Then "
});
formatter.match({
  "location": "StartLearningStepDefinition.user_is_on_start_learning_page()"
});
formatter.result({
  "duration": 3011747800,
  "status": "passed"
});
formatter.match({
  "location": "StartLearningStepDefinition.user_selects_the_courses_he_wants_to_add()"
});
formatter.result({
  "duration": 7056400,
  "error_message": "java.lang.NullPointerException\r\n\tat java.util.Objects.requireNonNull(Objects.java:203)\r\n\tat org.openqa.selenium.support.ui.FluentWait.\u003cinit\u003e(FluentWait.java:106)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.\u003cinit\u003e(WebDriverWait.java:85)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.\u003cinit\u003e(WebDriverWait.java:45)\r\n\tat stepDefinition.StartLearningStepDefinition.user_selects_the_courses_he_wants_to_add(StartLearningStepDefinition.java:138)\r\n\tat ✽.When user selects the courses he wants to add(src/test/resources/feature/StartLearning.feature:16)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StartLearningStepDefinition.course_gets_added_to_the_my_goals()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 20,
  "name": "Display various courses for exam type",
  "description": "",
  "id": "startlearning;display-various-courses-for-exam-type",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@DisplayCourse"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "User is on start learning page",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "user clicks on the exam type",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "various courses related to exam are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StartLearningStepDefinition.user_is_on_start_learning_page()"
});
formatter.result({
  "duration": 3007035600,
  "status": "passed"
});
formatter.match({
  "location": "StartLearningStepDefinition.user_clicks_on_the_exam_type()"
});
formatter.result({
  "duration": 650100,
  "error_message": "java.lang.NullPointerException\r\n\tat stepDefinition.StartLearningStepDefinition.user_clicks_on_the_exam_type(StartLearningStepDefinition.java:164)\r\n\tat ✽.When user clicks on the exam type(src/test/resources/feature/StartLearning.feature:22)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StartLearningStepDefinition.various_courses_related_to_exam_are_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 26,
  "name": "Show the course description of selected course",
  "description": "",
  "id": "startlearning;show-the-course-description-of-selected-course",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 25,
      "name": "@CourseLanguage"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "User is on start learning page",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "user clicks on the course",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "user is navigated to select the language",
  "keyword": "Then "
});
formatter.match({
  "location": "StartLearningStepDefinition.user_is_on_start_learning_page()"
});
formatter.result({
  "duration": 3012246100,
  "status": "passed"
});
formatter.match({
  "location": "StartLearningStepDefinition.user_clicks_on_the_course()"
});
formatter.result({
  "duration": 605800,
  "error_message": "java.lang.NullPointerException\r\n\tat java.util.Objects.requireNonNull(Objects.java:203)\r\n\tat org.openqa.selenium.support.ui.FluentWait.\u003cinit\u003e(FluentWait.java:106)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.\u003cinit\u003e(WebDriverWait.java:85)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.\u003cinit\u003e(WebDriverWait.java:45)\r\n\tat stepDefinition.StartLearningStepDefinition.user_clicks_on_the_course(StartLearningStepDefinition.java:186)\r\n\tat ✽.When user clicks on the course(src/test/resources/feature/StartLearning.feature:28)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StartLearningStepDefinition.user_is_navigated_to_select_the_language()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 32,
  "name": "Cancel the removal of course from My goals",
  "description": "",
  "id": "startlearning;cancel-the-removal-of-course-from-my-goals",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 31,
      "name": "@CancelRemoval"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "User is on start learning page",
  "keyword": "Given "
});
formatter.step({
  "line": 34,
  "name": "user clicks on the remove sign on course",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "show the alert msg",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "when user clicks on cancel button",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "the course does not get removed",
  "keyword": "Then "
});
formatter.match({
  "location": "StartLearningStepDefinition.user_is_on_start_learning_page()"
});
formatter.result({
  "duration": 3005397500,
  "status": "passed"
});
formatter.match({
  "location": "StartLearningStepDefinition.user_clicks_on_the_remove_sign_on_course()"
});
formatter.result({
  "duration": 5005368100,
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.click(Unknown Source)\r\n\tat pageObjectModel.StartLearningPageModel.Warning(StartLearningPageModel.java:59)\r\n\tat stepDefinition.StartLearningStepDefinition.user_clicks_on_the_remove_sign_on_course(StartLearningStepDefinition.java:218)\r\n\tat ✽.When user clicks on the remove sign on course(src/test/resources/feature/StartLearning.feature:34)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StartLearningStepDefinition.show_the_alert_msg()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StartLearningStepDefinition.when_user_clicks_on_cancel_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StartLearningStepDefinition.the_course_does_not_get_removed()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 40,
  "name": "Remove the course from My goals",
  "description": "",
  "id": "startlearning;remove-the-course-from-my-goals",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 39,
      "name": "@RemoveCourse"
    }
  ]
});
formatter.step({
  "line": 41,
  "name": "User is on start learning page",
  "keyword": "Given "
});
formatter.step({
  "line": 42,
  "name": "user clicks on the remove sign on course",
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "show the alert msg",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "when user clicks on remove button",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "the course gets removed",
  "keyword": "Then "
});
formatter.match({
  "location": "StartLearningStepDefinition.user_is_on_start_learning_page()"
});
formatter.result({
  "duration": 3005273900,
  "status": "passed"
});
formatter.match({
  "location": "StartLearningStepDefinition.user_clicks_on_the_remove_sign_on_course()"
});
formatter.result({
  "duration": 5007043500,
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.click(Unknown Source)\r\n\tat pageObjectModel.StartLearningPageModel.Warning(StartLearningPageModel.java:59)\r\n\tat stepDefinition.StartLearningStepDefinition.user_clicks_on_the_remove_sign_on_course(StartLearningStepDefinition.java:218)\r\n\tat ✽.When user clicks on the remove sign on course(src/test/resources/feature/StartLearning.feature:42)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StartLearningStepDefinition.show_the_alert_msg()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StartLearningStepDefinition.when_user_clicks_on_remove_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StartLearningStepDefinition.the_course_gets_removed()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 48,
  "name": "Show different subscription options",
  "description": "",
  "id": "startlearning;show-different-subscription-options",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 47,
      "name": "@GetSubs"
    }
  ]
});
formatter.step({
  "line": 49,
  "name": "User is on start learning page",
  "keyword": "Given "
});
formatter.step({
  "line": 50,
  "name": "user clicks on the course in mygoals",
  "keyword": "When "
});
formatter.step({
  "line": 51,
  "name": "user is navigated to course description page",
  "keyword": "Then "
});
formatter.step({
  "line": 52,
  "name": "when user clicks on get subscription",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "user is shown different subscription plans",
  "keyword": "Then "
});
formatter.match({
  "location": "StartLearningStepDefinition.user_is_on_start_learning_page()"
});
formatter.result({
  "duration": 3001404700,
  "status": "passed"
});
formatter.match({
  "location": "StartLearningStepDefinition.user_clicks_on_the_course_in_mygoals()"
});
formatter.result({
  "duration": 5011153100,
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.click(Unknown Source)\r\n\tat pageObjectModel.StartLearningPageModel.CourseInMygoals(StartLearningPageModel.java:51)\r\n\tat stepDefinition.StartLearningStepDefinition.user_clicks_on_the_course_in_mygoals(StartLearningStepDefinition.java:269)\r\n\tat ✽.When user clicks on the course in mygoals(src/test/resources/feature/StartLearning.feature:50)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StartLearningStepDefinition.user_is_navigated_to_course_description_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StartLearningStepDefinition.when_user_clicks_on_get_subscription()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StartLearningStepDefinition.user_is_shown_different_subscription_plans()"
});
formatter.result({
  "status": "skipped"
});
});