package Pages;


import Utilis.CommenMethods;
import Utilis.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommenMethods {

    @FindBy(id="txtStudentID")
    public WebElement StudentId;

    @FindBy(id="txtPassword")
    public WebElement Password;

    @FindBy(id="ibtnLogin")
    public WebElement SignIn;

    @FindBy(xpath="findone")
    public WebElement dropdown;

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }
    public void login(){
        sendText(StudentId, ConfigReader.getPropertyValue("username"));
        sendText(Password,ConfigReader.getPropertyValue("password"));
        finallyclick(SignIn);
    }

}
