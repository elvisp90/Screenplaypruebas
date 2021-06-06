#Author: elvis.pereira@sophossolutions.com
Feature: Comprar un verstido de forma exitosa
  Yo como aprendiz de automatizacion
  Necesito realizar una compra de un vestido 
  Para aprender a automatizar paginas webs

  Scenario: Comprar vestido en la pagina automationpractice
    Given "Josefina" se dirige a la pagina "http://automationpractice.com/index.php"
    When Va a la opcion de Dresses y casual dresses y Quick view
    And Elige "2" vestidos con talla "M" verifica la compra
    Then ingresa usuario "hhacketti_t103q@bylup.com" y contrasena "josefinatoro103" y verificamos que el texto sea "Your order on My Store is complete."
		