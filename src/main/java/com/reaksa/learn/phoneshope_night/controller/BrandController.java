package com.reaksa.learn.phoneshope_night.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.reaksa.learn.phoneshope_night.dto.BrandDTO;
import com.reaksa.learn.phoneshope_night.entity.Brand;
import com.reaksa.learn.phoneshope_night.mapper.BrandMapper;
import com.reaksa.learn.phoneshope_night.service.BrandService;

@RestController
@RequestMapping("brands")
public class BrandController {

	@Autowired
	private BrandService brandService;

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> create(@RequestBody BrandDTO brandDTO) {
		Brand brand = BrandMapper.INSTANCE.toBrand(brandDTO);
		brand = brandService.create(brand);
		return ResponseEntity.ok(brand);
	}

	@GetMapping("{id}")
	public ResponseEntity<?> getOneById(@PathVariable("id") Integer brandId) {
		Brand brand = brandService.getById(brandId);
		return ResponseEntity.ok(brand);
	}

	@PutMapping("{id}")
	public ResponseEntity<?> update(@PathVariable("id") Integer brandId,@RequestBody BrandDTO brandDTO){
		Brand brand = BrandMapper.INSTANCE.toBrand(brandDTO);
		Brand updateBrand = brandService.update(brandId, brand);
		return ResponseEntity.ok(updateBrand);
	}
	@GetMapping
	public ResponseEntity<?> getBrands() {
		List<BrandDTO> list = brandService.getBrands()
							.stream()
							.map(brand ->  BrandMapper.INSTANCE.toBrandDTO(brand))
							.collect(Collectors.toList());
		return ResponseEntity.ok(list);
	}
	@GetMapping("filter")
	public ResponseEntity<?> getBrands(@RequestParam("name") String name) {
		List<BrandDTO> list = brandService.getBrands(name)
							.stream()
							.map(brand ->  BrandMapper.INSTANCE.toBrandDTO(brand))
							.collect(Collectors.toList());
		return ResponseEntity.ok(list);
	}

}
