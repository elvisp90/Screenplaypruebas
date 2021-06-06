#Author:elvis.pereira@sophossolutions.com
Feature: Abrir las alertas de manera exitosa
  Yo como aprendiz de automatizacion 
  Necesito navegar por las alertar de la pagina
  Para aprender a automatizar las alertar

  Scenario: abrir las alertar de la pagina demoqa
    Given "Semillero" necesita ir a la pagina "https://demoqa.com/alerts"
    And va al boton "alertButton" y da aceptar
    When va al boton "timerAlertButton" y realiza una espera y acepta
    And va a la boton "confirmButton" y verifica el texto "You selected Ok"
    Then va al boton "promtButton" ingresa el texto "Hola" y valida que el texto sea "You entered Hola"
