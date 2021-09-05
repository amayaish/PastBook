# How to run the Test
## Prerequisite

- Java environment
- Maven
- Note: Configure web-driver path and test email address.

## Configure webdriver.

- I used ChromeDriver but you can choose other webdriver eg. Mozilla GeckoDriver
- So first download ChromeDriver from https://chromedriver.chromium.org/downloads
- Copy your downloaded chromedriver.exe file path.
- Go to src\main\java\common\Base.java file.
- Paste the copied file path in System.setProperty("webdriver.chrome.driver","Paste path here").

## Configure test email address.

Change the value of email in \src\test\java\testCase\SignUpTest.java
Note: with same email address you can not create account , so please change the email address before every run of the test.
Project is ready to run. Execute following commands and enjoy the automatic web-driver test.

Go to project path in terminal. For example: C:\Users\User-Name\eclipse-workspace\PastBook>
- Run mvn clean
- Run mvn compile
- Run mvn test
