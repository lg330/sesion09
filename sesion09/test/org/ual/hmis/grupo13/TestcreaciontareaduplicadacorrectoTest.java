// Generated by Selenium IDE
package org.ual.hmis.grupo13;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

public class TestcreaciontareaduplicadacorrectoTest extends Controlador {
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;

	@Before
	public void setUp() {
		// Browser selector
		//int browser = 0; // 0: firefox, 1: chrome, ...
		Boolean headless = false;
		
		switch (browser) {
		case 0: // firefox
			// Firefox
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			FirefoxOptions firefoxOptions = new FirefoxOptions();
			if (headless) firefoxOptions.setHeadless(headless);
			driver = new FirefoxDriver(firefoxOptions);
			
			break;
			
		case 1: // chrome
			//Chrome
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeOptions chromeOptions = new ChromeOptions();
			if (headless) chromeOptions.setHeadless(headless);
			chromeOptions.addArguments("window-size=1920,1080");
			driver = new ChromeDriver(chromeOptions);
			
			break;
			
		default:
			fail("Please select a browser");
			break;
		}
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void testcreaciontareaduplicadacorrecto() {
		// Test name: test-creacion-tarea-duplicada-correcto
		// Step # | name | target | value
		// 1 | open | https://msdocs-core-sql-2023-ags000.azurewebsites.net/ |
		driver.get("https://msdocs-core-sql-2023-ags000.azurewebsites.net/");
		// 2 | setWindowSize | 886x792 |
		driver.manage().window().setSize(new Dimension(1080, 824));
		// 3 | click | linkText=Create New |
		driver.findElement(By.linkText("Create New")).click();
		// 4 | click | id=Description |
		driver.findElement(By.id("Description")).click();
		// 5 | type | id=Description | Comprar agua
		driver.findElement(By.id("Description")).sendKeys("Comprar agua");
		// 6 | click | id=CreatedDate |
		driver.findElement(By.id("CreatedDate")).click();
		// 7 | type | id=CreatedDate | 2023-06-08
		driver.findElement(By.id("CreatedDate")).sendKeys("2023-06-08");
		// 8 | click | css=.btn |
		driver.findElement(By.cssSelector(".btn")).click();
		// 9 | click | linkText=Create New |
		driver.findElement(By.linkText("Create New")).click();
		// 10 | click | id=Description |
		driver.findElement(By.id("Description")).click();
		// 11 | type | id=Description | Comprar agua
		driver.findElement(By.id("Description")).sendKeys("Comprar agua");
		// 12 | click | id=CreatedDate |
		driver.findElement(By.id("CreatedDate")).click();
		// 13 | type | id=CreatedDate | 2023-06-08
		driver.findElement(By.id("CreatedDate")).sendKeys("2023-06-08");
		// 14 | click | css=.btn |
		driver.findElement(By.cssSelector(".btn")).click();
		// 15 | click | css=tr:nth-child(1) > td:nth-child(1) |
		driver.findElement(By.cssSelector("tr:nth-child(1) > td:nth-child(1)")).click();
		// 16 | assertElementPresent | css=tr:nth-child(1) > td:nth-child(1) |
		{
			List<WebElement> elements = driver.findElements(By.cssSelector("tr:nth-child(1) > td:nth-child(1)"));
			assert (elements.size() > 0);
		}
		// 17 | click | css=tr:nth-child(1) > td:nth-child(2) |
		driver.findElement(By.cssSelector("tr:nth-child(1) > td:nth-child(2)")).click();
		// 18 | assertElementPresent | css=tr:nth-child(1) > td:nth-child(2) |
		{
			List<WebElement> elements = driver.findElements(By.cssSelector("tr:nth-child(1) > td:nth-child(2)"));
			assert (elements.size() > 0);
		}
		// 19 | click | css=tr:nth-child(2) > td:nth-child(1) |
		driver.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(1)")).click();
		// 20 | click | css=tr:nth-child(2) > td:nth-child(1) |
		driver.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(1)")).click();
		// 21 | click | css=.container:nth-child(2) |
		driver.findElement(By.cssSelector(".container:nth-child(2)")).click();
		// 22 | click | css=tr:nth-child(2) > td:nth-child(1) |
		driver.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(1)")).click();
		// 23 | click | css=tr:nth-child(2) > td:nth-child(1) |
		driver.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(1)")).click();
		// 24 | assertElementPresent | css=tr:nth-child(2) > td:nth-child(1) |
		{
			List<WebElement> elements = driver.findElements(By.cssSelector("tr:nth-child(2) > td:nth-child(1)"));
			assert (elements.size() > 0);
		}
		// 25 | click | css=tr:nth-child(2) > td:nth-child(2) |
		driver.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(2)")).click();
		// 26 | assertElementPresent | css=tr:nth-child(2) > td:nth-child(2) |
		{
			List<WebElement> elements = driver.findElements(By.cssSelector("tr:nth-child(2) > td:nth-child(2)"));
			assert (elements.size() > 0);
		}
		// 27 | click | linkText=Delete |
		driver.findElement(By.linkText("Delete")).click();
		// 28 | click | css=.btn |
		driver.findElement(By.cssSelector(".btn")).click();
		// 29 | click | linkText=Delete |
		driver.findElement(By.linkText("Delete")).click();
		// 30 | click | css=.btn |
		driver.findElement(By.cssSelector(".btn")).click();
	}
}
