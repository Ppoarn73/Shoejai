package com.example.Shoejai.Controller;

import com.example.Shoejai.Model.Shoe;
import com.example.Shoejai.Repository.ShoeRepository;
import com.example.Shoejai.Service.ShoeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired // การสร้าง obj. เหมือน new
            ShoeService shoeService;

@RequestMapping("/por") // annotation นี้จะทำให้ class นี้กลายเป็น RestController
    public String Hello(){

    return ("Hello Por");
}
    @RequestMapping("/data")
    public List<Shoe> getAlldata(){
    return shoeService.getAllData();
    }

}
