package ui.ProfilePage;

import methods.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bilal on 08-02-2017.
 */
public class UiProfilePage extends CommonMethods {
    @FindAll({
            @FindBy(xpath = "//*[@class='ownLeftButtons']/*[position()<3]"),
            @FindBy(xpath = "//*[@class='ownLeftButtons']/div/button")
    })
    private List<WebElement> menuProfile = new ArrayList<WebElement>();

    public void getAccountSetting(){
        menuProfile.get(0).click();
    }
    public void getSendProfileButton(){
        menuProfile.get(1).click();
    }
    public void getUserMenu(){
        menuProfile.get(2).click();
    }

}
