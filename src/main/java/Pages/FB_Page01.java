package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import utils.utils;

public class FB_Page01 {
     private WebDriver driver ;
     By hover = By.xpath("//a[@title=\"Cit Vericash\"] //following-sibling::a");
     By closeButton = By.cssSelector("[data-tooltip-content=\"Remove account from this page\"]");
     By email = By.id("email");
     By pass = By.id("pass");
     By loginBtn = By.name("login");
     By profileBtn = By.cssSelector("[aria-label=\"Your profile\"] g > image");
     By logoutBtn = By.xpath("//span[.='Log out']");
     By facebookLogo = By.cssSelector("[alt=\"Facebook\"]");
     By msg = By.xpath("//h2[contains(text(), 'Facebook helps you connect and share with the people in your life.')]");

     public FB_Page01(WebDriver driver) {
          this.driver = driver;
     }

     public void enterEmailAndPass(String mail,String password) {
          utils.sendText(driver,email,mail);
          utils.sendText(driver,pass,password);
     }

     public void RemoveEmailThumbnail()
     {
          utils.visibleExplicitWait(driver,facebookLogo).click();
          new Actions(driver).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER)
                  .sendKeys(Keys.TAB).sendKeys(Keys.ENTER).sendKeys(Keys.ENTER).build().perform();

     }


     public void clickOnLoginBtn() {
          utils.click(driver,loginBtn);
     }

     public void ClickProfileButton() throws InterruptedException {
          utils.jsWait(driver);
          utils.click(driver,profileBtn);
     }

     public void clickTheLogoutButton() {
          utils.click(driver,logoutBtn);
     }

     public String checkMessage() {
          RemoveEmailThumbnail();
         return driver.findElement(msg).getText();
     }
}
