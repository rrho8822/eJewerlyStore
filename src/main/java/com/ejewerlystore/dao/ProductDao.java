package com.ejewerlystore.dao;

import com.ejewerlystore.model.Product;

import java.util.List;


public interface ProductDao {

    List<Product> getProductList();

    Product getProductById(int id);

    void addProduct(Product product);

    void editProduct(Product product);

    void deleteProduct(Product product);
}
