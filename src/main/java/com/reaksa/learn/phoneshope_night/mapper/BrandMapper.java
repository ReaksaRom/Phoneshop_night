package com.reaksa.learn.phoneshope_night.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.reaksa.learn.phoneshope_night.dto.BrandDTO;
import com.reaksa.learn.phoneshope_night.entity.Brand;

@Mapper
public interface BrandMapper {
	BrandMapper INSTANCE = Mappers.getMapper(BrandMapper.class);
	Brand toBrand(BrandDTO brandDTO);
	BrandDTO toBrandDTO(Brand brand);

}
