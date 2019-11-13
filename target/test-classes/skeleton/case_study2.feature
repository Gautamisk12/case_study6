Feature: Login to TestMe application

Scenario Outline: Login to TestMe app using given credentials

* user opens TestMe app
* user clicks signin button
* user enters username as "<username>" in username field
* user enters password as "<Password>" in Password field
* user clicks the Login button
* validate the login success

Examples:
|username|Password|
|ruchitaa|123456|
