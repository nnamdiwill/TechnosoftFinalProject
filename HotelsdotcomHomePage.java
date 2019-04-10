package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import stepdefinition.SharedSD;

import java.util.ArrayList;
import java.util.List;

public class HotelsdotcomHomePage extends BasePage {

private By packageAndFlightLink = By.xpath("//a[contains(text(),'Packages & Flights')]");

private By originBox = By.xpath("//input[@placeholder='City or airport' and @data-airport_code_element='package-origin-hp-package-airport_code']");

private By destinationBox = By.xpath("//input[@id='package-destination-hp-package' and @data-city_element='package-destination-hp-package-city']");

private  By nyAirportSelection = By.xpath("//ul[@class='results']//div[@class='display-group-results']//li");

//private By clickNY = By.xpath("//a[@class='details' and @data-value='New York (NYC-All Airports)']");

   // private By clickNY = By.xpath("//li[@class='results-item']//a[@class='details' and @data-value='New York (NYC-All Airports)']");

    private By clickNY = By.xpath("//a[@id='aria-option-0' and @data-value='New York (NYC-All Airports)']");
private By orlandoAirportSelection = By.xpath("//ul//div//li[@class='results-item']");

private By clickOrlando = By.xpath("//a[@data-value='Orlando, FL (ORL-All Airports)']");

private By departingDateBox = By.xpath("//input[@id='package-departing-hp-package' and @placeholder='mm/dd/yyyy']");

private By arrivalDateBox = By.xpath("//input[@id='package-returning-hp-package' and @placeholder='mm/dd/yyyy']");

private By departureDate = By.xpath("//tr//td//button[@class='datepicker-cal-date' and @data-month='3' and @data-day='12']");

private By arrivalDate = By.xpath("//tr//td//button[@class='datepicker-cal-date' and @data-month='3' and @data-day='19']");

private By searchButton = By.xpath("//section[contains(@class,'package-form-fields')]//button[contains(@type,'submit')]");

String hotelsHotelChoicePage = "https://travel.hotels.com/Hotel-Search?packageType=fh&searchProduct=hotel&c=9f13fc81-9ce0-42cc-b054-eb659c820c27&adults=2&originId=6139058&ftla=NYC&destination=Orlando,+FL,+United+States+(ORL-All+Airports)&destinationId=6139113&ttla=ORL&startDate=4/12/2019&endDate=4/19/2019&sort=recommended&tripType=ROUND_TRIP&misId=02aa608b-ee86-48ed-b832-593dac10bcbd" ;

private By showMoreLink = By.xpath("//div[@id='neighborhoodContainer' ]//span[@class='more' and contains(text(),'Show more')]");

private By mcoORLButton = By.xpath("//input[@id='neighborhood19']");

private By flightPlusHotelButton = By.xpath("//button[@id='tab-package-tab-hp']//span[@class='uitk-icon uitk-icon-flights']");

private By fiveStarButton = By.xpath("//input[@value='50']");

private By hotelLinks = By.xpath("//a[@class='flex-link']");

private By fourStarHotels = By.xpath("//li//strong//span[@class='visuallyhidden' and contains(text(),'4')]/ancestor::ul");

private By fiveStarHotels = By.xpath("//li//strong//span[@class='visuallyhidden' and contains(text(),'5')]/ancestor::ul");

private By threeStarHotels = By.xpath("//li//strong//span[@class='visuallyhidden' and contains(text(),'3')]/ancestor::ul");

private By fourStarButton = By.xpath("//input[@id='star4']");

private By threeStarButton = By.xpath("//input[@id='star3']");

private By dynamicHotelStars ;

private int num ;
private By popupButton = By.xpath("//button[@class='cta widget-overlay-close']");

//private By distanceFromDownTownButton = By.xpath("//button//span[@class='btn-label' and contains(text(),'Distance from Downtown')]");

    private By distanceFromDownTownButton = By.xpath("//li[4]//button[1]");
private By dataAboutHotelDistance = By.xpath("//li[@class='distance secondary tabAccess']");

private By locator;
public void clickOnPackageAndFlightlink(){
    clickOn(packageAndFlightLink);
}


    public void selectAutoCompleteforNY() throws InterruptedException {

        WebElement element = SharedSD.getDriver().findElement(clickNY);

        Actions act = new Actions(SharedSD.getDriver());
        act.moveToElement(element).build().perform();
        Thread.sleep(3000);
        SharedSD.getDriver().findElement(clickNY).click();

    }

    public void highLightNyAirPorts() {
        List<WebElement> highlight = new ArrayList<WebElement>();
        highlight = SharedSD.getDriver().findElements(nyAirportSelection );

        for (WebElement findNY : highlight) {
            if (findNY.getText().equals(highlight)) {
                clickOn(nyAirportSelection);
                break;
            }
        }
    }

//    hotels.writeCityName();
//        hotels.highLightBora();
//            hotels.selectAutoComplete();
public void typeNyAirport(){

setValue(originBox ,"new york");
}

public void typeOrlando(){
    setValue(destinationBox," orlando");
}

public void highLightOrlandoAirport(){
    List<WebElement> highlight = new ArrayList<WebElement>();
    highlight = SharedSD.getDriver().findElements( orlandoAirportSelection);

    for (WebElement findOrl : highlight) {
        if (findOrl.getText().equals(highlight)) {
            clickOn(orlandoAirportSelection);
            break;
        }
    }
}
    public void selectAutoCompleteforORL() throws InterruptedException {

        WebElement element = SharedSD.getDriver().findElement(clickOrlando);

        Actions act = new Actions(SharedSD.getDriver());
        act.moveToElement(element).build().perform();
        Thread.sleep(2000);
        SharedSD.getDriver().findElement(clickOrlando).click();

    }

