package Pages;

import Utilis.CommenMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignOutPage extends CommenMethods {
    @FindBy( xpath="//img[@class='m--img-rounded m--marginless m--img-centered']")
    public  WebElement Image;

    @FindBy(id="lnkLogout")
    public WebElement SignOutButton;

    public SignOutPage(){
        PageFactory.initElements(driver,this);
    }

    public void SignOut(){
        finallyclick(Image);
        finallyclick(SignOutButton);
    }


}
