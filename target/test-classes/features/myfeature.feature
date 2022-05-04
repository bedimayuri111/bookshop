Feature: google search

  Scenario Outline: title testing
    Given open "<browser-name>" browser
    When i launch "https://www.bookdepository.com/" site
    When i entered a value and verify title
      | Book        |
      | abdul kalam |
      | steve jobs  |
      | Herry Poter |
    And close site

    Examples: 
      | browser-name |
      | chrome       |
      | firefox      |
