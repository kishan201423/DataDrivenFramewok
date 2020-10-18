#Data Driven Framework
--
An Automation Framework is collection of assumptions,concepts and practices you bring in while developing the automation project, so it helps in constituting a work platform or support for automated testing.It would be great, if the framework is application independent.

If you look into the any existing framework,it will be block of function libraries for reporting , error handling , and driver scripts.So the test automation framework is an execution environment for automated tests. It is the overall system in which our tests will be automated.

A data-driven framework is where test input and output values are read from data files (ODBC sources, CVS files, Excel files, DAO objects, ADO objects, and such) and are loaded into variables in captured or manually coded scripts. In this framework, variables are used for both input values and output verification values. Navigation through the program, reading of the data files, and logging of test status and information are all coded in the test script. This is similar to table-driven testing (which is discussed shortly) in that the test case is contained in the data file and not in the script; the script is just a "driver," or delivery mechanism, for the data. In data-driven testing, only test data is contained in the data files.

Tools
--

Eclipse Java EE, 
Java 7+, 
Selenium WebDriver, 
Apacha POI, 
TestNG, 
Extend Reports, 
Log4j

Framework Structure:
--
<img src ="Images/Framework%20Structure.PNG">

The framework consists of the following components:
Test automation framework contains following packages and files

Packages

basePackage
This package contains the bass class which consits of common  method used in the framework.

configPackage
This package contains the properties file used in the framework.

pages Package
This package contains all the page classes for new user registration, user login, and hompage. 

testdataPackage
This package contain the excel data sheets which is required for different test cases to provided test data.

utiltiesPackage
This package contains the extend reporter class to generante an Html test report, Log4j to generate logs for the test cases,testutil class contains common methods to be used and a listener class which implement the TestNg listener methods.

<img src ="Images/Src%20Main%20Java.PNG">


testcasesPackage 
This package contains test classes where all the test cases are written using the methods that are defined in page classes to validate expense tracker end to end as per the user stories. These test classes read the input data like user name, password, category names and expense details to add that is provided in the DataProviderClass to perform actions.

logsFolder
This folder the logs files that are generated after running the test scripts.
reportsFolder
This folder contains the Html report generaated after execution of the test suit.
screenshotsFolder
This package contains the screen shot of the failure test script.

Xml files.

1.pom.xml 
Contains all the plugins and dependencies that are required to run the test as maven project. TestNG.xml is configured in this pom.xml to trigger the test.
2.TestNG.xml 
Contains the all class names that are to be triggered to run the complete suite of test cases.

<img src ="Images/Src%20Test%20Java.PNG">

Instructions to run the test automation
--


Install and set up Java

Install and set up Maven plugin

Clone the project and set webdriver path in config.properties file. Run as maven project. use below commands to run Navigate to the project main folder using terminal or cmd and type below commands mvn compile mvn test

<b>Framework Developed By:</b> Kishan Kumar
