import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllGalleriesPage extends Base {

public AllGalleriesPage (){

    PageFactory.initElements(driver, this);
}

public @FindBy (css = "#navbarTogglerDemo01 > ul.navbar-nav.ml-auto.mt-2.mt-lg-0 > li:nth-child(1) > a")
    WebElement buttonLogin;

public void clickLogin(){
    buttonLogin.click();

}


}
