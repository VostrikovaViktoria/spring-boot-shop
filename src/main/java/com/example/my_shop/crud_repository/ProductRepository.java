package com.example.my_shop.crud_repository;

import com.example.my_shop.Entity.Product;
import com.example.my_shop.Entity.ProductType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

    public List<Product> findProductByProductType(ProductType productType);
}
