package com.shop.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by malex on 12.01.16.
 */

@Entity
@Table(name = "product_catalog")
public class ProductCatalog implements Serializable {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "pc_name")
    private String pc_name;

    public ProductCatalog() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPc_name() {
        return pc_name;
    }

    public void setPc_name(String pc_name) {
        this.pc_name = pc_name;
    }

    @Override
    public String toString() {
        return "ProductCatalog{" +
                "id=" + id +
                ", pc_name='" + pc_name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductCatalog that = (ProductCatalog) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (pc_name != null ? !pc_name.equals(that.pc_name) : that.pc_name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (pc_name != null ? pc_name.hashCode() : 0);
        return result;
    }
}
