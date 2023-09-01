package QA1.glue;

import QA1.tasks.AddProductPage;
import QA1.tasks.OpenPage;
import QA1.tasks.PurchaseFormPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginGlue {
private static final String  ACTOR_NAME ="User";
@Before
public void setTheStag(){OnStage.setTheStage(new OnlineCast());}
    @Given("^(.*) estoy en la pagina opencart$")
    public void User_estoy_en_la_pagina_opencart(String actor) {
        theActorCalled(actor).attemptsTo(OpenPage.loadpage());
    }

    @When("^seleciona un articulo$")
    public void seleciona_un_articulo() {
    when(OnStage.theActorInTheSpotlight()).attemptsTo(AddProductPage.addProductsToCart());
    }

    @Then("^agrego el articulo al carrito$")
    public void agrego_el_articulo_al_carrito() {

    }

    @Then("^ver el carrito de compras$")
    public void ver_el_carrito_de_compras() {

    }

    @Given("^pagar las compras del carrito$")
    public void pagar_las_compras_del_carrito() {

    }
    @When("veo formulario (.*) (.*) (.*) (.*) (.*) (.*)")
    public void veo_formulario(String name, String country, String city, String creditcard, String month, String year) {
        theActorInTheSpotlight().attemptsTo(
                PurchaseFormPage.data(name, country, city, creditcard, month, year)
        );
    }

    @Then("^Finalizo la compra$")
    public void finalizo_la_compra() {

    }

    @Then("veo el reporte de la compra")
    public void veo_el_reporte_de_la_compra() {

    }
}
