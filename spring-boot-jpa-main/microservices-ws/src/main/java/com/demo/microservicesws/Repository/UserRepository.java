package com.demo.microservicesws.Repository;

import com.demo.microservicesws.models.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Integer>{
    
}
