package com.shop.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by malex on 12.01.16.
 */
@Entity
@Table(name = "product_subcatalog")
public class ProductSubCatalog implements Serializable{

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "psc_name")
    private String psc_name;

    @ManyToOne()
    @JoinColumn(name = "catalog_id", nullable = false)
    private ProductCatalog productCatalog;

    public ProductSubCatalog() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPsc_name() {
        return psc_name;
    }

    public void setPsc_name(String psc_name) {
        this.psc_name = psc_name;
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductSubCatalog that = (ProductSubCatalog) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (productCatalog != null ? !productCatalog.equals(that.productCatalog) : that.productCatalog != null)
            return false;
        if (psc_name != null ? !psc_name.equals(that.psc_name) : that.psc_name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (psc_name != null ? psc_name.hashCode() : 0);
        result = 31 * result + (productCatalog != null ? productCatalog.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ProductSubCatalog{" +
                "id=" + id +
                ", psc_name='" + psc_name + '\'' +
                ", productCatalog=" + productCatalog +
                '}';
    }
}

