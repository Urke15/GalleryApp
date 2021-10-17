import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LogOutPage extends Base {

    public LogOutPage (){
        PageFactory.initElements(driver, this);
    }
    public static final String logOutButtonCssSelector = "#navbarTogglerDemo01 > ul.navbar-nav.ml-auto.mt-2.mt-lg-0 > li:nth-child(3) > a";
    public @FindBy(css = logOutButtonCssSelector)
    WebElement buttonLogOut;

    public void waitAndClickLogOut(){
        buttonLogOut = wdwait.until(ExpectedConditions.elementToBeClickable(By. cssSelector(logOutButtonCssSelector)));
        buttonLogOut.click();
    }
}
