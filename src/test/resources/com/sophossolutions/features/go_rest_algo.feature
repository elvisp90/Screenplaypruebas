#Author: elvis.pereira@sophossolutions.com
Feature: Crear un usuario por post
  Yo como aprendiz de automatizacion
  Necesito consumir una api 
  Para aprender automatizar

  Scenario Outline: Crear un usuario de la api Gorest
    Given Estudiante Desea ir a la api <api>
    When Con el endpoint <endpoint> y los datos
      | post_id  | name   | email   | body   |
      | <postId> | <name> | <email> | <body> |
    Then Valida que la respuesta contenga <statusCode> <name> <email>

    Examples: 
      | api                     | endpoint               | statusCode | postId | name             | email                | body           |
      | "https://gorest.co.in/" | "public-api/comments/" |        200 |     60 | "Martina Mendez" | "martinam@gmail.com" | "Hola martina" |
