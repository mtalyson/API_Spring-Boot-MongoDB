package com.mtalyson.springmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mtalyson.springmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}