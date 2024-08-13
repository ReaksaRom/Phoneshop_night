package com.reaksa.learn.phoneshope_night.service;

import java.util.List;

import com.reaksa.learn.phoneshope_night.entity.Brand;

public interface BrandService {
	Brand create(Brand brand);
	Brand getById(Integer id);
	Brand update(Integer id,Brand brandUpdate);
	List<Brand> getBrands();
	List<Brand> getBrands(String name);

}
