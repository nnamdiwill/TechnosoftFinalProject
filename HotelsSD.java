package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.HotelsdotcomHomePage;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.Scanner;

public class HotelsSD {

    HotelsdotcomHomePage hdchp = new HotelsdotcomHomePage();


    private By chooseHotelBanner = By.xpath("//h1[@class='section-header-main' and contains(text(),'Start by choosing your hotel')]");

    // private By fourStarHotelList = By.xpath("//li//strong//span[@class='visuallyhidden' and contains(text(),'4')]/ancestor::ul");
    private By fourStarHotels = By.xpath("//li//strong//span[@class='visuallyhidden' and contains(text(),'4')]/ancestor::ul");

    private By fiveStarHotels = By.xpath("//li//strong//span[@class='visuallyhidden' and contains(text(),'5')]/ancestor::ul");

    private By threeStarHotels = By.xpath("//li//strong//span[@class='visuallyhidden' and contains(text(),'3')]/ancestor::ul");


    @Given("^I am on default locations search result screen.$")
    public void verifySearchResultScreen() throws InterruptedException {

        hdchp.clickOnPackageAndFlightlink();
        hdchp.clickFlightPlusHotelButton();
        hdchp.typeNyAirport();
        hdchp.highLightNyAirPorts();
        hdchp.selectAutoCompleteforNY();
        Thread.sleep(3000);
        hdchp.typeOrlando();
        hdchp.highLightOrlandoAirport();
        hdchp.selectAutoCompleteforORL();
        hdchp.selectDepartureDate();
        hdchp.selectArrivalDate();
        hdchp.clickSearchButton();
        Thread.sleep(30000);
        hdchp.clickShowMoreLink();
        // hdchp.clickShowMoreLink();
        hdchp.clickMocOrl();

        Assert.assertEquals(SharedSD.getDriver().findElement(chooseHotelBanner).getText(), "Start by choosing your hotel");

    }

    @When("^I select property class with (.*) stars.$")
    public void propertySelection(String star) {

        String starsStarts = "//li//strong//span[@class='visuallyhidden' and contains(text(),'";
        String starEnds = "')]/ancestor::ul";

        String starsHotelXpath = starsStarts + star + starEnds;

            hdchp.selectFiveStar();

    }

    @Then("^I verify system displays only (.*) star hotels on search result.$")
    public void displayOnlyProperStarClass(int numberOfStars) {



            hdchp.showStarsForHotels(numberOfStars);
            // Assert.assertTrue(true, String.valueOf(SharedSD.getDriver().findElements(fourStarHotelList).equals(fourStarHotelList)));

    }

    @Given("^I am on  my beginning default locations search result screen.$")
    public void defaultSearchScreen()throws InterruptedException{
        hdchp.clickOnPackageAndFlightlink();
        hdchp.clickFlightPlusHotelButton();
        hdchp.typeNyAirport();
        hdchp.highLightNyAirPorts();
        hdchp.selectAutoCompleteforNY();
        Thread.sleep(3000);
        hdchp.typeOrlando();
        hdchp.highLightOrlandoAirport();
        hdchp.selectAutoCompleteforORL();
        hdchp.selectDepartureDate();
        hdchp.selectArrivalDate();
        hdchp.clickSearchButton();
        Thread.sleep(30000);
        hdchp.clickShowMoreLink();
        // hdchp.clickShowMoreLink();
        hdchp.clickMocOrl();
        Thread.sleep(4000);

        Assert.assertEquals(SharedSD.getDriver().findElement(chooseHotelBanner).getText(), "Start by choosing your hotel");
    }

    @Then("^I verify system displays all hotels within 10 miles radius of airport.$")
    public void displayHotelMileage() throws InterruptedException{ //(.*) for dynamic values

        hdchp.clickOnDistanceButton();
        Thread.sleep(8000);
        hdchp.pullOutDataAboutDistanceFromHotel();
    }

    @And("^I verify Hilton Hotel is within radius$")
    public void showHiltonHotel(){

        hdchp.verifyHotelNameIsDisplayed("hilton");
    }
}
