package com.dmg_media.step_definitions;

import com.dmg_media.pages.MailTravel_HomePage;
import com.dmg_media.utils.BrowserUtils;
import com.dmg_media.utils.ConfigurationReader;
import com.dmg_media.utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;



public class MailTravel_HomePage_Step_Definition {

    MailTravel_HomePage mailTravel_homePage = new MailTravel_HomePage();
    String numberOfAdults="2";
    String departureAirPort="London Heathrow (LHR)";
    String deapartureDate="Mon, 25 Sep 2023";
    String textDisplayed= "Confirm Details + Book";


    @When("user navigates to mail travel home page")
    public void user_navigates_to_mail_travel_home_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("user should see tile as  {string}")
    public void user_should_see_tile_as_home_page_mail_travel(String expectedTitle) {

        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        System.out.println("actualTitle = " + actualTitle);

    }

    @Then("user clicks on  Accept All cookies")
    public void user_clicks_on_accept_all_cookies() {
/*
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[.='Accept All Cookies']")));
        mailTravel_homePage.clickOnAcceptCookies.click();
*/
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", mailTravel_homePage.clickOnAcceptCookies);

    }

    @When("user click on the search bar")
    public void user_click_on_the_search_bar() {
        mailTravel_homePage.searchBar.click();

    }

    @When("user types {string} in the search box")
    public void user_types_india_in_the_search_box(String countryName) {
        mailTravel_homePage.searchBar.sendKeys(countryName);
    }

    @Then("user clicks on india in drop down")
    public void user_clicks_on_india_in_drop_down() {
        mailTravel_homePage.clickOnIndiaFromDropDown.click();

    }

    @When("user clicks on book online button")
    public void user_clicks_on_book_online_button() {
        //JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
       // js.executeScript("arguments[0].click();", mailTravel_homePage.clickOnAcceptCookies);

        mailTravel_homePage.clickOnBookOnlineButton.click();
    }

    @When("user scrolls the bottom of the page")
    public void user_scrolls_the_bottom_of_the_page() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", mailTravel_homePage.scrollDownToCalender);

        // mailTravel_homePage.dateAndPrices.click();
    }

    @And("user selects the first available date to book")
    public void userSelectsTheFirstAvailableDateToBook() {
        mailTravel_homePage.selectTheFirstAvailableDate.click();
        deapartureDate = mailTravel_homePage.selectTheFirstAvailableDate.getAttribute("data-selecteddatedisplay");

    }

    @When("user selects {string} adults")
    public void user_selects_adults(String adults) {

        Select select = new Select(mailTravel_homePage.selectAdult);
        select.selectByValue(adults);
        numberOfAdults = adults;

    }

    @When("user makes the note of Departure Airport")
    public void user_makes_the_note_of() {
        Assert.assertTrue(mailTravel_homePage.textOfDepartureAirPort.isDisplayed());
        departureAirPort = mailTravel_homePage.textOfDepartureAirPort.getText();

    }

    @Then("user clicks on book online button2")
    public void user_clicks_on_book_online_button2() {
        mailTravel_homePage.clickOnBookOnlineButtonNo2.click();

    }

    @When("user clicks on the  Date, Departure & Passengers section")
    public void user_clicks_on_the_date_departure_passengers_section() {
        mailTravel_homePage.dateDeparturePassengerHeading.click();

    }

    @Then("user verifies the details given")
    public void userVerifiesTheDetailsGiven() {

        Assert.assertEquals(numberOfAdults,mailTravel_homePage.verifyTheNumberOfAdults.getText());
        Assert.assertEquals(departureAirPort,mailTravel_homePage.verifyTheDepartureAirPort.getText());
        Assert.assertEquals(deapartureDate,mailTravel_homePage.verifyTheDepartureDate.getText());

    }

    @When("user clicks on the accomodation section")
    public void user_clicks_on_the_accomodation_section() {
/*
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", mailTravel_homePage.accomodationHeading);

        //mailTravel_homePage.accomodationHeading.click();
*/
    }

    @When("user selects {string} in number required drop down")
    public void user_selects_in_number_required_drop_down(String number) {

        Select select = new Select(mailTravel_homePage.roomNumberRequired);
        select.selectByVisibleText(number);
    }

    @Then("user clicks on SELECT YOUR ROOMS AND CONTINUE")
    public void user_clicks_on_select_your_rooms_and_continue() {
        mailTravel_homePage.selectYourRoomAndContinueButton.click();

    }

    @When("user fills the personal detail in the form")
    public void user_fills_the_personal_detail_in_the_form() throws InterruptedException {
Thread.sleep(5);
        Select select = new Select(mailTravel_homePage.person1Title);
        select.selectByIndex(1);
        mailTravel_homePage.p1FirstName.sendKeys("Alison");
        mailTravel_homePage.p1LastName.sendKeys("Williams");
        Select select1 = new Select(mailTravel_homePage.p1DateOfBirthDay);
        select1.selectByValue("4");
        Select select2 = new Select(mailTravel_homePage.getP1DateOfBirthMonth);
        select2.selectByVisibleText("March");
        Select select3 = new Select(mailTravel_homePage.getP1DateOfBirthYear);
        select3.selectByVisibleText("1982");
        Select select4 = new Select(mailTravel_homePage.person2Title);
        select4.selectByIndex(1);
        mailTravel_homePage.p2FirstName.sendKeys("Mark");
        mailTravel_homePage.p2LastName.sendKeys("Williams");
        Select select5 = new Select(mailTravel_homePage.p2DateOfBirthDay);
        select5.selectByValue("18");
        Select select6 = new Select(mailTravel_homePage.getP2DateOfBirthMonth);
        select6.selectByVisibleText("June");
        Select select7 = new Select(mailTravel_homePage.getP2DateOfBirthYear);
        select7.selectByVisibleText("1979");
        mailTravel_homePage.enterMobileNumber.sendKeys("07704545045");
        mailTravel_homePage.email.sendKeys("alison13@hotmail.com");
        mailTravel_homePage.addressLine1.sendKeys("262");
        mailTravel_homePage.addressLine2.sendKeys("Southbush Lane");
        mailTravel_homePage.city.sendKeys("Reading");
        mailTravel_homePage.postCode.sendKeys("RG6 7BH");
        Select select8= new Select(mailTravel_homePage.countryName);
        select8.selectByVisibleText("United Kingdom");


    }

    @When("user selects email from the drop down in where did you hear about us")
    public void user_selects_email_from_the_drop_down_in_where_did_you_hear_about_us() {

        Select select = new Select(mailTravel_homePage.selectEmailAsAnOption);
        select.selectByVisibleText("Email");

    }

    @Then("user clicks on Continue button")
    public void user_clicks_on_continue_button() {
        mailTravel_homePage.clickOnContinueButton.click();

    }

    @When("user verifies Confirm Details + Book page is enabled")
    public void user_verifies_confirm_details_book_page_is_enabled() throws InterruptedException {
        Thread.sleep(5);

        Assert.assertEquals(mailTravel_homePage.confirmDetailsAndBookText.getText(),textDisplayed);
        System.out.println("mailTravel_homePage = " + mailTravel_homePage);

    }

    @When("user verifies Book Now button is enabled")
    public void user_verifies_book_now_button_is_enabled() {
        Assert.assertTrue(mailTravel_homePage.bookNOWButton.isEnabled());
    }


}

