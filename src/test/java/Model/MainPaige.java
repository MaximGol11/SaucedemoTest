package Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPaige extends BaseModel {

    public static final String MAIN_PAIGE_URL = "https://www.saucedemo.com/inventory.html";

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    WebElement cart;

    

    public MainPaige(WebDriver driver) {
        super(driver);
    }

}
