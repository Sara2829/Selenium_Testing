package part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstSeleniumTest {

    WebDriver driver; // Java interface for controlling a Browser

    // Testng annotation for running before the class builds up
    @BeforeClass
    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--lang=en"); //for language preferred
        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterClass

    public void tearDown(){
//        driver.quit();
    }

    //Creating a Java function to test the logging into the website

    @Test
    public void testLoggingIntoApplication() throws InterruptedException {
        Thread.sleep(2000);

        // Steps to implement the test function
        // First find the element using findElement(By.something("name))
        //Next perform the desired action such as inputting text or something
        WebElement username = driver.findElement(By.name("username"));

        username.sendKeys("Admin");

        var password = driver.findElement(By.name("password"));

        password.sendKeys("admin123");

        driver.findElement(By.tagName("button")).click();
    }


}
