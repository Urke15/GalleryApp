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
        Helper.threadSleep(1);
        logOutPage.clickLogOut();
        Helper.threadSleep(1);
        WebElement createGalleryButton = driver.findElement(By.cssSelector("#navbarTogglerDemo01 > ul.navbar-nav.mr-auto.mt-2.mt-lg-0 > li:nth-child(3) > a"));
        Assert.assertFalse(createGalleryButton.isDisplayed() || createGalleryButton.isEnabled());
    }
}
