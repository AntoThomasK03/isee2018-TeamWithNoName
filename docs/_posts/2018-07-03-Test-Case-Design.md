<h2>Test Case design</h2>

<h3>Introduction</h3>
In this blog, we are discussing about testing an android application. This testing is done in two methods. 
<br>1. White box testing.
<br>2. Black box testing.

<h3>What is White Box Testing?</h3>
White box testing is a testing technique, that examines the program structure and derives test data from the program logic/code.Testing based on an analysis of the internal structure of the component or system.
<br>White Box Testing method is applicable to the following levels of software testing:
<br>•   Unit Testing: For testing paths within a unit.
<br>•   Integration Testing: For testing paths between units.
<br>•   System Testing: For testing paths between subsystems.

<h3>What is Black box Testing?</h3>
Black-box testing is a method of software testing that examines the functionality of an application based on the specifications. It is also known as Specifications based testing. Independent Testing Team usually performs this type of testing during the software testing life cycle.Black Box Testing method is applicable to the following levels of software testing:
<br>•  Integration Testing
<br>•  System Testing
<br>•  Acceptance Testing


![Deadline image]({{site.baseurl}}/images/black-box-testing.png "Black Box Testing")


<br>We chose five components / classes for white box testing and five functional requirements for black box testing. The five components were.
<br>• Entering 'PIN'
<br>• Entering New activity name and category
<br>• Selecting date and time
<br>• Navigating between screens
<br>• Selecting colour
<br>• Saving Data

<br>• In the first test we enetr the correct PIN once and thw wrong PIN once.When we enter the correct PIN it is expected to go to home screen of App. and when we enter the wrong PIN it is expected to show the retry text.
<br>• In the second test when we click on different buttons in the homescreen we expect it to take it to the respective activity/screens.
<br>•In the third test we should be able to earase default name and category and enter our own.
<br>•In test four when we click on date a date picker should be open by default todays date. And when click on time a time picker shoulb be open and by default display current time.
<br>•In the fifth test when color button is clicked the colour picker should be open upon accepting the background colour should be changed.
<br>•In the final test when accept button is clicked the datat should be saved to database and should display text activity saved.

<br>•Here are the results.
![Deadline image]({{site.baseurl}}/images/bt1.PNG "bt1")
![Deadline image]({{site.baseurl}}/images/bt2.PNG "bt2")

<h2>White Box Testing</h2>
<h3>Entering Pin</h3>
Here, User opens the TimeTracker application, he/she finds an open page with enter pin option. User should enter the security pin to enter the app. Incase of wrong pin entry, the application will revert the user back to the first page.

![Deadline image]({{site.baseurl}}/images/EnterPin.png "Entering Pin")

<h3>Creating New Activity</h3>
<h3>Start Time</h3>
<h3>End Time</h3>
<h3>Additional Notes</h3>

