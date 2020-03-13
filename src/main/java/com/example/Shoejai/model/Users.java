package com.example.Shoejai.model;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data //lombok = ทำ get/set
@Document("Users")
public class Users {
    @Id
    private ObjectId ID;
    private String Password;
    private String Name;
    private Date BirthDate;
    private String Age;
    private String Gender;
    private String Address;
    private String Country;

}
