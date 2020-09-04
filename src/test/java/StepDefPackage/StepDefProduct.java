package StepDefPackage;

import PageObjectpackage.ProductPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefProduct {
    ProductPage productPage=new ProductPage();
    @Given("^User is on Homepage$")
    public void user_is_on_Homepage() throws Throwable {
    productPage.baseurl();
    }

    @When("^User search for the multiple products$")
    public void user_search_for_the_multiple_products() throws Throwable {
    productPage.selecttap();
    }

    @When("^User find products which they want$")
    public void user_find_products_which_they_want() throws Throwable {

    }

    @Then("^User should able to put that products in checkout basket$")
    public void user_should_able_to_put_that_products_in_checkout_basket() throws Throwable {

    }

}
