package com.example.demo.user.respository;

import com.example.demo.user.entity.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<UserModel,String> {
    @Query("{email:?0}")
    Optional<UserModel> findByEmail(String userEmail);
}
