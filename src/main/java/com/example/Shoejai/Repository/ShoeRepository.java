package com.example.Shoejai.Repository;


import com.example.Shoejai.Model.Shoe;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface ShoeRepository extends MongoRepository<Shoe, String> {

}
