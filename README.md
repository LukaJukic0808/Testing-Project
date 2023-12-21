# Sofascore UI Test Project

## Instructions
Recommended tools:
<ol>
  <li>Install <a href="https://www.oracle.com/java/technologies/downloads/" target="_blank">Java</a> (Version 11 or higher)</li>
  <li>Download <a href="https://www.jetbrains.com/idea/" target="_blank">IntelliJ IDEA</a></li>
  <li>Download <a href="https://github.com/SeleniumHQ/selenium/releases/download/selenium-4.16.0/selenium-server-4.16.1.jar" target="_blank">Selenium Server/Grid</a></li>
</ol>
To run and analyze tests, please follow the steps below:
<ol>
  <li>Clone this repository</li>
  <li>In the command line, navigate to the folder where your Selenium Server file is.</li>
  <li>Copy the following line and click ENTER (don't close command line):</li>
  
  ```
  java -jar selenium-server-4.16.1.jar standalone --selenium-manager true
  ```

  <li>Open this project in your IDE, then go to terminal(make sure you are inside project folder), copy the following line and click CTRL+ENTER:</li>

  ```
  mvn test
  ```

 <li>Wait for tests to finish.</li>
 <li>In your IDE, inside project folder, navigate to target/surefire-reports/index.html, right click it and open in your preffered browser. From there, you can analyze tests results.</li>
 <li>Once you are done, it is recommended to go to opened command line and terminate Selenium Server by clicking CTRL+C(multiple times if once doesn't work)</li>
</ol>

## Tests descriptions

### Testing Sofascore homepage - testHomePage method
Since this method is set up to always run first, accepting cookies is a part of it. Method checks whether some crucial parts of the home page are displayed or not. That includes calendar, profile picture, top leagues and settings button.

### Testing the part of Sofascore homepage which shows chosen football match details - testFootballMatchSubPage method
This method clicks first shown football match and ensures that match details information coincide with chosen match by comparing home and away team names. It also verifies that some crucial parts of match details subpage are displayed.

### Testing the Sofascore favourites page - testFavouritesPage method
This method adds first football match on homepage to favourites, navigates to favourites page and verifies that correct match is added to favourites by comparing home and away team names. It also checks if some parts of the favourites page are shown.

### Testing the Sofascore football team page - testFootballTeamPage method
This method uses Sofascore search bar to find football team, selects the first result and compares predefined team information (name, league, nation) with the information shown on the found page. It also verifies that correct page is shown by checking whether some team page specific parts are displayed or not. Predefined team information can be modified inside the method to search for a specific football team page.

### Testing the Sofascore football player page - testFootballPlayerPage method
This method tests football player page in the same fashion as testFootballTeamPage method tests football team page.

## Advanced techniques used
Below is a list of some concepts applied in this project. More about technique can be found by clicking on it:
<ul>
  <li><a href="https://www.selenium.dev/documentation/webdriver/" target="_blank">Selenium Web Driver</a></li>
  <li><a href="https://www.browserstack.com/guide/page-object-model-in-selenium" target="_blank">Page Object Model(Page Factory)</a></li>
  <li><a href="https://www.browserstack.com/guide/cross-browser-testing-in-selenium" target="_blank">Cross-Browser testing</a></li>
  <li><a href="https://www.selenium.dev/documentation/grid/" target="_blank">Selenium Grid</a></li>
  <li><a href="https://maven.apache.org/surefire/maven-surefire-report-plugin/usage.html" target="_blank">Test reporting</a></li>
  <li><a href="https://www.selenium.dev/documentation/webdriver/waits/" target="_blank">Selenium Waiting Strategies(Implicit and Explicit wait)</a></li>
  <li><a href="https://git-scm.com/docs/gitignore" target="_blank">.gitignore</a></li>
</ul>

