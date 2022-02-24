![](https://github.com/w3code/mobile-auto-project/blob/ae214a2b3f0579314588b6d42a60641563e5589a/assets/icons/wikipedia_logo.svg "Wikipedia android mobile application tests")

# Wikipedia android mobile application tests

(for build 2.7.50394-alpha-2022-02-18)

## Technology stack

|![](https://github.com/w3code/mobile-auto-project/blob/ae214a2b3f0579314588b6d42a60641563e5589a/assets/icons/java.svg "Java")|![](https://github.com/w3code/mobile-auto-project/blob/ae214a2b3f0579314588b6d42a60641563e5589a/assets/icons/junit5.svg "JUnit5")|![](https://github.com/w3code/mobile-auto-project/blob/ae214a2b3f0579314588b6d42a60641563e5589a/assets/icons/gradle.svg "Gradle")|![](https://github.com/w3code/mobile-auto-project/blob/ae214a2b3f0579314588b6d42a60641563e5589a/assets/icons/selenide.svg "Selenide")|![](https://github.com/w3code/mobile-auto-project/blob/ae214a2b3f0579314588b6d42a60641563e5589a/assets/icons/jenkins.svg "Jenkins")|![](https://github.com/w3code/mobile-auto-project/blob/ae214a2b3f0579314588b6d42a60641563e5589a/assets/icons/selenoid.svg "Selenoid")|![](https://github.com/w3code/mobile-auto-project/blob/ae214a2b3f0579314588b6d42a60641563e5589a/assets/icons/allurereport.svg "Allure Report")|![](https://github.com/w3code/mobile-auto-project/blob/ae214a2b3f0579314588b6d42a60641563e5589a/assets/icons/alluretestops.svg "Allure TestOps")|![](https://github.com/w3code/mobile-auto-project/blob/ae214a2b3f0579314588b6d42a60641563e5589a/assets/icons/jira.svg "Jira")|![](https://github.com/w3code/mobile-auto-project/blob/ae214a2b3f0579314588b6d42a60641563e5589a/assets/icons/telegram.svg "Telegram")|
| :--------: |:--------: | :--------: | :--------: | :--------: | :--------: | :--------: | :--------: | :--------: | :--------: |
| Java | JUnit5 | Gradle | Selenide | Jenkins | Selenoid | Allure Report | Allure TestOps | Jira | Telegram

## Covered cases

- [x] Get started pages test
- [x] Search phrase test
- [x] Add language test
- [x] Check build version test
- [x] Disable Send Usage Data Test

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

## Jenkins

> Jenkins is an open source automation server. It helps automate 
> the parts of software development related to building, testing, 
> and deploying, facilitating continuous integration and continuous delivery.
> To run autotests in Jenkins you need choose the `deviceHost` parameter.

<p align="center">
  <img src="https://github.com/w3code/mobile-auto-project/blob/ae214a2b3f0579314588b6d42a60641563e5589a/assets/screenshots/jenkins_params.png">
</p>

After the build is finished you can view the Allure Repost for this build.

<p align="center">
  <img src="https://github.com/w3code/mobile-auto-project/blob/ae214a2b3f0579314588b6d42a60641563e5589a/assets/screenshots/jenkins_project.png">
</p>

## Allure Report

<p align="center">
  <img src="https://github.com/w3code/mobile-auto-project/blob/ae214a2b3f0579314588b6d42a60641563e5589a/assets/screenshots/allure_report_1.png">
</p>

<p align="center">
  <img src="https://github.com/w3code/mobile-auto-project/blob/ae214a2b3f0579314588b6d42a60641563e5589a/assets/screenshots/allure_report_2.png">
</p>

## Allure TestOps

### Launches

<p align="center">
  <img src="https://github.com/w3code/mobile-auto-project/blob/ae214a2b3f0579314588b6d42a60641563e5589a/assets/screenshots/allure_testops_launches.png">
</p>

### Dashboards

<p align="center">
  <img src="https://github.com/w3code/mobile-auto-project/blob/ae214a2b3f0579314588b6d42a60641563e5589a/assets/screenshots/allure_testops_dashboards.png">
</p>

### Dashboards

<p align="center">
  <img src="https://github.com/w3code/mobile-auto-project/blob/ae214a2b3f0579314588b6d42a60641563e5589a/assets/screenshots/allure_testops_testresults.png">
</p>

## Jira

> Jira used as bugtrecking system with Allure TestOps integration

<p align="center">
  <img src="https://github.com/w3code/mobile-auto-project/blob/ae214a2b3f0579314588b6d42a60641563e5589a/assets/screenshots/jira.png">
</p>

## Browserstack video

| Get started pages test | Search phrase test | Add language test | Disable Send Usage Data Test | Check build version test |
| :--------: |:--------: | :--------: | :--------: | :--------: |
| ![](https://github.com/w3code/mobile-auto-project/blob/ae214a2b3f0579314588b6d42a60641563e5589a/assets/gif/getstartedtest.gif) | ![](https://github.com/w3code/mobile-auto-project/blob/ae214a2b3f0579314588b6d42a60641563e5589a/assets/gif/searchtest.gif) | ![](https://github.com/w3code/mobile-auto-project/blob/ae214a2b3f0579314588b6d42a60641563e5589a/assets/gif/addlanguagetest.gif) | ![](https://github.com/w3code/mobile-auto-project/blob/ae214a2b3f0579314588b6d42a60641563e5589a/assets/gif/senddatatest.gif) | ![](https://github.com/w3code/mobile-auto-project/blob/ae214a2b3f0579314588b6d42a60641563e5589a/assets/gif/buildversiontest.gif) |



## Telegram notifications

<p align="center">
  <img src="https://github.com/w3code/mobile-auto-project/blob/ae214a2b3f0579314588b6d42a60641563e5589a/assets/screenshots/tlg.png">
</p>