#Author: your.email@your.domain.com
Feature: Modificar usuario en la apli con patch
  Yo como aprendiz de automatizacion
  Necesita modificar un usuario en la api
  Para aprender a automatizar apis

  Scenario Outline: Modificar usuario en gorest
    Given Estudiante Desea ir a la API <api>
    When se le envia el endpoint <endpoint> y los datos
      | name  | <name>  |
      | email | <email> |
    Then Valida que la respuesta contenga <statusCode> <name> <email>

    Examples: 
      | api                     | endpoint               | name      | email              | statusCode |
      | "https://gorest.co.in/" | "public-api/comments/" | "Agustin" | "agus95@gamil.com" |        200 |
