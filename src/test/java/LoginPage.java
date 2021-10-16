import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base {

public LoginPage(){

    PageFactory.initElements(driver, this);
}

public @FindBy(id="email")
    WebElement fieldEmail;

public @FindBy(id="password")
    WebElement fieldPassword;

public @FindBy(css = ".btn.btn-custom")
    WebElement buttonSubmit;
    

public void insertEmail(String email){
    fieldEmail.sendKeys(email);
}
public void insertPassword(String password){
    fieldPassword.sendKeys(password);

}
public void clickSubmit(){
    buttonSubmit.click();
}

}
