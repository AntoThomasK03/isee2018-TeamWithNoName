welcome to our third blog post in this blog post we would like to share our development phase of system design

The system design is the core for development of the app. we are going to demonstrate the interation of the app and the user with the help UML diagrams of State chart and sequence diagram and then we would like to explain in detail with the class diagram about al1 the classes and other attributes involved in the app and the association of classes to each other

<h2>Behavioral Diagram</h2>
 With the help of the state chart diagram we can show the flow of information from one state to another. 
 <h2>State chart for entering new activity</h2>
 In the below diagram it shows the simple operation of entering a new activity in our application. 
![Deadline image]({{site.baseurl}}/images/st1.png "st1")
In this diagram it shows that the user is authenticated after the valid pin or else he is given an option to retry or to exit the app.
when the user enters the valid pin he is directed to home screen whe the user can choose the enter new activity option. Then the user have the freedom to select the category after entering the activity name and the user can set the duration of the activity and then the activity is saved in the database and exited ti the homescreen.

<h2>State chart for reviewing the history of activity</h2>

In the below diagram it demonstrates the activity overview or the history. In this feature the user selects to review his hostory of activities and then the user have the freedom to select the activites which he want to view by filtering according to type of activity or category or month. Once is user is done with selction of his preferences then the user is given an option to view the data in either format of text or a barchart representation which is much easier to understand.
![Deadline image]({{site.baseurl}}/images/st2.png "st2")

<h2>Interaction Diagram</h2>
<h2>Sequence diagram</h2> 
![Deadline image]({{site.baseurl}}/images/sq1.png "sq1")
<h2>Class Diagram</h2>
![Deadline image]({{site.baseurl}}/images/cl.png "cl")
We have mapped our class diagram based on our use case scenario. We have identified the user, new activity, history, database, settings as our main classes.Here is the detailed description of each class their attributes, operation and association of classes as well.

<h3>User class</h3>
The user class consists of user name, PIN, email as the attributes which are essential for accessing the app although these can be disabled in the setting menu but more on that later.
And the operation of the user class is to login which is done by verifying the pin through the database.
<h3>New activity class</h3>
The function of the new activity class is to enable the user to create a new activity and the attributes and the operations of the new activity class are as follows
<br>•Activity name : It stores the name of the activty, data type is string.
<br>•Activity category : It stores the type of activity which is acessed from category class, data type string.
<br>•Activity date : It stores the date of the activity , datat type date.
<br>•Activity time : It stores the user set time of the activity, datat type is long.
<br>•Activity duration : It stores the duration of acctivity is carried out, data type isinteger.
<br>•Activity repeat: It stores the repeated activities for autofilling, Data type is string.

<h3>New activity class operations</h3>
<br>•Get() : Gets all the valid data from the user for relavant attributes.
<br>•Set() : Creates all the necessary attributes in the database.
<br>•Custom() : Sets the custom category if required by the user.
<br>•Autofill() : It autofiils the newactivity if the same activity is being repeated.

<h3>Category class</h3>
Category class shares the association with the new activity class as this class only purpose is to provide user with different categories. They are classified as professional and personal. They are to store the category as either professional or personal.
But if the user choose to go for another category the custom attribute store that new category.
The operations of the category class are to create and delete categories.

<h3>Database class</h3>
The operations of the database class are as follows,
<br>•Create user : To create new user details in the datatbase.
<br>•Delete user : To delete user details from the datatbase.
<br>•Create activity : To create a a new activity entry in the datatbase for further accessing.
<br>•Delete activity : To delete any existing activity.
<br>•Verify PIN : To verify the PIN from datatbase when user tries to login.
<br>•Get filter : To get the filter parameters from the user.
<br>•Set filter : To set the filter parameters in the database.
<br>•Sortby date : To acess the activities based on the date.
<br>•Sortby category : To acess the activities based on category.
<br>•Sortby activity : to acess the activity based on the activityname/type.
<br>•History : To display overview of the activites when user requested.
<br>•Repeat activity : To provide the function of autofilling when activity is repeated.
<br>•Recover pin email : Used to send an email when requested for PIN recovery.
<br>•Assingn colour : To assingn a colour based on type of category selected.
<br>•Store bargraph : To save all data as bar graph for further reviewing.

<h3>Settings class</h3>
The attributes of the setting class are
<br>•PIN : Stores the PIN set by user
<br>•User details : Stores the user information.
<br>•Export/Import data : Stores the data required for exporting and importing.

The operations of the settings class are
<br>•SetPIN : To set or edit PIN.
<br>•Export/Import data : To export or import data via email or to another android device.
<br>•SetUserdetails : To edit the user details.

<h3>History class</h3>
History class attributes
<br>•Activity start period : Stores the start pediod set by the user for overview.
<br>•Activity end period : StoreS the activity end period set by the user for overvies.
<br>•Activity : Stores the activity selected by the user for overview
<br>•Activity Category : Store the activity category for overview.

History class operations
<br>•Get activity : Get the activity name from user
<br>•Get category : get activity category from user
<br>•Sortby colour : To sort and display by activity colour
<br>•Sortby category : To sort and display by activity category
<br>•sortby duration : To sort by duration of activity.
<br>•sortby activity : To sort by activity type/name
<br>•sortby month : To sort by month
<br>•Get bar graph : To get bar graph for displaying activity overview from database.

<h2>Design Pattern</h2>

We are planning to use the facade design process also know as Structural Design Pattern.

![Deadline image]({{site.baseurl}}/images/123456.png "123456")
We choose this pattern because it hides the complexity of the code by providing an easy interface to the user that can access the whole system. A single class provides all the methods required by the user from the system. We choose this pattern after carefully studying it from the examples from the blog androidexample1 it was our refernce for the design pattern as we are new to the design patterns.
<h2>Development Strategy</h2>
We are failed to use efficently the zenhub as this project main objective is to teach how to operate in gropu while working in an agile environment. But as for the rest of the development of this app we have decided to use the zenhub as efficently as possible.
below is the plan for our next 3 sprints and a screen shot for the zenhub dashboard showing our strategy and deadlines for the tasks.
![Deadline image]({{site.baseurl}}/images/spn.png "spn")
