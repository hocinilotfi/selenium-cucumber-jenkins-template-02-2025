Feature: Login

  Scenario: Login avec un utilisateur avec cridentials valides
    Given je visite le lien "https://www.saucedemo.com/"
    When je saisis "standard_user" dans le champ user-name
    And je saisis "secret_sauce" dans le champ password
    And je clique sur le bouton login
    Then je suis redirigé vers la page "https://www.saucedemo.com/inventory.html"

  
