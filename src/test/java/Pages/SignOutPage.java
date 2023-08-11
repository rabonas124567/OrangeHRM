package Pages;

import Utilis.CommenMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignOutPage extends CommenMethods {
    @FindBy( id="welcome")
    public  WebElement Image;

    @FindBy(xpath="//a[text()='Logout']")
    public WebElement SignOutButton;

    public SignOutPage(){
        PageFactory.initElements(driver,this);
    }

    public void SignOut(){
        finallyclick(Image);
        finallyclick(SignOutButton);
    }


}
