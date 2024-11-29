Feature: Validating place API's

  @AddPlace @Regression
  Scenario Outline: Verify if place is being successfully added using addPlace API
    Given Add Place Payload with "<name>""<address>""<language>"
    When User calls "addPlaceAPI" with "POST" http request
    Then The API call got success with status code 200
    And "status" in response body is "OK"
    And "scope" in response body is "APP"
    And verify place_Id created maps to "<name>" using "getPlaceAPI"

    Examples: 
      | name    | address            | language |
      | RPHouse | World Trade Centre | English  |

  #|SSHouse|Global centre     |Russian|
  #|TPHouse|Foreign centre     |French|
  
  @DeletePlace @Regression
  Scenario: Verify if Delete Place functionality is working
    Given deletePlace payload
    When User calls "deletePlaceAPI" with "POST" http request
    Then The API call got success with status code 200
    And "status" in response body is "OK"
