package com.reaksa.learn.phoneshope_night.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reaksa.learn.phoneshope_night.entity.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer> {
	List<Brand> findByNameContains(String name);
}
