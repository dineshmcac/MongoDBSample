package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.demo.Users;


public interface MongoRepository1 extends MongoRepository<Users, Integer>{

}
