import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateGalleryPage extends Base {

    public CreateGalleryPage(){

        PageFactory.initElements(driver, this);
    }


    public @FindBy(id="title")
    WebElement fieldTitle;

    public @FindBy(id="description")
    WebElement fieldDescription;

    public @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div/div/form/div[3]/div/div/input")
    WebElement fieldImages;

    public @FindBy (css ="#app > div.container > div > div > form > button:nth-child(4)")
    WebElement buttonSubmit;


    public void insertTitle(String title){
        fieldTitle.clear();
        fieldTitle.sendKeys(title);
    }

    public void insertDescription(String description){
        fieldDescription.clear();
        fieldDescription.sendKeys(description);
    }
    public void insertImage(String image){
        fieldImages.clear();
        fieldImages.sendKeys(image);
    }
    public void pressSubmit(){
        buttonSubmit.click();
}

}
