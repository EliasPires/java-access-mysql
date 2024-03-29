package model.dao;

import model.entities.Seller;

import java.util.List;

public interface SellerDao {

    void insert(Seller obj);
    void update(Seller obj);
    void deleteById(Seller id);
    Seller findById(Seller id);
    List<Seller> findAll();
}
