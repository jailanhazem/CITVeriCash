package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class utils {
    public static WebElement visibleExplicitWait(WebDriver driver, By locator)
    {
      return   new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(locator) );
    }
    public static WebElement clickableExplicitWait(WebDriver driver, By locator)
    {
        return   new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(locator) );
    }
    public static WebElement findWebElement(WebDriver driver,By locator)
    {
        return driver.findElement(locator);

    }
    public static void click(WebDriver driver,By locator)
    {
        clickableExplicitWait(driver,locator).click();
    }
    public static void sendText(WebDriver driver,By locator,String text)
    {
        visibleExplicitWait(driver,locator).sendKeys(text);
    }
    public static void jsWait(WebDriver driver) throws InterruptedException {
        Thread.sleep(10000);
   //     new WebDriverWait(driver, Duration.ofSeconds(10))
     //           .until(ExpectedConditions.jsReturnsValue("return document.readyState == 'complete';"));
    }
}
