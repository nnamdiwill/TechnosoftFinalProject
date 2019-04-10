package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepdefinition.SharedSD;

public class GoogleHomePage extends BasePage {

    private By googleSignInButton = By.xpath("//ul[@class='h-c-header__cta-list header__nav--ltr']//a[contains(@class,'h-c-header__nav-li-link')][contains(text(),'Sign in')]");

    public void clickGoogleSignIn(){
        WebElement gmailPage = SharedSD.getDriver().findElement(googleSignInButton);
        clickOn(googleSignInButton);
    }
}
