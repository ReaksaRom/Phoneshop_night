package com.reaksa.learn.phoneshope_night.service;

import com.reaksa.learn.phoneshope_night.entity.Brand;

public interface BrandService {
	Brand create(Brand brand);
	Brand getById(Integer id);
	Brand update(Integer id,Brand brandUpdate);

}
