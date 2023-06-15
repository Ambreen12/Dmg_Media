package com.dmg_media.pages;


import com.dmg_media.utils.Driver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MailTravel_HomePage {
    public MailTravel_HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//button[.='Accept All Cookies']")
    public WebElement clickOnAcceptCookies;


    @FindBy(id = "searchtext_freetext_search_form")
    public WebElement searchBar;

// this is india locator from the drop down (//ul[@id='as_ul']/li/a)[1]

    @FindBy(xpath = "(//ul[@id='as_ul']/li/a)[1]")
    public WebElement clickOnIndiaFromDropDown;

    @FindBy(xpath = "//button[@name='enterbookingflow']")
    public WebElement clickOnBookOnlineButton;


    @FindBy(xpath = "//div[@id='departure-selection']")
    public WebElement textOfDepartureAirPort;

    @FindBy(xpath = "//*[@name='numAdults']")
    public WebElement selectAdult;

    @FindBy(xpath = "(//div[.='Book Online'])[2]")
    public WebElement clickOnBookOnlineButtonNo2;

    @FindBy(className = "nbf_tpl_pms_calendar_tablecontainer")
    public WebElement scrollDownToCalender;

    @FindBy(xpath = "//a[@href='#dates_and_prices_title']")
    public WebElement dateAndPrices;


    @FindBy(xpath = "(//div[@class='nbf_tpl_pms_calendar_tablecontainer']/div[5]//div[1])[1]")
    public WebElement selectTheFirstAvailableDate;


    @FindBy(xpath = "(//*[@class='nbf_tpl_pms_bf_panel__title'])[1]")
    public WebElement dateDeparturePassengerHeading;

    @FindBy(xpath = "//div[@class='nbf_tpl_pms_bf_element']/div[1]/div[1]/div[1]/div[2]")
    public WebElement verifyTheNumberOfAdults;
    @FindBy(xpath = "//div[@class='nbf_tpl_pms_bf_departure_value unit size1of2 lastUnit']")
    public WebElement verifyTheDepartureAirPort;
    @FindBy(xpath = "//div[@class='nbf_tpl_pms_bf_departuredate']")
    public WebElement verifyTheDepartureDate;

    @FindBy(xpath = "(//div[@class='nbf_tpl_pms_bf_panel__title'])[3]")
    public WebElement accomodationHeading;

    @FindBy(xpath = "(//select[@class='nbf_tpl_pms_roomselection_js'])[1]")
    public WebElement roomNumberRequired;

    @FindBy(xpath = "//div[@id='accomForm-select']/button")
    public WebElement selectYourRoomAndContinueButton;

    @FindBy(id = "pax-a-title-1")
    public WebElement person1Title;
    @FindBy(xpath = "//*[@id='pax-a-first-1']")
    public WebElement p1FirstName;
    @FindBy(xpath = "//*[@id='pax-a-last-1']")
    public WebElement p1LastName;
    @FindBy(xpath = "//*[@id='pax-a-dobd-1']")
    public WebElement p1DateOfBirthDay;
    @FindBy(xpath = "//*[@id='pax-a-dobm-1']")
    public WebElement getP1DateOfBirthMonth;
    @FindBy(xpath = "//*[@id='pax-a-doby-1']")
    public WebElement getP1DateOfBirthYear;

    @FindBy(xpath = "//*[@name='pax-a-title-2']")
    public WebElement person2Title;
    @FindBy(xpath = "//*[@id='pax-a-first-2']")
    public WebElement p2FirstName;
    @FindBy(xpath = "//*[@id='pax-a-last-2']")
    public WebElement p2LastName;
    @FindBy(xpath = "//*[@id='pax-a-dobd-2']")
    public WebElement p2DateOfBirthDay;
    @FindBy(xpath = "//*[@id='pax-a-dobm-2']")
    public WebElement getP2DateOfBirthMonth;
    @FindBy(xpath = "//*[@id='pax-a-doby-2']")
    public WebElement getP2DateOfBirthYear;

    @FindBy(id = "contact-mobile")
    public WebElement enterMobileNumber;

    @FindBy(id = "contact-email")
    public WebElement email;
    @FindBy(id = "contact-address1")
    public WebElement addressLine1;

    @FindBy(id = "contact-address2")
    public WebElement addressLine2;

    @FindBy(id = "contact-city")
    public WebElement city;
    @FindBy(id = "contact-postcode")
    public WebElement postCode;
    @FindBy(id = "contact-country")
    public WebElement countryName;


    @FindBy(xpath = "//*[@id='contact-hearabout']")
    public WebElement selectEmailAsAnOption;

    @FindBy(xpath = "//*[@id='paxform-select']/button")
    public WebElement clickOnContinueButton;

    //@FindBy(xpath = "//div[@class='nbf_header']/h1[2]")
    @FindBy(xpath = "//h1[2]")
    public WebElement confirmDetailsAndBookText;


    @FindBy(xpath = "//*[@id='nbf_booknow_button']")//*[@class='nbf_fancyimg_payment_pageheader']
    public WebElement bookNOWButton;


}
