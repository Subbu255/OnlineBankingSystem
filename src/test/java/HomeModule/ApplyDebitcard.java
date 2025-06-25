package HomeModule;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class ApplyDebitcard 

	WebDriver driver;

{
@Test
public void debit()
{
	System.out.println("debit card is applied");
}
@Test
public void credit()
{
	System.out.println("credit card is applied ");
	System.out.println("credit card is applied ");
	}

	@BeforeClass
    public void setup() {
        // Set the path to your ChromeDriver if not in system PATH
        // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testGoogleSearch() {
        driver.get("https://www.google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium WebDriver");
        searchBox.submit();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
