Feature: Login into Application

Scenario Outline: Positive test validating login
Given Initialize the browser with chrome
Given Navigate to "https://www.bnz.co.nz/" Site
Then Land on homepage and checking the calculator
When User enters <username> and <password> and logs in
And close browsers




Examples:
|username			|password	|
|test99@gmail.com	|123456		|



