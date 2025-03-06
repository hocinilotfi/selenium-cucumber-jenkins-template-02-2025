package com.logwire.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(id = "user-name")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    public void saisirUserName(String username) {

        usernameField.clear();
        usernameField.sendKeys(username);
    }

    public void saisirPassword(String password) {

        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {

        loginButton.click();
    }

}