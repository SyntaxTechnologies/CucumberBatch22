package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class LoginPage extends CommonMethods {


    @FindBy(id = "txtUsername")
    public WebElement usernameField;

    @FindBy(id = "txtPassword")
    public WebElement passwordField;

    @FindBy(id = "btnLogin")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id='spanMessage']")
    public WebElement errorMessage;



    public LoginPage(){
        //selenium page factory initialize all the elements of the class
        PageFactory.initElements(driver, this);
    }


}
