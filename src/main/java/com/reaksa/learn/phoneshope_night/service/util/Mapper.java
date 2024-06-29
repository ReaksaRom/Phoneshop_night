package com.reaksa.learn.phoneshope_night.service.util;
import com.reaksa.learn.phoneshope_night.dto.BrandDTO;
import com.reaksa.learn.phoneshope_night.entity.Brand;

public class Mapper {
	public static Brand toBrand(BrandDTO dto) {
		Brand brand = new Brand();
		brand.setId(dto.getId());
		brand.setName(dto.getName());
		return brand;
	}

}
