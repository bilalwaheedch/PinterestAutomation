package ProfilePage;

import methods.CommonMethods;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ui.AccountSettings.UiAccountSettings;
import ui.ProfilePage.UiProfilePage;
import ui.SignIn.UiSignIn;

/**
 * Created by Bilal on 08-02-2017.
 */
public class ProfileMenusTest extends CommonMethods {
    public UiProfilePage uiProfilePage(){
        signIn();
        getProfilePage();
        return PageFactory.initElements(driver,UiProfilePage.class);
    }
    @Test
    public void testProfileSettings(){
        uiProfilePage().getAccountSetting();
        UiAccountSettings uiAccountSettings = PageFactory.initElements(driver,UiAccountSettings.class);
        uiAccountSettings.assertPage();
    }
}
