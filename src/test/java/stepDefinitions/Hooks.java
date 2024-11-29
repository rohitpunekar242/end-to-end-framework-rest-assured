package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@DeletePlace")
	public void beforeScenarios() throws IOException
	{
		//execute this code only when place id is null
		//write a code that will give you place id
		
		StepDefinition m = new StepDefinition();
		
		if(StepDefinition.place_id==null)
		{
		m.add_place_payload_with("Rohit", "India", "French");
		m.user_calls_with_post_http_request("addPlaceAPI", "POST");
		m.verify_place_id_created_maps_to_using("Rohit", "getPlaceAPI");
		}
		
	}

}
