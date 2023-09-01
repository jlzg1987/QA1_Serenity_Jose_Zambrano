package QA1.tasks;

import QA1.userinterfaces.ShowPageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddProductPage implements Task {
public static Task addProductsToCart(){
    return instrumented(AddProductPage.class);
}
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ShowPageInterface.LINK_ARTICULO1, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ShowPageInterface.LINK_ARTICULO1),
                WaitUntil.the(ShowPageInterface.BOTON_AGREGAR1, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ShowPageInterface.BOTON_AGREGAR1),
                WaitUntil.the(ShowPageInterface.BOTON_ALERT1, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ShowPageInterface.BOTON_ALERT1),
                WaitUntil.the(ShowPageInterface.VOLVER_HOME, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ShowPageInterface.VOLVER_HOME),
                WaitUntil.the(ShowPageInterface.LINK_ARTICULO2, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ShowPageInterface.LINK_ARTICULO2),
                WaitUntil.the(ShowPageInterface.BOTON_AGREGAR2, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ShowPageInterface.BOTON_AGREGAR2),
                WaitUntil.the(ShowPageInterface.BOTON_ALERT2, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ShowPageInterface.BOTON_ALERT2),
                WaitUntil.the(ShowPageInterface.BOTON_ABRIR_CARRITO, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ShowPageInterface.BOTON_ABRIR_CARRITO),
                WaitUntil.the(ShowPageInterface.BOTON_COMPRAR, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ShowPageInterface.BOTON_COMPRAR)

        );
    }
}
