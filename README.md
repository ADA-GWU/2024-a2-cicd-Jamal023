
This repository contains a Spring Boot application for managing student records. Below are the details of implemented test cases to ensure system functionality.

Test Cases

1. Total Courses Validation
Description: Validates the consistency of the total number of courses.
Test Method: JUnit test.
Expected Outcome: Total number of courses matches the count of added courses.

2. Credit Calculation Accuracy
Description: Ensures correctness of the total credits calculation.
Test Method: JUnit test.
Expected Outcome: Calculated total credits equals sum of credits assigned to all courses.

3. User Creation Validation
Description: Verifies successful creation of a new user.
Test Method: Automated UI test using Selenium WebDriver.
Test Steps:
Navigate to the user creation page.
Fill in user details including student ID, first name, last name, and email.
Submit the form.
Expected Outcome: New user created successfully and added to the system.

4. User Information Display Check
Description: Checks if created user's information is displayed correctly on user list page.
Test Method: Automated UI test using Selenium WebDriver.
Test Steps:
Navigate to the user list page.
Search for the created user by first and last name.
Expected Outcome: Created user's information (including student ID, first name, last name, and email) visible on user list page.
