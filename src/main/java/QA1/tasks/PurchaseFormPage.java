package QA1.tasks;

import QA1.userinterfaces.PurchasePageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class PurchaseFormPage implements Task {
    public final String name;
    public final String country;
    public final String city;
    public final String creditcard;
    public final String month;
    public final String year;

    public PurchaseFormPage(String name, String country, String city, String creditcard, String month, String year) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.creditcard = creditcard;
        this.month = month;
        this.year = year;
    }



    public static Performable data(String name, String country, String city, String creditcard, String month, String  year){
        return instrumented(PurchaseFormPage.class, name, country, city, creditcard, month,year);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(PurchasePageInterface.IMP_NAME, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(name).into(PurchasePageInterface.IMP_NAME),
                WaitUntil.the(PurchasePageInterface.IMP_COUNTRY, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(country).into(PurchasePageInterface.IMP_COUNTRY),
                WaitUntil.the(PurchasePageInterface.IMP_CITY, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(city).into(PurchasePageInterface.IMP_CITY),
                WaitUntil.the(PurchasePageInterface.IMP_CREDIT_CARD, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(creditcard).into(PurchasePageInterface.IMP_CREDIT_CARD),
                WaitUntil.the(PurchasePageInterface.IMP_MONTH, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(month).into(PurchasePageInterface.IMP_MONTH),
                WaitUntil.the(PurchasePageInterface.IMP_YEAR, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(year).into(PurchasePageInterface.IMP_YEAR),
                WaitUntil.the(PurchasePageInterface.BTN_PURCHASE, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(PurchasePageInterface.BTN_PURCHASE),
                WaitUntil.the(PurchasePageInterface.BOTON_FINAL, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(PurchasePageInterface.BOTON_FINAL)
        );
    }
}
