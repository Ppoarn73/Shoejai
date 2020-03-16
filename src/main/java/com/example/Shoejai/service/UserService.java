package com.example.Shoejai.service;

import com.example.Shoejai.model.User;
import com.example.Shoejai.repository.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository repository){
        this.userRepository = repository;
    }

    public List<User> retrieveUsers(){
        return userRepository.findAll();
    }
    public List<User> retrieveUsers(ObjectId _id){
        return userRepository.findById(_id);
    }

    public List<User> getUserName(String name){
        return userRepository.findByName(name);
    }
    public User createUser(User user) {
        return userRepository.save(user);
    }
//    public Optional<User> updateUser(ObjectId ID,User user){
//        Optional<User> userOptional = usersRepository.findById(ID);
//        if (!userOptional.isPresent()){//.isPresent ดูว่ามันมีค่าไหม
//
//        }
//        return null;
//    }
}
