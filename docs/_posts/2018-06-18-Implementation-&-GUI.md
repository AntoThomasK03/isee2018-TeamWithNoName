<h2>Code Convections</h2>

<h3>Naming Conventions</h3>
 1. Classes:
Class names always begin with a capital letter (eg. java.util.Scanner). And if there are mutiple words in the class name then each word must also begin with a capital letter (eg. java.util.GregorianCalendar). Also package names always start with lowercase characters (util, lang, io, etc). And if there are multiple words in the package name, then you need to use uppercase for all words except for the starting word. This naming method is popularly called as UpperCamelCase which is a type of CamelCase! Interfaces also use same convention.
<br>Eg: class MyClass {
   <br>   }
   
 <br>2. Objects/Variables:
Java Naming convention specifies that instances and other variables must start with lowercase and if there are multiple words in the name, then you need to use Uppercase for starting letters for the words except for the starting word. This is called as lowerCamelCase.
<br>Eg:String myName;
  <br>    MyClass myObject;
  <br>    Scanner scannerObject = new Scanner(System.in);
 
 <br>3. Methods:
Methods in Java also follow the same lowerCamelCase convention like Objects and variables.
<br>Eg:void myMethod() {
 <br>     }
   
   
<h2>Commenting onvections</h2>
 
 <h4>1.Single-Line Comments</h4>
Short comments can appear on a single line indented to the level of the code that follows. If a
comment can’t be written in a single line, it should follow the block comment format. A single-line comment should be preceded by a blank line. Here’s an example
<br>if (condition) {
<br> /* Handle the condition. */
<br>...
<br>}

<h4>2.Trailing Comments</h4>
Very short comments can appear on the same line as the code they describe, Here is an example for trailing comment
<br>if (a == 2) {
<br> return TRUE; /* special case */
<br>} else {
<br> return isprime(a); /* works only for odd a */
<br>}

<h4>3.End-Of-Line Comments</h4>
The // comment delimiter begins a comment that continues to the newline. It can comment
out a complete line or only a partial line. Examples of all three styles follow:

<br>if (foo > 1) {
 <br>// Do a double-flip.
 <br>...
<br>}

<h2>Potential Users</h2>
We cam eup with two potential user who could use the app.
<h3>User 1</h3>

<br>Name: Venkat Reddy Katkoor
<br>Profession : Student
<br>Employment Status : Part time
<br>Purpose of using app: To keep track of his time such as time spent in the university, commuting, working, playing sports,etc..

<h3>User 2</h3>
<br>Name: Sharath
<br>Profession : IT Employee
<br>Employment Status : Full time
<br>Purpose of using app: Sharat have a fixed schedule for his job but Sharath want to set goals for his soprts activity and leisure time. So Sarath an set goals in goals option of the app and can keep track of them.
<h2>User Interface</h2>
Here is the mockup of GUI of our app.
<br>The login screen has the PIN and option to recover PIN
<br>![Deadline image]({{site.baseurl}}/images/H.png "H")
<br>Home screen of the App. From here the user navigates to adding a new activity, Reviewing his history of activities, Sending his report via email, Setting up goals or can navigate to settings for more options.
<br>![Deadline image]({{site.baseurl}}/images/H1.png "H1")
<br>New activity screen. Here the user can add the new activty by selecting the date from pop up calendar and then giving duration of time. Next naming the activity and selecting the category if it is acustom category the user can add the name of the activity. The at last the user selects the colour.
<br>![Deadline image]({{site.baseurl}}/images/H2.png "H2")
<br>History screen. Here the user have the freedom to choose the data to be displayed by sorting by days or category or time spent or by name. And the data can be displayed either in text or pie chart format the user can select whichever is convenient.
<br>![Deadline image]({{site.baseurl}}/images/H3.png "H3")
<br>Settings screen. Here the user can manage profile and the PIN can be changed or turned off for unrestricted access. The category options lets the user to further refine the category class and colours for displaying in the chart.
<br>![Deadline image]({{site.baseurl}}/images/H4.png "H4")


Here is the Overview of the app functionality
<br>The top left is the the student enterning  a new activity.
<br>The top right is the user checking his history for the past 7 days.
<br>The bottom left is the settings options.
<br>The bottom right is the athelete setting and tracking his goals.

<br>![Deadline image]({{site.baseurl}}/images/GUI.png "GUI")

  


