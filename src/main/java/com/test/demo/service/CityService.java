package com.test.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.demo.entity.City;
import com.test.demo.repository.IcityRepository;

@Service
public class CityService {
	
	@Autowired
	private IcityRepository cityRepository;
	
	public List<City> getAllCityData() {
		return cityRepository.findAll();
	}
	
	public City saveCity(City entity) {
		return cityRepository.save(entity);
	}
	
	public void deleteCity(City entity) {
		cityRepository.deleteById(entity.getId());
	}
}
