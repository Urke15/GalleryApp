import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestLogin extends Base {

AllGalleriesPage allGalleriesPage;
LoginPage loginPage;


    @Before

    public void setUpPage() {

        allGalleriesPage = new AllGalleriesPage();
        loginPage = new LoginPage();

    }

  @Test
   public void loginSuccessfully (){
        allGalleriesPage.clickLogin();
        loginPage.insertEmail("uros.mil@hotmail.com");
        loginPage.insertPassword("Urjamil55");
        loginPage.clickSubmit();
        Helper.threadSleep(1);

        WebElement createGalleryButton = driver.findElement(By.cssSelector("#navbarTogglerDemo01 > ul.navbar-nav.mr-auto.mt-2.mt-lg-0 > li:nth-child(3) > a"));
        Assert.assertTrue(createGalleryButton.isDisplayed() && createGalleryButton.isEnabled());
    }





}
