package com.reaksa.learn.phoneshope_night.service.Imp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reaksa.learn.phoneshope_night.entity.Brand;
import com.reaksa.learn.phoneshope_night.exception.ResourceNotFoundException;
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

	@Override
	public Brand getById(Integer id) {
		return brandRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Brand", id));
	}

	@Override
	public Brand update(Integer id, Brand brandUpdate) {
		Brand brand = getById(id);
		//brand.setId(brandUpdate.getId());
		brand.setName(brandUpdate.getName());
		return brandRepository.save(brand);
	}


}
