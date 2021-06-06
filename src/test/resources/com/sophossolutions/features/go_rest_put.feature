#Author: elvis.pereira@sophossolutions.com
Feature: Modificar un usuario en go-rest
  Yo como aprendiz de automatizacion
  Necestio modificar un usuario 
  Para aprender a automatizar APIS

  Scenario Outline: Modificar un usuario en la apis go-rest
    Given Estudiante Desea ir a la API <api>
    When con endpoint <endpoint> para modificar el usuario con un put
      | name | <name> |
      | body | <body> |
    Then Valida que la respuesta contenga <statusCode> <name> <email>

    Examples: 
      | api                     | endpoint               | name       | body            | statusCode | email                              |
      | "https://gorest.co.in/" | "public-api/comments/" | "Josefina" | "Hola josefina" |        200 | "abhaya_kapoor_rep@bechtelar.name" |
