package com.example.my_shop.crud_repository;

import com.example.my_shop.Entity.Product;
import com.example.my_shop.Entity.ProductType;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductTypeCrud extends CrudRepository<ProductType, Long> {
}
