package StepDefPackage;

import PageObjectpackage.StorePage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefStore {
    StorePage storePage=new StorePage();

    @When("^User search for the store and enter his postcode$")
    public void user_search_for_the_store_and_enter_his_postcode() throws Throwable {
    storePage.storefinder();
    }

    @Then("^User should find his nearby store$")
    public void user_should_find_his_nearby_store() throws Throwable {

    }

}
