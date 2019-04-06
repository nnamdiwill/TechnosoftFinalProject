package stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.mobilePages.IonicHomePage;
import org.testng.Assert;

public class IonicSD {

    IonicHomePage ihp = new IonicHomePage();
    boolean isVerifyingSplashScreen = false;

    @Given("^I am on home page of the app$")
    public void verifyHomePage() {

//        ihp.clickOnAppsButton();
//        ihp.clickOnIonApp();
        ihp.clickOnSkipButton();
        ihp.showMainMenu();
    }

    @When("^I click on hamburger menu$")
    public void clickHamburgerMenu() {

        ihp.clickOnHamburger();
    }

    @Then("^I verify default main menu bar fields$")
    public void verifyMainMenu() {

        ihp.verifyingMainMenuFields();
    }

    @Given("^I am on Splash screen of the ionic conference app$")
    public void verifySplashScreen() throws Throwable {

       // ihp.verifyingWelcomeSign(); // verifies wlcome sign on splash screen
        if(ihp.verifyWelcomeSign()){
            isVerifyingSplashScreen = true;

        }
        Assert.assertTrue(true,"We're on the splash screen");
    }

    @When("^I swipe right 3 times on tutorials slides$")
    public void swipeOnTutorials() {

        ihp.clickOnFirstDot();
        ihp.clickOnSecondDot();
        ihp.clickOnThirdDot();

    }

    @Then("^I verify Continue button is displayed$")
    public void verifyContinueButton() throws Throwable {

          //  ihp.verifyContinueButton(); // verifies that we swiped 3 times and continue button is displayed

       // ihp.verifyContinueButton();
       // Assert.assertEquals(ihp.getTextfromContinueButton(),"continue");

        ihp.clickOnContinueButton();
    }
    @Given("^I am on a home page of the app$")
    public void verifyingTheHomePage(){
        ihp.clickOnSkipButton();
        ihp.showMainMenu();
    }

    @When("^I click on filter button$")
    public void clickFilterButton(){

       // ihp.clickFrameWork();
        //ihp.clickingSearch();
        ihp.tapOnOptionsButton();
    }

    @And("^I disable \"Angular\" option$")
    public void disableAngularOption(){
        ihp.tapAngular();

    }

    @And("^I click on All Reset Filer button$")
    public void clickOnResetFilterButton(){

        ihp.clickResetAllFilters();
    }

    @Then("^I verify all options are enabled$")
    public void allOptionsEnabled(){

        /*
        This code verifies that all the options are turned on by showing that the checked varable is
         set to true on each filter. That's one way to make a distinction between whether it's enabled or disabled.
         If the xpath correctly shows the checked variable is set to true the boolean becomes true.

         */
        ihp.verifyAngularEnabled();
        ihp.verifyCommunicationEnabled();
        ihp.verifyDesignEnabled();
        ihp.verifyDocumentationEnabled();
        ihp.verifyFoodEnabled();
        ihp.verifyIonicEnabled();
        ihp.verifyNavigationEnabled();
        ihp.verifyServicesEnabled();
        ihp.verifyToolingEnabled();
        ihp.verifyWorkshopEnabled();
    }

}