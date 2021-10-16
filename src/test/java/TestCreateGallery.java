import org.junit.Before;
import org.junit.Test;

public class TestCreateGallery extends Base {

    CreateGalleryPage createGalleryPage;
    AllGalleriesPage allGalleriesPage;
    LoginPage loginPage;
    UserPage userPage;
    @Before

    public void setUpGalleryPage() {
        createGalleryPage = new CreateGalleryPage();
        allGalleriesPage = new AllGalleriesPage();
        loginPage = new LoginPage();
        userPage = new UserPage();

        allGalleriesPage.clickLogin();
        loginPage.insertEmail("uros.mil@hotmail.com");
        loginPage.insertPassword("Urjamil55");
        loginPage.clickSubmit();


    }

    @Test

    public void creatingGallerySuccessfully(){
        userPage.clickCreateGallery();
        createGalleryPage.insertTitle("My autumn-Uros M.");
        createGalleryPage.insertDescription("Favourite autumn pictures 2021");
        createGalleryPage.insertImage("http://static1.everypixel.com/ep-libreshot/0242/0259/3015/99837/2420259301599837355.jpg");
        createGalleryPage.pressSubmit();
        //Maybe assert?
    }
}