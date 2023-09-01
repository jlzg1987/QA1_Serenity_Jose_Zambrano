package QA1.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
public class PurchasePageInterface {
    public  static  final Target IMP_NAME = Target.the("Input Name").locatedBy("//*[@id='name']");

    public  static  final Target IMP_COUNTRY = Target.the("Input Country").locatedBy("//*[@id='country']");
    public  static  final Target IMP_CITY = Target.the("Input City").locatedBy("//*[@id='city']*");
    public  static  final Target IMP_CREDIT_CARD = Target.the("Input Credit card").locatedBy("//*[@id='card']");
    public  static  final Target IMP_MONTH = Target.the("Input Month").locatedBy("//*[@id='month']");
    public  static  final Target IMP_YEAR = Target.the("Input Year").locatedBy("//*[@id='year']");
    public  static  final Target BTN_PURCHASE = Target.the("Input Purchase").locatedBy("//*[@id='button-Purchase']");
    public  static final Target BOTON_FINAL= Target.the( "Boton fin de compra").locatedBy("//div[@class='confirm btn btn-lg btn-primary']");
}
