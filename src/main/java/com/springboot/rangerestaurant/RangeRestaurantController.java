package com.springboot.rangerestaurant;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.range.Ranges;
import com.springboot.restaurants.Restaurants;


@RestController
public class RangeRestaurantController {
	
	@Autowired
	public RangeRestaurantService rangesRestaurantService;
	
	// GET ALL Request
	
	
	@RequestMapping("/ranges/{rangeid}/restaurants/{restaurantid}/rangerestaurant")
	public List<RangeRestaurant> getAllRangeRestaurant()
	{
		return rangesRestaurantService.getAllRangeRestaurant();
		
	}
	
	
	// GET Request
	
	@RequestMapping("/ranges/{rangesId}/restaurants/{restaurantid}/rangesrestaurant/{idrangesRestaurantTable}")
	public Object getrangesRestaurant(@PathVariable int idrangesRestaurantTable)
	{
		return rangesRestaurantService.getRangeRestaurant(idrangesRestaurantTable);
	}
	
	
	// POST Request
	
	@RequestMapping(method = RequestMethod.POST, value = "/ranges/{rangesId}/restaurants/{restaurantId}/rangesrestaurant")
	public void postrangesRestaurant(@RequestBody RangeRestaurant rangesRestaurant, @PathVariable int rangesId, @PathVariable int restaurantId)
	{
		rangesRestaurant.setRange(new Ranges(rangesId,"","",null,""));
		rangesRestaurant.setRestaurant(new Restaurants(restaurantId,"",null,null,"",""));
		rangesRestaurantService.postRangeRestaurant(rangesRestaurant);
	}
	
	// PUT Request
	
	@RequestMapping(method = RequestMethod.PUT , value = "/ranges/{rangesId}/restaurants/{restaurantId}/rangesrestaurant/{idrangesrestaurantTable}")
	public void putrangesrestaurants(@PathVariable int idrangesrestaurantTable, @RequestBody RangeRestaurant rangesRestaurant, @PathVariable int rangesId, @PathVariable int restaurantId)
	{
		rangesRestaurant.setRange(new Ranges(rangesId,"","",null,""));
		rangesRestaurant.setRestaurant(new Restaurants(restaurantId,"",null,null,"",""));
		rangesRestaurantService.putRangeRestaurant(rangesRestaurant);
	}
	
	
	// DELETE Request
	@RequestMapping(method = RequestMethod.DELETE , value = "/ranges/{rangesId}/restaurants/{restaurantId}/rangesrestaurant/{idrangesrestaurantTable")
	public void deleterangesestaurant(@PathVariable int idrangesrestaurantTable)
	{
		rangesRestaurantService.deleteRangeRestaurant(idrangesrestaurantTable);
	}
	

}
