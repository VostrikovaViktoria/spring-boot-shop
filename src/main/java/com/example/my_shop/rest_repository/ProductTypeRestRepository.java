package com.example.my_shop.rest_repository;

import com.example.my_shop.Entity.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductTypeRestRepository extends JpaRepository<ProductType, Long> {

}
