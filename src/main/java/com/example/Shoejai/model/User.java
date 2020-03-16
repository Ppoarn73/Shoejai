package com.example.Shoejai.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Date;

@Data //lombok = ทำ get/set
@Document("User")
public class User {

    @Id
    private ObjectId _id;
    private String password;
    private String name;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate birthday;
    private int age;
    private String gender;
    private String address;
    private String country;


}
