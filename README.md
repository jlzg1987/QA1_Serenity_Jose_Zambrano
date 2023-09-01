
# JoseZambranoE2E Serenity-Cucumber-Junit-Maven-Java
* Serenity BDD es una biblioteca que facilita la redacción de pruebas de aceptación automatizadas de alta calidad, con potentes funciones de generación de informes y documentación viva. Tiene un fuerte soporte tanto para pruebas web con Selenium como para pruebas de API con RestAssured.
* Las pruebas están escritas en formato BDD Gherkin y se representan como documentación viva en el informe de la prueba.
## La estructura del directorio del proyecto.
src
+ main
  + java
    + QA1
        + tasks
            + AddProductPage
            + OpenPage
            + PurchaseFormPage
        + userinterfaces
            + PurchasePageInterface
            + ShowPageInterface
+ test
    + java
        + QA1
            + glues
                + LoginGlue
            + runners
                + RunnerTest
    + resources
        + features
            + Shop.feature
        + Serenity.conf
### Ejecutando las pruebas
Ejecutar mvn clean verify  desde la línea de comando.

mvn clean verify
./gradlew tasks
./gradlew clear

### Especificaciones a tomar en cuenta
-   SerenityBDD con ScreenPlay
-   Cucumber
-   Gradle versión: 7.6.1
-   IDE: IntelliJ IDEA
-   JDK: 1.8
-   Maven versión: 3.9.1