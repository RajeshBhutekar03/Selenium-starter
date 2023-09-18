package demo;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.Dimension;
//Selenium Imports
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
///


public class TestCases {
    ChromeDriver driver;
    public TestCases()
    {
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    
    public  void testCase01(){
        driver.findElementByName("q").click();
        driver.findElementByName("q").sendKeys("amazon");
        driver.findElementByXPath("//div[@class='lJ9FBc']//input[@name='btnK']").click();
        boolean isDisplyed= driver.findElementByLinkText("Amazon.in").isDisplayed();
        System.out.println(isDisplyed);
    }

    public  void testCase02(){
        driver.findElementByName("q").click();
        driver.findElementByName("q").sendKeys("amazon");
        driver.findElementByXPath("//div[@class='lJ9FBc']//input[@name='btnK']").click();
        boolean isDisplyed= driver.findElementByLinkText("Amazon.in").isDisplayed();
        System.out.println(isDisplyed);
    }

    public void testCase03(){
        driver.get("https://www.linkedin.com/");

        driver.findElementByXPath("//input[@id='session_key']").sendKeys("xyz");
        driver.findElementByXPath("//input[@id='session_password']").sendKeys("xyz");
        driver.findElementByXPath("//button[@type='submit']").click();

        // who viewed your  Profile 
        System.out.println("who viewed your  Profile "+  driver.findElementByXPath("//h1[@id='ember654']"));

        driver.findElementByXPath("//span[text()='Create a post']").click();
       driver.findElementByXPath("//button[text()='Post visibility options')]").click();
       driver.findElementByXPath("//span[text()='Connections only']").click();
       driver.findElementByXPath("//div[@class='share-box-footer_main-actions']/button/span[text()='save']").click();
       driver.findElementByXPath("//div[@role='textbox']").sendKeys("Hi this Rajesh Vishnu ");
       driver.findElementByXPath("//*[text()='Post']").click();
       boolean isDisplaye=driver.findElementByXPath("//*[text()='Post successful']").isDisplayed();
       


    }

    public void testCase04(){
        driver.get("https://www.google.com/");

        WebElement search_bar=driver.findElementByName("q");
        search_bar.sendKeys("csk");

        driver.findElementByXPath("(//input[@value='Google Search'])[1]").click();

        Dimension links=driver.findElementByXPath("//a[conains(@href,'csk')]").getSize();

        System.out.println("link of counts :"+links);
        
    }

}
