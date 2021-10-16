import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage extends Base {
    public UserPage(){
        PageFactory.initElements(driver, this);
    }
    public @FindBy(css = "#navbarTogglerDemo01 > ul.navbar-nav.mr-auto.mt-2.mt-lg-0 > li:nth-child(3) > a")
    WebElement sectionCreateGallery;

    public void clickCreateGallery(){
        Helper.threadSleep(1);
        sectionCreateGallery.click();
    }
}
