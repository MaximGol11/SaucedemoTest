package Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseModel {

    public static final String LOGIN_URL = "https://www.saucedemo.com";

    @FindBy (id = "user-name")
    WebElement login;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "login-button")
    WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getLogin() {
        return login;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public MainPage gotoMainPage() {
        loginButton.click();
        return new MainPage(getDriver());
    }
}
