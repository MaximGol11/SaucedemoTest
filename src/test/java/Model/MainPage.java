package Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BaseModel {

    public static final String MAIN_PAIGE_URL = "https://www.saucedemo.com/inventory.html";

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    WebElement cart;

    

    public MainPage(WebDriver driver) {
        super(driver);
    }

}
