package ui.SignIn;

import methods.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Bilal on 08-02-2017.
 */
public class UiSignIn extends CommonMethods {
    @FindBy(xpath = "//*[@class='lightGrey']")
    public WebElement btnSignIn;
    @FindBy(xpath = "//input[@aria-label='Email or phone number']")
    public WebElement tfUsername;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement tfPassword;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement btnSigninSubmit;
    @FindBy(xpath = "//*[@class='usernameLink']")
    public WebElement lnkUserProfile;
    @FindBy(xpath = "//div[@class='Tooltip_message']")
    public WebElement txtToolTip;
}
