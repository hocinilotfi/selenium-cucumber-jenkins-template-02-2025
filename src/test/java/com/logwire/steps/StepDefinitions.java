package com.logwire.steps;

import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.assertTrue;


import com.logwire.pages.LoginPage;
import com.logwire.tools.DriverTool;

public class StepDefinitions {

    LoginPage loginPage = new LoginPage(DriverTool.getDriver());

    @When("je saisis {string} dans le champ user-name")
    public void je_saisis_dans_le_champ_user_name(String s) {
        // Write code here that turns the phrase above into concrete actions
        loginPage.saisirUserName(s);
    }

    @When("je saisis {string} dans le champ password")
    public void je_saisis_dans_le_champ_password(String s) {
        // Write code here that turns the phrase above into concrete actions
        loginPage.saisirPassword(s);
    }

    @When("je clique sur le bouton login")
    public void je_clique_sur_le_bouton_login() {
        // Write code here that turns the phrase above into concrete actions
        loginPage.clickLoginButton();
    }

    @Then("je suis redirigé vers la page {string}")
    public void je_suis_redirig_vers_la_page(String s) {
        // Write code here that turns the phrase above into concrete actions
        assertTrue(DriverTool.getDriver().getCurrentUrl().contains(s));
    }

    @Given("je visite le lien {string}")
    public void je_visite_le_lien(String s) {
        // Write code here that turns the phrase above into concrete actions
        DriverTool.getDriver().get(s);
    }

}
