package com.test.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.demo.entity.City;

@Repository
public interface IcityRepository extends JpaRepository<City, Long>{
	
}
