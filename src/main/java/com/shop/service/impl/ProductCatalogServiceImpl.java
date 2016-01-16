package com.shop.service.impl;

import com.shop.entity.ProductCatalog;
import com.shop.repository.ProductCatalogRepository;
import com.shop.service.ProductCatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by malex on 12.01.16.
 */
@Service
public class ProductCatalogServiceImpl implements ProductCatalogService {

    @Autowired
    private ProductCatalogRepository repository;

    @Override
    public List<ProductCatalog> getAll() {
        return repository.findAll();
    }

    @Override
    public ProductCatalog get(Long id) {
        return repository.findOne(id);
    }

    @Override
    public void insert(ProductCatalog catalog) {
        repository.saveAndFlush(catalog);
    }

    @Override
    public void delete(Long id) {
        repository.delete(id);
    }

    @Override
    public void update(ProductCatalog catalog) {
        repository.saveAndFlush(catalog);
    }
}
