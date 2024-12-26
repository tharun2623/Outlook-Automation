import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class OutLook_Selenium {
    
    /**
     * @param args
     */
    /**
     * @param args
     */
    @SuppressWarnings("deprecation")
	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "F:/chromedriver/chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Use FluentWait for more robust waiting
        Wait<WebDriver> wait = new FluentWait<>(driver)
            .withTimeout(Duration.ofSeconds(30))
            .pollingEvery(Duration.ofSeconds(1))
            .ignoring(NoSuchElementException.class);

        try {
            System.out.println("Navigating to the login page...");
            driver.get("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=156&ct=1721819764&rver=7.0.6738.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f%3fnlp%3d1%26cobrandid%3dab0455a0-8d03-46b9-b18b-df2f57b9e44c%26culture%3den-us%26country%3dus%26RpsCsrfState%3d10592c4b-fcf5-d72d-41eb-8cfe389777e3&id=292841&aadredir=1&CBCXT=out&lw=1&fl=dob%2cflname%2cwld&cobrandid=ab0455a0-8d03-46b9-b18b-df2f57b9e44c");

            System.out.println("Waiting for email input field...");
            WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("i0116")));
            emailField.sendKeys("Tharun.Prasaath@rockwellautomation.com");
            System.out.println("Email input field entered");
            
            System.out.println("Clicking Next button...");
            WebElement nextBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("idSIButton9")));
            nextBtn.click();
            System.out.println("Next button clicked");

            System.out.println("Waiting for email input field...");
            WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("i0118")));
            passwordField.sendKeys("Ducatipanigalev4s!");
            System.out.println("Password input field entered");
            
            System.out.println("Clicking Sign in button...");
            WebElement signinBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("idSIButton9")));
            signinBtn.click();
            System.out.println("Sign In button clicked");
            
            System.out.println("Waiting for New mail button...");
            WebElement newMailBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@aria-label='New mail']")));
            System.out.println("Clicking New mail button...");
            newMailBtn.click();

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            if (!newMailBtn.isSelected()) {
                System.out.println("Clicking New mail button with JavaScript...");
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].click();", newMailBtn);
                System.out.println("New mail button clicked.");
            } else {
                System.err.println("New mail button is not clicked");
            }

            System.out.println("Waiting for To input field...");
            WebElement toField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-label=\"To\"][1]")));
            toField.sendKeys("Gopinath.Selvam@rockwellautomation.com");

            if (!newMailBtn.isSelected()) {
                System.out.println("Clicking New To input with JavaScript...");
                JavascriptExecutor jsTo = (JavascriptExecutor) driver;
                jsTo.executeScript("arguments[0].click();", toField);
                System.out.println("To input clicked.");
            } else {
                System.err.println("To input not clicked.");
            }

            System.out.println("Waiting for subject field...");
            WebElement toSubject = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@class, 'ms-TextField-field') and contains(@class, 'ADopl') and contains(@class, 'field-383')]")));
            toSubject.sendKeys("Automation Test");

            if (!newMailBtn.isSelected()) {
                System.out.println("Clicking New Subject input with JavaScript...");
                JavascriptExecutor jsSubject = (JavascriptExecutor) driver;
                jsSubject.executeScript("arguments[0].click();", toSubject);
                System.out.println("Subject input clicked.");
            } else {
                System.err.println("Subject input not clicked.");
            }

            System.out.println("Waiting for context field...");
            WebElement context = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'dFCbN') and contains(@class, 'dPKNh') and contains(@class, 'z8tsM') and contains(@class, 'DziEn')]")));
            context.sendKeys("Automation is working fine and wants to let you know that,'En iniya tamil makkale ungal paasathirkuriya BharathiRaja!'");

            if (!newMailBtn.isSelected()) {
                System.out.println("Clicking New Context input with JavaScript...");
                JavascriptExecutor jsContext = (JavascriptExecutor) driver;
                jsContext.executeScript("arguments[0].click();", context);
                System.out.println("Context input clicked.");
            } else {
                System.err.println("Context input not clicked.");
            }

            System.out.println("Waiting for Send button...");
            WebElement sendBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(@aria-label, 'Send')]")));
            System.out.println("Clicking Send button...");
            sendBtn.click();

            if (!sendBtn.isSelected()) {
                System.out.println("Clicking Send button with JavaScript...");
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].click();", sendBtn);
                System.out.println("Send button clicked.");
            } else {
                System.err.println("Send button is not clicked");
            }

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                Thread.sleep(5000); // Wait for 5 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Quitting the driver...");
            driver.quit();
        }
    }
}