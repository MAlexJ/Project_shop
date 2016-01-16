package com.shop.service;

import com.shop.entity.ProductCatalog;

import java.util.List;

/**
 * Created by malex on 12.01.16.
 */
public interface ProductCatalogService {
    List<ProductCatalog> getAll();

    ProductCatalog get(Long id);

    void insert(ProductCatalog catalog);

    void delete(Long id);

    void update(ProductCatalog catalog);
}
