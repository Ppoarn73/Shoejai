package com.example.Shoejai.Service;

import com.example.Shoejai.Model.Shoe;
import com.example.Shoejai.Repository.ShoeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
public class ShoeService {

    @Autowired // การสร้าง obj. เหมือน new
            ShoeRepository shoeRepository;

    public List<Shoe> getAllData(){
        return shoeRepository.findAll(); // check all data

    }
}
