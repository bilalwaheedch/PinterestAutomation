package ui.AccountSettings;

import methods.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import ui.ProfilePage.UiProfilePage;

/**
 * Created by Bilal on 08-02-2017.
 */
public class UiAccountSettings extends CommonMethods {
    @FindBy(xpath = ".//*[@id='accountBasicsEmail']")
    public WebElement tfAccountBasicsEmail;
    public void assertPage(){
        Assert.assertEquals(userName,tfAccountBasicsEmail.getAttribute("value"));
    }
    public void getPage(){
        signIn();
        getProfilePage();
        UiProfilePage uiProfilePage = PageFactory.initElements(driver,UiProfilePage.class);
        uiProfilePage.getAccountSetting();
    }
}
