package com.reaksa.learn.phoneshope_night.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.reaksa.learn.phoneshope_night.dto.BrandDTO;
import com.reaksa.learn.phoneshope_night.entity.Brand;
import com.reaksa.learn.phoneshope_night.service.BrandService;
import com.reaksa.learn.phoneshope_night.service.util.Mapper;

@RestController
@RequestMapping("brands")
public class BrandController {
	
	@Autowired
	private BrandService brandService;
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> create(@RequestBody BrandDTO brandDTO) {
		Brand brand = Mapper.toBrand(brandDTO);
		      brand = brandService.create(brand);
		return ResponseEntity.ok(brand);
		
	}
}
