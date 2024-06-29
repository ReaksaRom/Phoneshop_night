package com.reaksa.learn.phoneshope_night.service.Imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reaksa.learn.phoneshope_night.entity.Brand;
import com.reaksa.learn.phoneshope_night.repository.BrandRepository;
import com.reaksa.learn.phoneshope_night.service.BrandService;

@Service
public class BrandServiceImp implements BrandService {
	
	@Autowired
	private BrandRepository brandRepository;
	
	@Override
	public Brand create(Brand brand) {
		return brandRepository.save(brand);
	}

}
