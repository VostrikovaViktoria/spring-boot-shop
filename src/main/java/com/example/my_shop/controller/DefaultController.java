package com.example.my_shop.controller;

import com.example.my_shop.Entity.Product;
import com.example.my_shop.Entity.ProductType;
import com.example.my_shop.crud_repository.ProductRepository;
import com.example.my_shop.rest_repository.ProductTypeRestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class DefaultController {

    @Autowired
    ProductTypeRestRepository productTypeRepository;

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/")
    public String indexView(Model model){
        List<ProductType> types = productTypeRepository.findAll();
        model.addAttribute("types", types);
        return "index";
    }
}
