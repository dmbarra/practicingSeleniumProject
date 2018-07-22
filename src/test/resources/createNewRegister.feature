  Scenario: Create new Computer register
  Given I open page to register new computer
  When I filled all field correctly
  And select valid company
  And submit the new register
  Then the new register is stored
  And receive a success message

  Scenario: Create new computer without name
  Given I open page to register new computer
  When submit the new register
  Then receive a message inform the fields required is not filled

  Scenario: Cancel action to create new computer
  Given I open page to register new computer
  When I filled all field correctly
  And select valid company
  And I cancel the form
  Then the new register is NOT stored
  And the search page is open