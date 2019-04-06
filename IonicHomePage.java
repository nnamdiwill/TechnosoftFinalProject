package framework.mobilePages;

import cucumber.api.PendingException;
import framework.MobileBasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class IonicHomePage extends MobileBasePage {

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Apps list']")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement appsButton;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='calendar Schedule ']")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement mainMenu;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='SKIP ']")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement skipButton;

    public boolean showMainMenu(){
        return isElementDisplayed(mainMenu);
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='menu ']")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement hamburgerButton;

    public void clickOnHamburger(){
        tapOn(hamburgerButton);
    }

    @AndroidFindBy(xpath = "//android.view.View[@resource-id='loggedOutMenu']")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement mainMenuFields;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.google.android.apps.nexuslauncher:id/icon']")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement ionicApp;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='Welcome to ICA']")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement welcomeSign;

    @AndroidFindBy(xpath = "//android.view.View/android.widget.Button[contains(@content-desc,'CONTINUE arrow forward ') and @index ='0']")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement continueButton;

    @AndroidFindBy(xpath = "//android.view.View[@index='4']")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement fourDotsToSwipe;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Go to slide 2']")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement firstDot;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Go to slide 3']")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement secondDot;


    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Go to slide 4']")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement thirdDot;

    @AndroidFindBy(xpath = "//android.view.View[@index='1']/android.widget.Button[contains(@content-desc,'options') and @index='0']")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement optionsButton;

    @AndroidFindBy(xpath = "//android.view.View[@index='7']")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement angularOption;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@content-desc,'Reset All Filters')]")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement resetAllFiltersOption;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='search']")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement searchBox;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement frameLayout;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@content-desc='Angular' and @checked='true']")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement angularEnabled;
    private boolean isAngularEnabled = false;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@content-desc='Communication' and @checked='true']")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement communicationEnabled;
    private boolean isCommunicationEnabled = false;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@content-desc='Design' and @checked='true']")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement designEnabled;
    private boolean isDesignEnabled = false;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@content-desc='Documentation' and @checked='true']")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement documentationnabled;
    private boolean isDocumentationEnabled = false;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@content-desc='Food' and @checked='true']")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement foodEnabled;
    private boolean isFoodEnabled = false;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@content-desc='Ionic' and @checked='true']")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement ionicEnabled;
    private boolean isIonicEnabled = false;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@content-desc='Navigation' and @checked='true']")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement navigationEnabled;
    private boolean isNavigationEnabled = false;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@content-desc='Services' and @checked='true']")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement servicesEnabled;
    private boolean isServicesEnabled = false;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@content-desc='Tooling' and @checked='true']")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement toolingEnabled;
    private boolean isToolingEnabled = false;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@content-desc='Workshop' and @checked='true']")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement workShopEnabled;
    private boolean isWorkshopEnabled = false;



    public boolean verifyingMainMenuFields(){
        return isElementDisplayed(mainMenuFields);

    }

    public void clickOnAppsButton(){
        tapOn(appsButton);
    }

    public void clickOnSkipButton(){
        tapOn(skipButton);
    }

    public void clickOnIonApp(){
        tapOn(ionicApp);
    }

    public boolean verifyWelcomeSign(){
        return isElementDisplayed(welcomeSign);
    }

    public void verifyingWelcomeSign(){
        getTextFromElement(welcomeSign);
    }

    public void swipingICAScreen(){
        swipeScreenHorizontally(3);
    }

    public boolean verifyContinueButton()  {
        return isElementDisplayed(continueButton);
    }

    public void verifyingContinueButton(){
        getTextFromElement(continueButton);
    }

    public String getTextfromContinueButton(){
        System.out.println(getTextFromElement(continueButton));
        return getTextFromElement(continueButton);
    }
//    public void clickOnFourDots(){
//        tapOn(fourDotsToSwipe);
//    }

    public void clickOnFirstDot(){

        tapOn(firstDot);
    }
    public void clickOnSecondDot(){

        tapOn(secondDot);
    }

    public void clickOnThirdDot(){

        tapOn(thirdDot);
    }

    public void tapOnOptionsButton(){
        tapOn(optionsButton);
    }

    public void tapAngular(){
        tapOn(angularOption);

    }
    public void clickResetAllFilters(){
        tapOn(resetAllFiltersOption);
    }

    public void clickingSearch(){
        tapOn(searchBox);
    }

    public void clickFrameWork(){
        tapOn(frameLayout);
    }

    public boolean verifyAngularEnabled(){

        if (isElementDisplayed(angularEnabled)){
            isAngularEnabled = true;
        }
        return isElementDisplayed(angularEnabled);

    }
    public boolean verifyCommunicationEnabled(){

        if(isElementDisplayed(communicationEnabled)){
            isCommunicationEnabled = true;
        }
        return isElementDisplayed(communicationEnabled);
    }

    public boolean verifyDesignEnabled(){
        if(isElementDisplayed(designEnabled)){
            isDesignEnabled = true;
        }
        return isElementDisplayed(designEnabled);
    }

    public boolean verifyDocumentationEnabled(){
        if(isElementDisplayed(documentationnabled)){
            isDocumentationEnabled = true;
        }
        return isElementDisplayed(documentationnabled);
    }

    public boolean verifyFoodEnabled(){
        if(isElementDisplayed(foodEnabled)){
            isFoodEnabled = true;
        }
        return isElementDisplayed(foodEnabled);
    }

    public boolean verifyIonicEnabled(){
        if(isElementDisplayed(ionicEnabled)){
            isIonicEnabled = true;
        }
        return isElementDisplayed(ionicEnabled);
    }

    public boolean verifyNavigationEnabled(){
        if(isElementDisplayed(navigationEnabled)){
            isNavigationEnabled = true;
        }
        return isElementDisplayed(navigationEnabled);

    }

    public boolean verifyServicesEnabled(){
        if(isElementDisplayed(servicesEnabled)){
            isServicesEnabled = true;
        }
        return isElementDisplayed(servicesEnabled);
    }

    public boolean verifyToolingEnabled(){
        if(isElementDisplayed(toolingEnabled)){
            isToolingEnabled = true;
        }
        return isElementDisplayed(toolingEnabled);
    }

    public boolean verifyWorkshopEnabled(){
        if(isElementDisplayed(workShopEnabled)){
            isWorkshopEnabled = true;
        }
        return isElementDisplayed(workShopEnabled);
    }

public void clickOnContinueButton(){
        tapOn(continueButton);
}
}
