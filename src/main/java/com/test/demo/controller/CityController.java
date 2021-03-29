package com.test.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.demo.entity.City;
import com.test.demo.service.CityService;

@Controller
public class CityController {
	 
	@Autowired
	private CityService cityService;
	
	@GetMapping("/json")
	public String getJson() {
		return "{}";
	}
	
	@GetMapping("/list")
	@ResponseBody
	public List<City> getListCity() {
		return cityService.getAllCityData();
	}
	
	@PostMapping("/save")
	@ResponseBody
	public City saveCity(@RequestBody City entity) {		
		return cityService.saveCity(entity);
	}
	
	@PostMapping("/delete")
	@ResponseBody
	public void deleteCity(@RequestBody City entity) {
		cityService.deleteCity(entity);
	}
	
	@GetMapping("/home")
	public String getIndexPage() {
		return "index";
	}
	
}
