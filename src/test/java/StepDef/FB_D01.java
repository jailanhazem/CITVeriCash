package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Pages.FB_Page01;

import static org.junit.Assert.*;

public class FB_D01 {

    @When("user enter email and pass")
    public void userEnterEmailAndPass() {
        new FB_Page01(Hooks.driver).enterEmailAndPass("citvericashtest@outlook.com","citvericashtest123.");
    }


    @And("Click on login Btn")
    public void clickOnLoginBtn()  {
        new FB_Page01(Hooks.driver).clickOnLoginBtn();
    }




    @And("Click profile button")
    public void ClickProfileButton() throws InterruptedException {
        new FB_Page01(Hooks.driver).ClickProfileButton();
    }


    @When("click the logout button")
    public void clickTheLogoutButton()   {
        new FB_Page01(Hooks.driver).clickTheLogoutButton();
    }




    @Then("check {string} message")
    public void checkMessage(String arg0)   {
            assertEquals( new FB_Page01(Hooks.driver).checkMessage(), "Facebook helps you connect and share with the people in your life.");
        }




}

