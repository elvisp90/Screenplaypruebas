#Author: rigoberto.henao@sophossolutions.com
Feature: Iniciar sesion de forma exitosa
  Yo como aprendiz de automatizacion 
  Necesito inciar sesion en una pagina 
  Para aprender a automatizar aplicaciones web

  Scenario: Iniciar sesion en Guru99
    Given "Semillero" desea ir a la pagina de "http://demo.guru99.com/V4/"
    When Ingresa nombre de usuario "mgr123" y password "mgr!23"
    Then Valida que el titulo sea "Manger Id : mgr123"