    public void selectDepartureDate() throws InterruptedException{


    clickOn(departingDateBox);
    mouseOver(departureDate);
    clickOn(departureDate);

}

public void selectArrivalDate() throws InterruptedException{
    clickOn(arrivalDateBox);
    mouseOver(arrivalDate);
    clickOn(arrivalDate);

}

public void clickSearchButton() throws InterruptedException {
    clickOn(searchButton);
    Thread.sleep(7000);

}

public void clickShowMoreLink() throws InterruptedException{


        WebElement showMoreButton = SharedSD.getDriver().findElement(showMoreLink);

        ((JavascriptExecutor) SharedSD.getDriver()).executeScript("arguments[0].scrollIntoView(true);", showMoreButton);


        Thread.sleep(2000);

    clickOn(showMoreLink);
}

public void clickMocOrl(){
    clickOn(mcoORLButton);
}

public void clickFlightPlusHotelButton(){
    clickOn(flightPlusHotelButton);
}

public void selectFiveStar(){

    clickOn(fiveStarButton);
}

public void selectFourStar(){
    clickOn(fourStarButton);
}

boolean isStarsforHoteldisplayd = false;
public void showStarsForHotels(int numberForStars) {


       if (numberForStars == 5) {

           List<WebElement> fiveStarHotelsList = SharedSD.getDriver().findElements(fiveStarHotels);


           List<String> webToArray = new ArrayList<>();
           for (WebElement hotelList : fiveStarHotelsList) {

               webToArray.add(hotelList.getText());

               if (hotelList.isDisplayed()) {
                   // System.out.println(webToArray);


                   isStarsforHoteldisplayd = true;
               }

               Assert.assertTrue(isStarsforHoteldisplayd);
           }
       } else if (numberForStars == 4) {
           List<WebElement> fourStarHotelsList = SharedSD.getDriver().findElements(fourStarHotels);


           List<String> webToArray = new ArrayList<>();
           for (WebElement hotelList : fourStarHotelsList) {

               webToArray.add(hotelList.getText());

               if (hotelList.isDisplayed()) {
                   // System.out.println(webToArray);


                   isStarsforHoteldisplayd = true;
               }

               Assert.assertTrue(isStarsforHoteldisplayd);
           }
       } else if (numberForStars == 3) {
           List<WebElement> threeStarHotelsList = SharedSD.getDriver().findElements(threeStarHotels);


           List<String> webToArray = new ArrayList<>();
           for (WebElement hotelList : threeStarHotelsList) {

               webToArray.add(hotelList.getText());

               if (hotelList.isDisplayed()) {
                   // System.out.println(webToArray);


                   isStarsforHoteldisplayd = true;
               }

               Assert.assertTrue(isStarsforHoteldisplayd);
           }
       }
   }


public void clickOnDistanceButton(){
    clickOn(distanceFromDownTownButton);
}

public void pullOutDataAboutDistanceFromHotel(){

    try{
    boolean distanceIsLessThan10 = false;

    List<WebElement> distanceList = SharedSD.getDriver().findElements(dataAboutHotelDistance);

    List<String> webToArray = new ArrayList<>();

    int i = 0;
    for(WebElement distanceListCompare : distanceList ) {

        /*
        Adding weebelemnet to sting and removing non-numbers from string
         */

        webToArray.add(distanceListCompare.getText().replaceAll("\\D", ""));


        int num = Integer.valueOf(String.valueOf(webToArray));
        if (num <= 10) {

            num++;
            distanceIsLessThan10 = true;
        }

        Assert.assertTrue(distanceIsLessThan10, "This distance is less than or equal to 10");
    }
    }catch( NumberFormatException nfe){
        System.out.println("Number Problem caught");
    }
}

public void selectThreeStar(){
    clickOn(threeStarButton);
}

public void verifyHotelNameIsDisplayed(String hotelName){
    List<WebElement> distanceList = SharedSD.getDriver().findElements(dataAboutHotelDistance);

    List<String> webToArray = new ArrayList<>();

    boolean isHiltonDisplayed = false;
    String hiltonVerify = getTextFromElement(dataAboutHotelDistance);
    if(hiltonVerify.toLowerCase().contains(hotelName)){
        isHiltonDisplayed = true;
    }
    Assert.assertTrue(isHiltonDisplayed,"Hilton Hotel out of range");
}

public void selectStarsforHotel(){

    for(int numberOfStars = 5; numberOfStars > 0; numberOfStars--){
    if(numberOfStars == 5) {
        clickOn(fiveStarButton);
    }
        else if(numberOfStars == 4){
        clickOn(fourStarButton);
        }
        else if(numberOfStars == 3){
        clickOn(threeStarButton);
    }


    }
    }


    public void dynamicStarsForHotel(int num){



    for(int i = 0; i <= num;i++){

        WebElement starsforHotels = SharedSD.getDriver().findElement(By.xpath("//li//strong//span[@class='visuallyhidden' and contains(text(),'"+ i +"')]/ancestor::ul"));

        String xpathforStars = starsforHotels.toString();
    }

    }
}


