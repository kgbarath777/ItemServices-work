package com.example.ItemService;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import antlr.collections.List;

@RestController
@RequestMapping("/port")
public class ItemController {

	@Autowired
	private RestTemplate Items1;
	
	@GetMapping("/services1Items")
	public RestTemplate getServicesItems() {
		return Items1;
		
	
	@PostMapping("/services2Items")
	
	String url = "http://port/service2/items";
	Object objects = Items1.getForObject(url,Object[].class);
			return Arrays.asList(objects);
}
					

	
	
	
	
	
	
	
	
	
}
