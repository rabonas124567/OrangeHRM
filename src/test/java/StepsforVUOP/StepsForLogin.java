package StepsforVUOP;

import Utilis.CommenMethods;
import Utilis.ConfigReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static Utilis.CommenMethods.sendText;

public class StepsForLogin extends CommenMethods {

    @When("user enters the valid username and password")
    public void user_enters_the_valid_username_and_password() {
        sendText( loginPage.StudentId, ConfigReader.getPropertyValue("username"));
        sendText(loginPage.Password,ConfigReader.getPropertyValue("password"));
    }

    @When("click on login button")
    public void click_on_login_button() {
             finallyclick(loginPage.SignIn);
    }

    @Then("user is successfully logged in")
    public void user_is_successfully_logged_in() {
        signOutPage.SignOut();
        System.out.println("Test is passed");
    }

}
