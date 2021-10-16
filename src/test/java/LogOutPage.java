import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage extends Base {

    public LogOutPage (){
        PageFactory.initElements(driver, this);
    }
    public @FindBy(xpath = "//*[@id=\"navbarTogglerDemo01\"]/ul[2]/li[3]/a")
    WebElement buttonLogOut;

    public void clickLogOut(){
        buttonLogOut.click();

    }

}
