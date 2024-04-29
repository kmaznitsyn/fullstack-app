package com.mmaznitsyn.backend.repository;

import com.mmaznitsyn.backend.data.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Set;

/**
 * Repository class that works with {@link User} entity
 */
public interface UserRepository extends MongoRepository<User, String> {

    User findByEmail(String email);
    
    Set<User> findAllByBirthDate(String birthDate);
}
