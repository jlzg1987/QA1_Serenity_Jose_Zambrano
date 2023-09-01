package QA1.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ShowPageInterface {
    public  static final Target LINK_ARTICULO1= Target.the( "Link Articulo encontrado").located(By.id("card-title"));
    public  static final Target BOTON_AGREGAR1= Target.the( "Boton agregar al carrito").locatedBy("//div[@class='col-sm-12 col-md-6 col-lg-6']");
    public  static final Target BOTON_ALERT1= Target.the( "Boton aceptar articulo").locatedBy("alert.accept()");
    public  static final Target VOLVER_HOME= Target.the( "Regresar a home").locatedBy("//a[@class='navbar-brand']");
    public  static final Target LINK_ARTICULO2= Target.the( "Link Articulo encontrado").located(By.id("card-title"));
    public  static final Target BOTON_AGREGAR2= Target.the( "Boton agregar al carrito").locatedBy("//div[@class='col-sm-12 col-md-6 col-lg-6']");
    public  static final Target BOTON_ALERT2= Target.the( "Boton aceptar articulo").locatedBy("alert.accept()");
    public  static final Target BOTON_ABRIR_CARRITO= Target.the( "Boton abrir carrito").located(By.id("cartur']"));
    public  static final Target BOTON_COMPRAR= Target.the( "Boton comprar").locatedBy("//button[@Class=\"btn btn-success\"]']");


}
