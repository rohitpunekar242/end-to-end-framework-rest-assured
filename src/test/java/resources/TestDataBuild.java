package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.Location;
import pojo.SampleBody;

public class TestDataBuild {
	
	public SampleBody addPlacePayload(String name, String address, String language)
	{
		SampleBody s = new SampleBody();
		s.setAccuracy(100);
		s.setName(name);
		s.setPhone_number("(+91) 983 893 3937");
		s.setAddress(address);
		s.setWebsite("http://google.com");
		s.setLanguage(language);
		
        Location l = new Location();
        l.setLat(-38.383494);
        l.setLng(33.427362);
		s.setLocation(l);
		
		List<String> a = new ArrayList<String>();
		a.add("shoe park");
		a.add("shop");
		s.setTypes(a);
		return s;
	}
	
	public String deletePlacePayload(String placeId)
	{
		return "{\r\n    \"place_id\":\""+placeId+"\"\r\n}";
	}

}
