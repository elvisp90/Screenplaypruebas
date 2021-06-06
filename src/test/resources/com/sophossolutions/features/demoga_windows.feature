#Author: elvis.pereira@sophossolutions.com
Feature: abrir ventanas del navegador de forma exitosa
  Yo como aprendiz de automatizacion 
  Necesito navegar atraves de una tarea
  Para aprender a automatizar con screenplay

 
  Scenario Outline: nagevar con una tarea en la pagina demoga
    Given "Usuario" ingrea a la pagina de "https://demoqa.com/"
    And ingresa al apartado de alert, frame & windows
    When ingresa a siguiente apartado de browser windows
    And va al boton de <boton>
    Then valida que el texto sea "This is a sample page"

    Examples: 
      | boton                 |
      | "tabButton"           |
      | "windowButton"        |
      | "messageWindowButton" |
