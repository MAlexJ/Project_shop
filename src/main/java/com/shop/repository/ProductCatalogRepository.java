package com.shop.repository;

import com.shop.entity.ProductCatalog;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by malex on 12.01.16.
 */
public interface ProductCatalogRepository extends JpaRepository<ProductCatalog, Long> {
}