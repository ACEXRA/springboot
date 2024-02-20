package com.example.demo.user.respository;

import com.example.demo.user.entity.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserModel,String> {
}
