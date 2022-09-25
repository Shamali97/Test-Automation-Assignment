package com.actitime.qa.pages;

import com.actitime.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.actitime.qa.base.TestBase;
import org.openqa.selenium.support.PageFactory;

public class UsersPage extends TestBase  {

    @FindBy(xpath = "//div[@id='logo_aT']")
    WebElement actTimeLogo;

    @FindBy(xpath = "//table[@class='userNameContainer']")
    WebElement userRow;

    @FindBy(xpath = "//div[@id='editUserPanel']")
    WebElement userProfile;

    @FindBy(xpath = "//a[@class='content tt']")
    WebElement timeTrackLink;

    public UsersPage() {
        PageFactory.initElements(driver, this);
    }

    public Boolean validateActiTimeLogo() {
        return actTimeLogo.isDisplayed();
    }

    public Boolean validateAllUsers(){
        return userRow.isDisplayed();
    }

    public Boolean validateIndividualProfile(){
        userRow.click();
        return userProfile.isDisplayed();

    }

    public TimeTrackPage clickOnTimeTrackLink() {
        timeTrackLink.click();
        return new TimeTrackPage();
    }

}
