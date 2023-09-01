Feature: Automatizacion de Ecommer E2E
  @happyPath
  Scenario: Agregar articulos al carrito de compras
    #Agregar dos productors al carrito y visualizar el cerrito
    Given User estoy en la pagina opencart
    When  seleciona un articulo
    Then  agrego el articulo al carrito
    And ver el carrito de compras

#Completar el formulario de compra y finalizar
  Scenario Outline: Dinalizar la compra
    Given pagar las compras del carrito
    When veo formulario <Name> <Country> <City> <Creditcard> <Month> <Year>
    Then Finalizo la compra
    And veo el reporte de la compra
    Examples:
      | Name | Country | City       | Creditcard | Month  | Year |
      | Jose | Ecuador | Esmeraldas | 1122211111 | Agosto | 2023 |