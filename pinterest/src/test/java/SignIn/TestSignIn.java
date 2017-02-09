package SignIn;

import methods.CommonMethods;
import org.testng.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ui.SignIn.UiSignIn;

/**
 * Created by Bilal on 08-02-2017.
 */
public class TestSignIn extends CommonMethods {
    @Test
    public void testSignInCorrectCredentials(){
        UiSignIn uiSignIn = PageFactory.initElements(driver, UiSignIn.class);
//        uiSignIn.btnSignIn.click();
//        uiSignIn.tfUsername.sendKeys(userName);
//        uiSignIn.tfPassword.sendKeys(password);
//        uiSignIn.btnSigninSubmit.click();
        signIn(userName,password);
        Assert.assertTrue(uiSignIn.lnkUserProfile.isDisplayed());
//        Assert.assertEquals(profileName,getProfileName());
    }
    @Test
    public void testSignInBlankPassword(){
        UiSignIn uiSignIn = PageFactory.initElements(driver, UiSignIn.class);
        signIn(userName,"");
        Assert.assertTrue(uiSignIn.txtToolTip.getText().equals(txtBlankPasswordWarning));
    }

}
