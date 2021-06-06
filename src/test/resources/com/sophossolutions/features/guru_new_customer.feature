#Author: elvis.pereira@sophossolutions.com
Feature: Iniciar sesion de forma exitosa
  Yo como aprendiz de automatizacion 
  Necesito inciar sesion en una pagina 
  Para aprender a automatizar aplicaciones web

  Background: Iniciar sesion en Guru99
    Given "Semillero" desea ir a la pagina de "http://demo.guru99.com/V4/"
    When Ingresa nombre de usuario "mgr123" y password "mgr!23"
    Then Valida que el titulo sea "Manger Id : mgr123"

  Scenario: Crear un nuevo usuario en Guru99
    When "Semillero" ingresa al aparatado Nuevo Usuario
    And Diligencia el formulario con los siguientes datos nombre "Martin", genero "m", fecha "15/04/2020", direccion "Barbosa", ciudad "Medellin", estado "Atioquia", pin "123456", telefono "321465747", correo "jmartint@mail.com", contrasena "martin123"
    Then Valida que el titulo sea el siguiente "Customer Registered Successfully!!!"
    
    
    
    
    
 