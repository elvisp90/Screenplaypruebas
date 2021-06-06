#Author: rigoberto.henao@sophossolutions.com
Feature: Consultar API por metodo Get
  Yo como aprendriz de automatizacion
  Necesito aprender a consumir API a trav�s del m�todo Get
  Para automatizar las peticiones

  Scenario Outline: No se metodo get
    Given Estudiante Desea ir a la api <api>
    When Consulta el no se el <endpoint> y consulto por <id>
    Then Valida que la respuesta contenga <statusCode> <name> <email>

    Examples: 
      | api                     | endpoint                 | id   | statusCode | name                 | email                           |
      | "https://gorest.co.in/" | "public-api/comments/"   | "93" |        200 | "Gauranga Banerjee"  | "gauranga_banerjee@howell.info" |
      | "https://gorest.co.in/" | "public-api/categories/" | "1"  |        200 | "Outdoors"           | "true"                          |
      | "https://gorest.co.in/" | "public-api/users/"      | "95" |        200 | "Balaaditya Gowda"   | "gowda_balaaditya@cummings.co"  |
      | "https://gorest.co.in/" | "public-api/products/"   | "1"  |        200 | "Awesome Wool Pants" | "true"                          |
