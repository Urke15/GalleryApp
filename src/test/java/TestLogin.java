import org.junit.Before;
import org.junit.Test;

public class TestLogin extends Base {

AllGalleriesPage firstClass;
LoginPage mainPage;


    @Before

    public void setUpPage() {

        firstClass = new AllGalleriesPage();
        mainPage = new LoginPage();

    }

  @Test
   public void loginSuccessfully (){

firstClass.clickLogin();
mainPage.insertEmail("uros.mil@hotmail.com");
mainPage.insertPassword("Urjamil55");
mainPage.clickSubmit();



    }


}
