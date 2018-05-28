welcome to our third blog post in this blog post we would like to share our development phase of system design

The system design is the core for development of the app. we are going to demonstrate the interation of the app and the user with the help UML diagrams of State chart and sequence diagram and then we would like to explain in detail with the class diagram about al1 the classes and other attributes involved in the app and the association of classes to each other

Behavioral Diagram
 With the help of the state chart diagram we can show the flow of information from one state to another. In the below diagram it shows the simple operation of entering a new activity in our application. 
![Deadline image]({{site.baseurl}}/images/st1.png "st1")
In this diagram it shows that the user is authenticated after the valid pin or else he is given an option to retry or to exit the app.
when the user enters the valid pin he is directed to home screen whe the user can choose the enter new activity option. Then the user have the freedom to select the category after entering the activity name and the user can set the duration of the activity and then the activity is saved in the database and exited ti the homescreen.

In this below diagram it demonstrates the activity overview or the history
![Deadline image]({{site.baseurl}}/images/st2.png "st2")
Interaction Diagram
the sequence diagram 
![Deadline image]({{site.baseurl}}/images/sq1.png "sq1")
![Deadline image]({{site.baseurl}}/images/cl.png "cl")

Design Pattern

We are planning to use the facade design process also know as Structural Design Pattern.

We choose this pattern because it hides the complexity of the code by providing an easy interface to the user that can access the whole system. A single class provides all the methods required by the user from the system. We choose this pattern after carefully studying it from the examples from the blog androidexample1 it was our refernce for the design pattern as we are new to the design patterns.
