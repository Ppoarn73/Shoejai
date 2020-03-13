package com.example.Shoejai.service;

import com.example.Shoejai.model.Shoe;
import com.example.Shoejai.repository.ShoeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoeService {

    @Autowired // การสร้าง obj. เหมือน new
            ShoeRepository shoeRepository;

    public List<Shoe> getAllData(){
        return shoeRepository.findAll(); // check all data

    }
}
