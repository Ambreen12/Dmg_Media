##### DMG Media Project
Thanks for giving me the opportunity to work on this project. I have used selenium with Java containing the OOP concept. I have used cucumber testing tool with BDD approach (Feature file). Junit has also been used for assertion and verification  in my project.
My framework is based on OOP concept where  I have used encapsulation, Inheritance , polymorphism and abstraction to make my test cases more centralized, scalable, easy to maintain and reusable. My framework also entails the POM in which I have saved the main page of the website. However, if there were any more pages on the same project, I would of saved them separately under the Pages folder. I have a Hook class where i have saved the screenshot method.
I run my test cases through Cukes Runners. I also have used Cucumber Pretty Report to display the graphical picture of the test cases which is user friendly and less time taking to understand for the non-technical people.

About The Project

User stories were nicely and concisely written. Acceptance criterias were very clear too. However, there was a slight issue in choosing India (first from the list after typing  India in the search bar), It was not always giving the “select your departure date” text on the top of the Book online button and i was not able to see the calender to choose the first available date. Therefore, I have selected India and Shimla Extension to carry on the automation and tried to display my automation and manual testing skills.

##### TOOLS AND EXPLANATIONS
>- The project has been prepared based on Cucumber BDD style.
>- Maven build management tool is used in this project by Java language.
>- project includes seven scenarios.

##### HOW TO RUN TESTS
```sh
 -> Under the runner package "Cukes_Runner" right click and run Runner. "src > test > java > runner > Cukes_Runner"
 -> mvn test --> in the IDE console or navigate project path in command line and run.
```
##### HOW TO CREATE TEST REPORTS

1-) When you run tests with the **"mvn verify"** command from the console, you can see **Cucumber Html Report** under the target file.       
**-> target -> cucumber-html-reports > overview-steps.html** (open with chrome option)

2-) Second type of report, the project is run from **Runner** class, a **Cucumber Report link** is created in the IDE console automatically.       
Sample link -> View your Cucumber Report at:   (Works 24 hours later than it will delete automatically)                                         
https://reports.cucumber.io/reports/d075d19d-4ccb-4e11-8da8-85e2220de650             
Sample Screenshot -> **SampleCucumberReportScreeShot.png**


 