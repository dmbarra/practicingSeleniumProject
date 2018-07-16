  Scenario: Show List of Computers
  Given I have computers registered
  When I access page to search that
  Then I see Computer name, date of introduced, date of discontinued, company
  And I see total of computers registered
  And I see button to create new register
  And I have option to make search based on computer name
  And I have pagination with limit of 10
  And I can navigate between pagination

  Scenario: Open a computer register
  Given I have computers registered
  When I access page to search that
  And I open a register
  Then I see the details about that register
