
@tag
Feature: authentification page orange
  on va acceder a la page orange hrm

  @tag1
  Scenario: authentification_valide
    Given acceder a l url orange hrm
    When taper le username 
    And taper le mot de passe
    And cliquer sur le bouton connecter
    Then acceder a la page d acceuil
    
    
    
    
   
  