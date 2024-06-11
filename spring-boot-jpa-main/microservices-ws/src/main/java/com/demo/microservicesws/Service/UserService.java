package com.demo.microservicesws.Service;

import java.util.Objects;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.demo.microservicesws.Repository.UserRepository;
import com.demo.microservicesws.models.User;

@Service
public class UserService {   
    
    @Autowired                 
    private UserRepository repository;
    
    public ResponseEntity<User> saveUsuario (User regionObj){

        User newRegion = repository.save(regionObj);
        
        if (Objects.nonNull(newRegion)){
        
            return new ResponseEntity<> (newRegion, HttpStatus.OK);
            
        } else {
        
            return new ResponseEntity<> (null, HttpStatus.INTERNAL_SERVER_ERROR);
            
        }

    }
    
    public ResponseEntity<Optional<User>> getUsuarioId ( Integer usuarioid ) {
    
        Optional<User> usuario = repository.findById(usuarioid); 
        return new ResponseEntity<> (usuario, HttpStatus.OK);
    }

}
