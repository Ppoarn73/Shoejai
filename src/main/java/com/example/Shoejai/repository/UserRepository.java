package com.example.Shoejai.repository;

import com.example.Shoejai.model.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {
    List<User> findByName(String name);

    List<User> findById(ObjectId id);

    //Optional<User> findById(ObjectId id);
}
