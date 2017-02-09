package methods;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import ui.SignIn.UiSignIn;

/**
 * Created by Bilal on 08-02-2017.
 */
public class CommonMethods extends CommonAPI {
    public static String userName = System.getenv("PinterestUserName");
    public static String password = System.getenv("PinterestPassword");
    public static String profileName = "BilalWaheedCh";

    public String getProfileName(){
        return getTextByXpath("//span[@class='profileName']/text()");
    }
    public void signIn(String userName,String password){
        UiSignIn uiSignIn = PageFactory.initElements(driver, UiSignIn.class);
        uiSignIn.btnSignIn.click();
        uiSignIn.tfUsername.sendKeys(userName);
        uiSignIn.tfPassword.sendKeys(password);
        uiSignIn.btnSigninSubmit.click();
    }
    public void signIn(){
        UiSignIn uiSignIn = PageFactory.initElements(driver, UiSignIn.class);
        uiSignIn.btnSignIn.click();
        uiSignIn.tfUsername.sendKeys(userName);
        uiSignIn.tfPassword.sendKeys(password);
        uiSignIn.btnSigninSubmit.click();
        Assert.assertTrue(uiSignIn.lnkUserProfile.isDisplayed());
    }
    public void signOut(){

    }
    public void getProfilePage(){
        clickByXpath("//*[@class='usernameLink']");
    }

    public String txtBlankPasswordWarning="The password you entered is incorrect.";
    public String txtBlankUsernameWarning="Don't forget to add your email or phone number";
}
