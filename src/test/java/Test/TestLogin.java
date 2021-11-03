package Test;

import Model.LoginPage;
import Model.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import static Model.LoginPage.LOGIN_URL;

public class TestLogin extends BaseTest{

    @Test
    public void testLogin() {
        LoginPage loginPaige = new LoginPage(getDriver());
        loginPaige.getDriver().get(LOGIN_URL);
        loginPaige.getLogin().sendKeys("standard_user");
        loginPaige.getPassword().sendKeys("secret_sauce");

        MainPage mainPage = loginPaige.gotoMainPage();
        Assert.assertEquals(mainPage.getDriver().getCurrentUrl(), MainPage.MAIN_PAIGE_URL);

    }

}
