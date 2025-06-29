
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ECommerceTest {
    public static void main(String[] args) throws InterruptedException {
        // Set path to chromedriver
        System.setProperty("webdriver.chrome.driver", "C:\\seleniumWebdriver\\chromeDriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        try {
            // Step 1: Open site and click login
            driver.get("https://automationteststore.com/");
            driver.findElement(By.linkText("Login or register")).click();

            // Step 2: Enter credentials and login
            driver.findElement(By.name("loginname")).sendKeys("ajitmohapatra");
            driver.findElement(By.name("password")).sendKeys("Ajit@1234");
            driver.findElement(By.cssSelector("button[title='Login']")).click();

            // Step 3: Wait and verify login
            Thread.sleep(2000);
            String accountText = driver.findElement(By.cssSelector(".heading1")).getText();
            if (accountText.contains("My Account")) {
                System.out.println("Login successful.");
            } else {
                System.out.println("Login failed.");
                return;
            }

            // Step 4: Select a product
            driver.findElement(By.linkText("Skinsheen Bronzer Stick")).click();

            // Step 5: Add to cart
            driver.findElement(By.cssSelector("a.cart")).click();
            System.out.println("Product added to cart.");

            // Step 6: Logout
            driver.findElement(By.linkText("Logout")).click();
            System.out.println("Logged out successfully.");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            Thread.sleep(2000);
            driver.quit();
        }
    }
}
