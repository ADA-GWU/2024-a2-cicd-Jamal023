package ada.edu.demo.webtest;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals; // Import assertion method

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class WebInterfaceTests {

	@Autowired
	private WebDriver webDriver;

	@LocalServerPort
	private int port;

	@Test
	@Order(1)
	@DisplayName("Create a user")
	public void CreateUser() {
		// Existing test method
	}

	@Test
	@Order(2)
	@DisplayName("Check the created user")
	public void CheckUser() {
		// Existing test method
	}

	@Test
	@Order(3)
	@DisplayName("Navigate to another page")
	public void testNavigationToAnotherPage() {
		// Navigate to another page
		webDriver.get("http://localhost:" + port + "/another-page");

		// Verify if the page title is as expected
		String pageTitle = webDriver.getTitle();
		assertEquals("Another Page Title", pageTitle);
	}
}
