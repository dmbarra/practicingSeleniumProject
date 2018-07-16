  Scenario: Remove a computer
  Given I have computers registered
  When I access page to search that
  And I open a register
  And I click on "Delete this computer"
  Then the register is removed
  And I receive message about the action
