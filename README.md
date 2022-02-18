![](.\assets\icons\wikipedia_logo.svg "Wikipedia android mobile application tests")

# Wikipedia android mobile application tests

(for build 2.7.50394-alpha-2022-02-18)

## Technology stack

|![](.\assets\icons\java.svg "Java")|![](.\assets\icons\junit5.svg "JUnit5")|![](.\assets\icons\gradle.svg "Gradle")|![](.\assets\icons\selenide.svg "Selenide")|![](.\assets\icons\rest-assured.svg "Rest-Assured")|![](.\assets\icons\jenkins.svg "Jenkins")|![](.\assets\icons\selenoid.svg "Selenoid")|![](.\assets\icons\allurereport.svg "Allure Report")|![](.\assets\icons\alluretestops.svg "Allure TestOps")|![](.\assets\icons\jira.svg "Jira")|![](.\assets\icons\telegram.svg "Telegram")|
| :--------: |:--------: | :--------: | :--------: | :--------: | :--------: | :--------: | :--------: | :--------: | :--------: | :--------: |
| Java | JUnit5 | Gradle | Selenide | Rest-Assured | Jenkins | Selenoid | Allure Report | Allure TestOps | Jira | Telegram

## Covered cases

- [x] Get started pages test
- [ ] [In progress...]
- [ ] [In progress...]
- [ ] [In progress...]
- [ ] [In progress...]

## How to run

The project can be launched by four ways. You can choose the way by setting up the `-DdeviceHost=` parameter.

- ##### To run tests with browserstack platform and browserstack.properties:

    ```sh
      gradle clean test -DdeviceHost=browserstack
    ```

- ##### To run tests with selenoid and selenoid.properties:

    ```sh
      gradle clean test -DdeviceHost=selenoid
    ```

- ##### To run tests with emulator and emulation.properties:

    ```sh
      gradle clean test -DdeviceHost=emulation
    ```

- ##### To run tests with real device and realdevice.properties:

    ```sh
      gradle clean test -DdeviceHost=realdevice
    ```

