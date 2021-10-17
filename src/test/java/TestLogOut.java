import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestLogOut extends Base {

    LogOutPage logOutPage;
    AllGalleriesPage allGalleriesPage;
    LoginPage loginPage;
    @Before
    public void setUpLogOut(){
        logOutPage = new LogOutPage();
        allGalleriesPage = new AllGalleriesPage();
        loginPage = new LoginPage();

        allGalleriesPage.clickLogin();
        loginPage.insertEmail("uros.mil@hotmail.com");
        loginPage.insertPassword("Urjamil55");
        loginPage.clickSubmit();
    }

    @Test
    public void userLogOut(){
        logOutPage.waitAndClickLogOut();
        String fieldEmailCssSelector = "#email";
        WebElement fieldEmail = driver.findElement(By.cssSelector(fieldEmailCssSelector));
        Assert.assertTrue(fieldEmail.isDisplayed() && fieldEmail.isEnabled());
    }
}
