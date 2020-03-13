package com.example.Shoejai.repository;


import com.example.Shoejai.model.Shoe;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ShoeRepository extends MongoRepository<Shoe, String> {

}
