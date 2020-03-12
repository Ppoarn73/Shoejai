package com.example.Shoejai.Model;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data //lombok = ทำ get/set
@Document(collection = "Shoe") //อ้างอิงว่าอยู่ collection ไหน
public class Shoe {

    @Id //บอก id ของ model
    private ObjectId _id;
    private String Brand;
    private  String Series;
    private double Price;
    private String Size;
    private String Color;



}
