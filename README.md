![](https://github.com/w3code/mobile-auto-project/blob/ae214a2b3f0579314588b6d42a60641563e5589a/assets/icons/wikipedia_logo.svg "Wikipedia android mobile application tests")

# Wikipedia android mobile application tests

(for build 2.7.50394-alpha-2022-02-18)

## Technology stack

|![](https://github.com/w3code/mobile-auto-project/blob/ae214a2b3f0579314588b6d42a60641563e5589a/assets/icons/java.svg "Java")|![](https://github.com/w3code/mobile-auto-project/blob/ae214a2b3f0579314588b6d42a60641563e5589a/assets/icons/junit5.svg "JUnit5")|![](https://github.com/w3code/mobile-auto-project/blob/ae214a2b3f0579314588b6d42a60641563e5589a/assets/icons/gradle.svg "Gradle")|![](https://github.com/w3code/mobile-auto-project/blob/ae214a2b3f0579314588b6d42a60641563e5589a/assets/icons/selenide.svg "Selenide")|![](https://github.com/w3code/mobile-auto-project/blob/ae214a2b3f0579314588b6d42a60641563e5589a/assets/icons/jenkins.svg "Jenkins")|![](https://github.com/w3code/mobile-auto-project/blob/ae214a2b3f0579314588b6d42a60641563e5589a/assets/icons/selenoid.svg "Selenoid")|![](https://github.com/w3code/mobile-auto-project/blob/ae214a2b3f0579314588b6d42a60641563e5589a/assets/icons/allurereport.svg "Allure Report")|![](https://github.com/w3code/mobile-auto-project/blob/ae214a2b3f0579314588b6d42a60641563e5589a/assets/icons/alluretestops.svg "Allure TestOps")|![](https://github.com/w3code/mobile-auto-project/blob/ae214a2b3f0579314588b6d42a60641563e5589a/assets/icons/jira.svg "Jira")|![](https://github.com/w3code/mobile-auto-project/blob/ae214a2b3f0579314588b6d42a60641563e5589a/assets/icons/telegram.svg "Telegram")|
| :--------: |:--------: | :--------: | :--------: | :--------: | :--------: | :--------: | :--------: | :--------: | :--------: |
| Java | JUnit5 | Gradle | Selenide | Jenkins | Selenoid | Allure Report | Allure TestOps | Jira | Telegram

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

